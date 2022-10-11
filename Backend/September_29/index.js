const express = require('express');
const app = express();
app.use(express.json())
//--------------------------------Bcrypt---------------------------------------------------------

const bcrypt=require('bcrypt');

//---------------------------------LOGIN---------------------------------------------------------------------------

const jwt=require('jsonwebtoken');
const secretKey="Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398";

//-------------------------------------MONGOOSE-----------------------------------------------
const mongooose = require('mongoose');
const url = "mongodb://localhost:27017/cortana_db";
//--------------------------------------------------------------------------------------------------------------------
mongooose.connect(url).then((value) => {
    console.log('Sucessfully Connected to DB', value);
}).catch((e) => {
    console.log('Error is -', e);
});
//----------------------------------------------------------------------------------------------------------------------
const UserSchema=require('./UserSchema');
//------------------------------------------------------------------------------------------------

// app.post('/register',async(req, res)=>{
//     const body=req.body;
//     if(!body.name || !body.email || !body.password){
//         res.status(400).json({massage:"Data is Ivalid"})
//         return;
//     }
//     const emailAlreadyExists=await UserSchema.findOne({email:body.email});
//     if(emailAlreadyExists){
//         res.status(400).json({massage:"Email Is Already registered"});
//         return;
//     }
//     await UserSchema.create(body);
//         res.status(201).json({massage:"Registration is Completed"});
//         return;
// })

//--------------------------------Bcrypt---------------------------------------------------------

app.post('/register',async(req, res)=>{
    const body=req.body;
    if(!body.name || !body.email || !body.password){
        res.status(400).json({massage:"Data is Ivalid"})
        return;
    }
    const emailAlreadyExists= await UserSchema.findOne({email:body.email});
    if(emailAlreadyExists){
        res.status(400).json({massage:"Email Is Already registered"});
        return;
    }
    body.password=await bcrypt.hash(body.password,6)
    await UserSchema.create(body);
        res.status(201).json({massage:"Registration is Completed"});
        return;
})
//---------------------------------LOGIN---------------------------------------------------------------------------


app.post('/login',async (req, res)=>{
    // console.log(req.headers.authorization);
    const body=req.body;
    if(!body.email || !body.password){
        res.status(400).json({massage:"Login Data is Ivalid"})
        return;
    }
    const isUserExists= await UserSchema.findOne({email:body.email});
    if(!isUserExists){
        res.status(404).json({massage:"User Not Found"});
        return;
    }
    const isPasswordCorrect=await bcrypt.compare(body.password,isUserExists.password);
    if(!isPasswordCorrect){
        res.status(401).json({massage:"Username/Password is incorrect"});
        return;
    }
    const userToken=jwt.sign({email:body.email},secretKey,{expiresIn:"1d"});
    res.status(200).json({token:userToken})
})

//-------------------------------------------------------------------------------------------------------------------
    const tokenVerification=require("./tokenVerification")
//-------------------------------------------------------------------------------------------------------------------
app.get('/crucial-data',tokenVerification,async(req,res)=>{
    console.log('Verification completed');
    res.json({massage:"Verifiction Comleted"});
})
//-------------------------------------------------------------------------------------------------------------------

app.listen(8080, (err) => {
    if (err) console.log('Error is', err);
    console.log('Server is up');
});

//-------------------------------------------------------------------------------------------------------------------