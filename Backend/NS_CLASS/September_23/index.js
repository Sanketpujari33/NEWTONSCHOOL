const express = require('express');
const app = express();
app.use(express.json())
//-----------------------------------------------------------------------------------------------------------------------
const mongooose = require('mongoose');
const url = "mongodb://localhost:27017/cortana_db";

//-----------------------------------------------------------------------------------------------------------------------

mongooose.connect(url).then((value) => {
    console.log('Sucessfully Connected to DB', value);
}).catch((e) => {
    console.log('Error is -', e);
});

//------------------------------------------------------------------------------------------------------------------------

const Schema = mongooose.Schema

//------------------------------------------------------------------------------------------------------------------------

const cs = new Schema(
    {
        NAME: {
            type: String
        },
        SUBJECT: {
            type: String
        },
        MARKS: {
            type: Number
        }
    }, { versionKey: false });

//---------------------------------------------------------------------------------------------------------------------

const marksSchema = mongooose.model('marks', cs);

//------------------------------------------------------------------------------------------------------------------

// marksSchema.find((err,data)=>{
//     if(err){
//         console.log('An Error occurred -', err);
//     }else{
//         console.log('Data is:- ',data);       
//     }
// });

//-------------------------------------------------------------------------------------------------------------------

// marksSchema.create({NAME:"Sanket", SUBJECT:"JAVA", MARKS:78}).then((data)=>{
//     console.log("Data is Inserted");
// })

//-------------------------------------------------------------------------------------------------------------------


// marksSchema.findById('63441f961d974d3ebc52c5ad', (err,data)=>{
//     console.log(data._id);
// })

//------------------------------------------------------------------------------------------------------------------

// marksSchema.find({MARKS:{
//     // "&gtl":50
//     "$lt":50
// }}.sort({MARKS:'-1'}).exec((err,data)=>{
//     if(err){
//         console.log('An Error occurred -', err);
//     }else{
//         console.log('Data is:- ',data);       
//     }
// });

//-------------------------------------------------------------------------------------------------------------------

// marksSchema.findByIdAndUpdate('63441f961d974d3ebc52c5ad',{NAME:"SANKETPUJARI",MARKS: 675786776},(err,data)=>{
//     console.log(data);

// })

//-------------------------------------------------------------------------------------------------------------------

// marksSchema.findOneAndUpdate({NAME:"SANKETPUJARI",MARKS: 6756},(err,doc,res)=>{
//     console.log(doc);
//     console.log(res);


// })


//-------------------------------------------------------------------------------------------------------------------


// marksSchema.findByIdAndDelete({NAME:"Sanket", SUBJECT:"JAVA", MARKS:78},(err,data)=>{
//     console.log(data);

// })

//-------------------------------------------------------------------------------------------------------------------

// marksSchema.findByOneAndDelete({NAME:"Sanket", SUBJECT:"JAVA", MARKS:78},(err,data)=>{
//     console.log(data);

// })

//-------------------------------------------------------------------------------------------------------------------


app.get('/marks', async (req, res) => {
    const id = req.query.id;
    if (id) {
        const marks = await marksSchema.findById(id)
        res.status(200).json(marks)
        return;
    }
    // const body=req.body;
    // if(body){
    //     const marks=await marksSchema.find(body)
    //     res.status(200).json(marks)
    //     return;
    // }
    const marks = await marksSchema.find()
    res.status(200).json(marks)
    return;
})

//-------------------------------------------------------------------------------------------------------------------


app.listen(8080, (err) => {
    if (err) console.log('Error is', err);
    console.log('Server is up');
});


//-------------------------------------------------------------------------------------------------------------------