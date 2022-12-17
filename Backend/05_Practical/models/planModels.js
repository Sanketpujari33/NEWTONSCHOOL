//Mongose on through connect mongodb
const mongoose = require('mongoose');
// const emailValidator = require('email-validator');
const createSecretKey = require('crypto');
// const bcrypt = require('bcrypt');
const db_link = 'mongodb+srv://admin:j4pwK00V40FNMQcx@cluster0.b2oreuv.mongodb.net/?retryWrites=true&w=majority';
mongoose.connect(db_link)
    .then((db) => {
        // console.log(db);
        console.log('plans db conected');
    })
    .catch((err) => {
        console.log(err);
    })
const planSchema = mongoose.Schema({
    name: {
        type: String,
        required: true,
        unique: true,
        maxLength: [20, "plan name should not exceed more than 20 characters"]
    },
    duration: {
        type: Number,
        required: true
    },
    price: {
        type: Number,
        required: [true, "price not entered"],
    },
    ratingsAverage: {
        type: Number,
    },
    discount: {
        type: Number,
        validate: [function () {
            return this.discount < 100;
        }, "discount should not exceed price"],
    },
    Reviews: {
        type: Number,
        default:0,
    }
});

//model
module.exports = mongoose.model('planModel', planSchema);