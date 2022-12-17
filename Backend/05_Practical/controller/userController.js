const express = require('express');
const { model } = require('mongoose');
const userModel = require('../models/userModels');


module.exports.getUser = async function getUser(req, res) {
    let id = req.params.id;
    let user = await userModel.findById(id);
    if (user) {
        return res.json(user)
    } else {
        return res.json({
            massage: 'user not found',
        })
    }
}

module.exports.updateUser = async function updateUser(req, res) {
    try {
        let id = req.params.id;
        let user = await userModel.findById(id);
        let dataUpdate = req.body;
        if (user) {
            const keys = [];
            for (key in dataUpdate) {
                keys.push(key);
            }
            for (let index = 0; index < keys.length; index++) {
                user[keys[index]] = dataUpdate[keys[index]];
            }
            const updataData = await user.save();
            res.json({
                massage: "Data Updated Successfully",
                users: user
            });
        }
        else {
            res.json({
                massage: "user not found",
                users: user
            });
        }
    } catch (err) {
        res.json({
            massage: err.message
        });
    }
}

module.exports.deleteUser = async function deleteUser(req, res) {
    try {
        let id = req.params.id;
        let isUser = await userModel.findById(id);
        if (isUser) {
            let user = await userModel.findByIdAndDelete(id)
            return res.status(201).json({
                massage: "Data has been deleted",
                data: user
            })
        } else {
            return res.json({
                massage: 'user not found'
            })
        }
    } catch (err) {
        res.json({
            massage: err.message,
        })
    }
}

module.exports.getAllUser = async function getAllUser(req, res) {
    try {
        let users = await userModel.find();
        if (!users) {
            res.json({
                message: "user not prasent",
            })
        } else {
            res.json({
                massage: 'user retrieved',
                data: users
            })
        }
    }
    catch (err) {
        res.json({
            message: err.massage,
        })
    }
}

module.exports.updateProfileImage= function updateProfileImage(req, res){
    res.json({
        message:'file uploaded Succesfully'
    })
}

// function setCookies(req, res){
//     // res.setHeader('Set-Cookie','login=true');
//     // res.cookie('login',true,{maxAge:1000*60*60*24, secure:true, httpOnly:true});
//     res.cookie('isPrimeMember',true,{maxAge:1000*60*60*24, secure:true, httpOnly:true});

//     res.send('cookies has been set');
// }

// function getCookies(req, res){
//     let cookies=req.cookies.login;
//     console.log(cookies);
//     res.send('cookies receved');
// }



