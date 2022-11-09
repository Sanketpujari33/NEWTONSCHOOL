const express = require('express');
const userModel = require('../models/userModels')
const jwt=require('jsonwebtoken');
const {jwt_key}=require('../secrets');


//sign up user
module.exports.signup=async function signup(req, res) {
    try{
    let dataObj = req.body;
    console.log(dataObj);
    
    let user = await userModel.create(dataObj);
    if(user){
        return res.json({
                massage: "User Sign Up",
                data:user,
            });
    }else{
        return res.json(
            {
                massage: "error while signing up",
            });
    }
    
    }catch(err){
        res.status(500).json({
            massage:err.massage,
        })
    }
}

//login user
module.exports.login=async function login(req, res) {
    try {
        let data = req.body;
        if (data.email) {
            let user = await userModel.findOne({ email: data.email });
            if (user) {
                //bcrypt -> compare
                if (user.password==data.password) {
                    let uid=user['_id'];
                    let jwt_id=jwt.sign({payload:uid},jwt_key);
                    res.cookies('login',jwt_id,{httpOnly:true});
                    return res.json({
                        massage: 'User has logged in',
                        userDetails: data
                    })
                } else {
                    return res.json({
                        massage: 'Wrong Password'
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

//is Authorised-> to check the user's role [adimin,user, restaurant, delivery boy]

module.exports.isAuthorised=function(roles){
    return function(req,res,next){
        if(roles.include(req.role)===true){
            next();
        }else{
            res.status(401).json({
                massage:"opration not allowed"
            })
        }
    }
}

//protect Router
module.exports.protectRoute=async function protectRoute(req , res, next){
    try{
    let token;
    if(req.cookies.login){
        console.log(req.cookies.login);
        token=req.cookies.login
        let payload=jwt.verify(token,jwt_key);
        if(payload){
            console.log('payload token',payload);
            const user=await userModel.findById(payload.payload);
            req.role=user.role;
            req.id=user.id;
            console.log(req.role);
            console.log(req.id);
            next();
        }else{
            return res.json({
                massage:'Increate Detials'
            });
        }
    } else{
        return res.json({
            massage:'operation not allowed'
        });
}
}catch(err){
        return res.json({
            massage:err.massage,
        });
    }
}
