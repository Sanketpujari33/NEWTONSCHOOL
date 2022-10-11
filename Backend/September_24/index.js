const express = require('express');
const app = express();
app.use(express.json())
//-----------------------------------------------------------------------------------------------------------------------
const mongooose = require('mongoose');
const url = "mongodb://localhost:27017/cortana_db";

//--------------------------------------------------REAT-LIMITING-----------------------------------------------------------------

const rateLimiter=require('express-rate-limit');
const apiLimiter=rateLimiter({
    max:5,
    windowMs:10000,
    massage:"Plase try again later."
});
//-------------------------------------------------------------------------------------------------------------------------
app.use(express.json());
app.use(apiLimiter)
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
        },
        IS_DELETED: {
            type: Boolean,
            default: false
        }
    }, { versionKey: false });

//---------------------------------------------------------------------------------------------------------------------

const marksSchema = mongooose.model('marks', cs);

//------------------------------------------------------------------------------------------------------------------

app.post('/marks-with-filters', async (req, res) => {
    const body = req.body;
    if (body.NAME || body.MARKS || body.SUBJECT) {
        const marks = await marksSchema.find(body)
        res.status(200).json(marks)
        return;
    }
    res.status(400).json({ massage: "Filter not found" })
})

//-------------------------------------------------------------------------------------------------------------------

app.post('/add-marks', async (req, res) => {
    const body = req.body;
    console.log(body);
    if (!body.NAME || !body.MARKS || !body.SUBJECT) {
        res.status(400).json({ massage: "Data is Invalid" })
        return;
    }
    marksSchema.create(body);
    res.status(201).json({ massage: "Data Successfully Created" })
})

//-------------------------------------------------------------------------------------------------------------------

app.put('/update-marks', async (req, res) => {
    const body = req.body;
    console.log('update-marks has this', body);

    if (!body.id) {
        res.status(400).json({ massage: "ID is absent" })
        return;
    }
    const id = body.id;
    const updateMarksEntity = await marksSchema.findByIdAndUpdate(id, body)
    res.status(200).json({ massage: "Data Successfully Updated" })
    return;
})


//-------------------------------------------------------------------------------------------------------------------

app.delete('/delete', async (req, res) => {
    const id = req.query.id;
    if (!id) {
        res.status(404).json({ massage: "Id is not present is body" })
        return;
    }
    console.log('Deletion for this id: ', id);
    const deleteEntity = await marksSchema.findByIdAndDelete(id);
    if (!deleteEntity) {
        res.status(400).json({ massage: "Entity is not present into DB" });
        return;
    }
    res.status(200).json(deleteEntity);
})

//----------------------------------SOFT-DELETE--------------------------------------------------------------------------
// marksSchema.updateMany({},{"IS_DELETED":false},{multi:true},(data)=>{
//     console.log('Updation of is_deleted is done', data);

// })

//----------------------------------SOFT-DELETE---------------------------------------------------------------------------------

app.delete('/delete-soft', async (req, res) => {
    const id = req.query.id;
    if (id) {
        res.status(404)({ massage: "Id is not present in body" })
        return;
    }
    console.log('Deletion for this id: ', id);
    const updatedEntity = await marksSchema.findByIdAndUpdate(id,{ IS_DELETED: true })
    res.status(200).json({ massageL: "Date got deleted" });

})

//-----------------------------------------PAGINATION-----------------------------------------------------------------

app.get('/marks-pages',async(req,res)=>{
    const page_num=req.query.page_num;
    if(!page_num){
        res.status(400).json({massage:"Page Number is required"});
        return;
    }
    const marks= await marksSchema.find().limit(10).skip((page_num-1)*10).exec();
    if(marks.length===0){
        res.status(400).json({massage:"Page Number is invalid"});
    }
    const total_records=await marksSchema.count();
    res.json({total_records,marks});
})


//-------------------------------------------------------------------------------------------------------------------

app.listen(8080, (err) => {
    if (err) console.log('Error is', err);
    console.log('Server is up');
});


//-------------------------------------------------------------------------------------------------------------------
