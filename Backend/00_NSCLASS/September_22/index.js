const express = require('express');
const app = express();

//-------------------------------------------------------------------------------------------------------------------

const mongooose = require('mongoose');
const url = "mongodb://localhost:27017/cortana_db";

//-----------------------------------------------------------------------------------------------------------------------

mongooose.connect(url).then((value) => {
    console.log('Sucessfully Connected to DB');
}).catch((e) => {
    console.log('Error is -', e);
});

//------------------------------------------------------------------------------------------------------------------------

const Schema = mongooose.Schema;

const cs = new Schema({
    name: {
        type: String,
        require: true
    },
    phone_number: {
        type: String,
        require: true
    }

});

//----------------------------------------------------------------------------------------------------------------------

const userDetails = mongooose.model("User_details", cs);
userDetails.create({
    name:"Sanket Pujari",
    phone_number:"54534353543"
}).then((value)=>{
    console.log('Data is :- ',value);
    
}).catch((e)=>{
    console.log('This went Wrong :- ',e);
    
})

//------------------------------------------------------------------------------------------------------------------------

app.listen(8080, (err) => {
    if (err) console.log('Error is', err);
    console.log('Server is up');
});

//--------------------------------------------------------------------------------------------------------------------