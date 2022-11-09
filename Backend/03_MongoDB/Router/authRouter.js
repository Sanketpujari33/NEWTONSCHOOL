const express = require('express');
const app = express();
const userModel = require('../models/userModels')
const cookieParse = require('cookie-parser');
const jwt=require('jsonwebtoken');
// jwt--> json web Token
//jwt-> HEADER ->Algorthum
//      PlayLoad-> uid -uniqe id
//      Signature-> secretKey and uid and Algorthum
const jwt_key=require('../secrets');

const authRouter = express.Router();
app.use(cookieParse());
app.use("/auth", authRouter)
//------------------------------------------------------------------------------------------------------------
// CRUD 

authRouter
    .route('/signup')
    .get(middleware1, getSignup, middleware2)
    .post(postSingup)

authRouter
    .route('/login')
    .post(loginUser)

function middleware1(req, res, next) {
    console.log('middlewar1 encountered');
    next();
}
function middleware2(req, res) {
    console.log('middlewar2 encountered');
    res.json({
        massage:"Midddleware 2 ended req/res cycle"
    })
    next();
    console.log("Midddleware 2 ended req/res cycle");

    res.sendFile('/poblic/index.html', { root: __dirname })
}

function getSignup(req, res, next) {
    res.sendFile('/poblic/index.html',{root:__dirname})
    next();
}
async function postSingup(req, res) {
    let dataObj = req.body;

    let user = await userModel.create(dataObj);
    res.json(
        {
            massage: "User Sign Up",
            data: user,
        });
}

async function loginUser(req, res) {
    try {
        let data = req.body;
        if (data.email) {
            let user = await userModel.findOne({ email: data.email });
            if (user) {
                //bcrypt -> compare
                console.log(user.pas);
                
                if (user.password == data.password) {
                    let uid=user['_id'];
                    
                    let jwt_id=jwt.sign({payload:uid},jwt_key);
                    res.cookie('login',jwt_id,{httpOnly:true});
                    // return res.json({
                    //     massage: 'User has logged in',
                    //     userDetails: data
                    // })
                } else {
                    return res.json({
                        massage: 'Wrong credentials'
                    })
                }
            }
        } else {
            return res.json({
                massage: 'Usre Not found'
            })
        }
    } catch (err) {
        return res.status(500).json({
            massage: err.massage
        })
    }
}
module.exports = authRouter;