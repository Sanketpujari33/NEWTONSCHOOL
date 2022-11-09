const express = require('express');
const userModel = require('../models/userModels')
const cookieParse = require('cookie-parser')
const app = express();
app.use(express.json());
app.use(cookieParse());

const userRouter = express.Router();
app.use('/user', userRouter);
userRouter
    .route('/')
    .get(protectRoute, getUser)
    .post(postUser)
    .patch(updateUser)
    .delete(deleteUser)

userRouter
    .route('/getCookies')
    .get(getCookies)

userRouter
    .route('/setCookies')
    .get(setCookies);

userRouter.route('/:id').get(getUserById);

(async function createUser() {
    let users = {
        name: 'Sanket pujari',
        email: 'sanketpujari5@gmailcom',
        password: 'sanket3398',
        contirmPassword: 'sanket3398'
    };
    let data = await userModel.create(user);
    console.log(data);

})

async function getUser(req, res) {
    // // let allUser=await userModel.find();
    // let allUser = await userModel.findOne({ name: 'Sanket pujari' });
    let user=await userModel.find();
    if(user){
            return res.json(user)
    }else{
      return res.json({
            massage: 'user not found',
        })
    }
}

function postUser(req, res) {
    console.log(req.body);
    users = req.body;
    res.json({ massage: "Data received Successfully", user: req.body })
}

async function updateUser(req, res) {
    console.log('req.body->', req.body);
    //Updata  data in users obj
    let dataUpdate = req.body;
    let user = await userModel.findOneAndUpdate(dataUpdate)
    // for (key in dataUpdate) {
    //     users[key] = dataUpdate[key]
    // }
    res.json({
        massage: "Data Updated Successfully",
        users: user
    })
}

async function deleteUser(req, res) {
    let dataToBeDeleted = req.body;
    let user = await userModel.findOneAndDelete(dataToBeDeleted)
    res.status(204).json({
        massage: "Data has been deleted",
        data: user
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

//cookise
//in the store data on user browser
function setCookies(req, res) {
    // res.setHeader('Set-Cookie',isLogged=true);
    // res.cookie('isLogged',true,{maxAge:1000*60*60*24, secure:true, httpOnly:true})
    res.cookie('isPrimeMember', true, { maxAge: 1000 * 60 * 60 * 24, secure: true, httpOnly: true })
    res.send('cookies has been set');
}
function getCookies(req, res) {
    let cookise = req.cookie
}

// let flag = false;
function protectRoute(req, res, next) {
    if (req.cookise.isLoggedIn){
        next();

    } else {
        return res.json({
                massage:'opration not allowed'
        });
    }
}


module.exports = userRouter;