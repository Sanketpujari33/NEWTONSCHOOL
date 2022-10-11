const http = require('http');
const express = require('express');
const cookieParser = require('cookie-parser');

const app = express();
app.use(express.json())
// app.use(validatePhoneNumber);
app.use(cookieParser);
app.use(log);
const server = http.createServer(app);
//---------------------------------------------------------------------------------------------------------------------
app.post('/login',validatePhoneNumber,middlePhoneNumber,(req, res) => {
    const body = req.body;
    console.log('I got this data: ', body.phoneNumber);
    
    console.log('You have been signedup');
    res.cookie('secret_code','1234');
    res.json({
        massage: "Succesfully Signed up "
    });
});
//---------------------------------------------------------------------------------------------------------------------
app.get('./isLogin',(req, res)=>{
    const cookie=req.cookie;
    console.log('cookie is :',cookie);
    if(cookie.secret_code)res.status(200).send({message:"Successful"})
    else res.status(400).send({massage:"Somthing went wrong."})
    
})

//---------------------------------------------------------------------------------------------------------------------

app.get('./random',(res, req)=>{
    console.log('Random Request');
    res.send({
        massage: "Seccessful"
    })
    
})

//-----------------------------------------------------------------------------------------------------------------------

function middlePhoneNumber(req,res,next){
    console.log('I am sanket');
    next();
}
//----------------------------------------------------------------------------------------------------------------------

function validatePhoneNumber(req,res,next){
    const body=req.body;
    if(!body.phoneNumber){
        throw new Error("Phone Number Is Absent.");
    }
    next();
}

//----------------------------------------------------------------------------------------------------------------------------

function log(req,res, next){
    console.log("Path: ",req.path, "body: ",req.body, "header: " ,req.header);
    next();
} 

//----------------------------------------------------------------------------------------------------------------------------

app.get('/random',(req,res)=>{
        console.log('Random requset');
        res.send({
            massage: "Successful"
        })
})

//----------------------------------------------------------------------------------------------------------------------------

server.listen(8080, '127.0.0.1', () => {
    console.log('My Express server is live');
});