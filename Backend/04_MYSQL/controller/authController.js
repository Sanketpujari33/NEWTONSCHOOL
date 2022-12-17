const userModel = require('../models/userModels')
const jwt = require('jsonwebtoken');
const jwt_key = require('../secrets');
const {sendMail}=require('../utility/nodemailer')