const _ = require('lodash');
const cookieParse = require('cookie-parser');
const express = require('express');
const app = express();
var cors=require('cors');
app.use(cors());
// app.set("view engine", "ejs")
app.use(express.static('public/build'));

app.use(express.json());

const port=process.env.PORT || 5000;
app.listen(port,function(){
    console.log(`server listening on port ${port}`); 
});

app.use(cookieParse());

const userRouter = require('./Router/userRouter');
const planRouter=require('./Router/planRouter');
const reviewRouter=require('./Router/reviewRouter');
const bookingRouter=require('./Router/bookingRouter');


//middleware Function post , front->json
app.use('/user', userRouter);
app.use('/plans', planRouter);
app.use('/review',reviewRouter);
app.use('/booking',bookingRouter);