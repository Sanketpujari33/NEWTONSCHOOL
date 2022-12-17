const express = require('express');
const app = express();
const userRouter=express.Router();
app.use(express.json());
const db=require('../models/config')
const {getAllUser}=require('../controller/usersController');


// user oprations
userRouter
.route('/').get(getAllUser);

module.exports = userRouter;