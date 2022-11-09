

// Mongo DB 
//  mosql not only sql
// open sourece data base 
//roboust
//scaleble
//load balancing help
// fixble -schema
//shading suport

//Drobagase
//complex  transtion- pay-acc-credit-debit
//ACID propartis not mentan -Atomation , contance, Isolation, durablity
//Joins -not soported
//version -3.2- read joins are soported, wole not sorted jions
//modification sholde be perfrom on all server or noun
//---------------------------------------------------------------------------------------------------------------------------------------------------

const emailValidator = require('email-validator');
const mongoose = require('mongoose');
// const createSecretKey = require('crypto');
const bcrypt = require('bcrypt');
const db_link = 'mongodb://localhost:27017/cortana_db';
mongoose.connect(db_link)
    .then((db) => {
        // console.log(db);

        console.log('db conected');
    })
    .catch((err) => {
        console.log(err);

    })
const userSchema = mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true,
        unique: true,
        validate: function () {
            return emailValidator.validate(this.email);
        }
    },
    password: {
        type: String,
        required: true,
        minLength: 10
    },
    confirmPassword: {
        type: String,
        required: true,
        minLength: 10,
        validate: function () {
            return this.confirmPassword === this.password
        }
    }
})

//--------------------------------------------------------------------------------------------------------------------------
// MONGOOSE HOOKS
// TYPE OF HOOKS-->Pre NAd Post Hooks

// pre post hooks
//befire save event occurs in db
userSchema.pre('save', () => {
    // console.log('before saving in DB');
    this.confirmPassword = undefined;

})
//----------------------------------------------------------------------------------------------------------------

//HASHING ------------ protect password data
//encryption password-->hashing-Algo-->abc3d212
// encryption -- conrvred -deccryotion that is very resky
//SecretKey and solt
//--------------------------------------------------------------------------------------------------------------------------------
// userSchema.pre('save',async function(){
//     let salt=await bcrypt.genSalt();
//     let hashedSring=await bcrypt.hash(this.password,salt);
//     this.password=hashedSring;
// })



// //after save event occurs in db
// userSchema.post('save',()=>{
//     console.log('after saving in DB');

// })


//model

const userModel = mongoose.model('userModel', userSchema);
module.exports = userModel;
