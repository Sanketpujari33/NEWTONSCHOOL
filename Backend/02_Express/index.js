const _ = require('lodash');
// let db=require('./poblic/index.html');

// let num=_.random(0,20);
// console.log(num);

//------------------------------------Express-----------------------------------------------------------------

//1.Syntax Simple write
//2.code read
//3.upate
//4.req,res,routing
//5.secure
//6. fast
//7.server side logic

const express = require('express');
const { request } = require('express');

const app = express();

//middleware Function post , front->json
app.use(express.json())

app.listen(3000);
//-------------------------------------httpMethods----------------------------------------------------------

//HTTP METHOD
//GET :- To get Data from clint
//post:- To Send Data from DataBase
//PATCH:- To Udate Data From  Database
//DELETE:- To Delete Data From Database


let users = [
    {
        id: 1,
        name: "Sanket",
    },
    {
        id: 2,
        name: "Shekhar",
    },
    {
        id: 3,
        name: "Vishal",
    }]
    ;

// app.get('/users', (req,res)=>{
//     console.log(req.query);
//     res.send(users);
// });
//------------------------------------------------------------------------------------------------------------------
// post -> To Send Data From Frontend to Backend
// app.post('/users',(req,res)=>{
//     console.log(req.body);
//     users=req.body;
//     res.json({massage:"Data received Successfully", user:req.body})
// })
//-------------------------------------------------------------------------------------------------------------
//Update->patch
// app.patch('/users',(req,res)=>{
//     console.log('req.body->', req.body);
//     //Updata  data in users obj
//     let dataUpdate=req.body;
//     for(key in dataUpdate){
//         users[key]=dataUpdate[key]
//     }
//     res.json({
//         massage:"Data Updated Successfully"
//     })
// })
//--------------------------------------------------------------------------------------------------------------
// Delete Data
// app.delete('/users',(req, res)=>{
//     users={};
//     res.status(204).json({
//         massage:"Data has been deleted"
//     })
// })
//-----------------------------------------------------------------------------------------------------------------
//params

// app.get('/user/:userName',(req,res)=>{
//     console.log(req.params.userName);
//     console.log(req.params);
//     res.send("Revece Data from Prams");


// })
//--------------------------------------------------------------------------------------------------------------
// APT-->Application Programming InterFace
// request
//client->->HTTP Server->-> DATABASE
// response
//client<-<-HTTP Server<-<- DATABASE
//communication
//multiple platForm
//language Independent

// REST API (Representational State Transfer API)
//RULES
//Response Should be some, respectve of requset platfrom
//Roust should be on the base of nouns(name,place,animal,object,things,anything)
//HTTP Methods should be used for doing opration on these route(HTTP VERBS:-get,post,patch,delete)
//ALways JSON Format
//statelass

//Resson for use REST API
//95% used API on Commany
//Community Sopport
//
// format REST API 
//SOAP
//GRAPH
// OL


//--------------------------------------------------------------------------------------------------------
//MOUNTING IN EXPRESS
//Readable
//Syntactcally
const userRouter = express.Router();
app.use('/user', userRouter);
const authRouter=express.Router();
app.use("/auth",authRouter)

userRouter
    .route('/')
    .get(getUser)
    .post(postUser)
    .patch(updateUser)
    .delete(deleteUser)
    userRouter.route('/:id').get(getUserById);
//Singup API
authRouter
.route('/signup')
.get(middleware1,getSignup,middleware2)
.post(postSingup)



function getUser(req, res) {
    res.send(users);
}

function postUser(req, res) {
    console.log(req.body);
    users = req.body;
    res.json({ massage: "Data received Successfully", user: req.body })
}

function updateUser(req, res) {
    console.log('req.body->', req.body);
    //Updata  data in users obj
    let dataUpdate = req.body;
    for (key in dataUpdate) {
        users[key] = dataUpdate[key]
    }
    res.json({
        massage: "Data Updated Successfully"
    })
}


function deleteUser(req, res) {
    users = {};
    res.status(204).json({
        massage: "Data has been deleted"
    })
}

function getUserById(req, res) {
    console.log(req.params.id);
    let paramId = req.params.id;
    let obj = {};
    for (let index = 0; index < users.length; index++) {
        if (users[index]['id'] == paramId) {
            obj = users[index];
        }
    }
    res.json({ message: "req recevived", data: obj })
}


function middleware1(req, res, next){
    console.log('middlewar1 encountered');
    next();
}
function middleware2(req, res){
    console.log('middlewar2 encountered');
    // res.json({
    //     massage:"Midddleware 2 ended req/res cycle"
    // })
    // next();
    console.log("Midddleware 2 ended req/res cycle");
    
    res.sendFile('/poblic/index.html',{root:__dirname})
}

function getSignup(req,res,next){
    // res.sendFile('/poblic/index.html',{root:__dirname})
    next();
}
function postSingup(req,res){
    let obj=req.body;
    console.log('Bakend',obj);
    
    console.log('backend',obj);
    
    res.json({
        massage:"User Sign Up",
        data:obj,
    });
}

//--------------------------------------------------------------------------------------------------------------

// app.get('/',(req, res)=>{
//     res.sendFile('./views/index.html',{root:__dirname});
// })


// app.get('/protfolio',(req, res)=>{
//     res.sendFile('./views/protfolio.html',{root:__dirname});
//     })

// //redirects
// app.get('/protfolio-us',(res,err)=>{
// res.redirect('./views/protfolio.html')
// })

// //404 PAGE
// app.use((req,res)=>{

//     res.status(404).sendFile('./views/404.html',{root:__dirname});
// })




//---------------------------MIDDLEWARE FUNCTION--------------------------------------------

// Types Of Middlwware function

// app.use()-->globle middleware function  
// allrequste are ran the globle midd fun 
// respective type of requste or route 

//app.methods->router path -->spcific path middleware functtion

// benefiits
//1 Error handaling-function (err, req, res)=>{}
//404 pages return 
//logger function 
//is a cands of middlewere to parase jeson to js object
// (app.use(express.json());---json- convert to js object -to )


// How to use 
//function(req, res, middleware(next())=>{
    // process
    // naxt()-> that time excute the next() call that time call a function middleware
// })



