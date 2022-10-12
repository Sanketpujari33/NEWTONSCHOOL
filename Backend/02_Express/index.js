const _ = require('lodash');

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


let users = {};

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
const userRouter=express.Router();
app.use('/user ')
function postUser(req, res) {
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


function dleteUser(req, res) {
    users = {};
    res.status(204).json({
        massage: "Data has been deleted"
    })
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

