const express = require('express');
const app = express();


app.use(express.json());

const port=process.env.PORT || 5000;
app.listen(port,function(){
    console.log(`server listening on port ${port}`); 
});


const userRouter = require('./router/usreRouter');
app.use('/', userRouter);