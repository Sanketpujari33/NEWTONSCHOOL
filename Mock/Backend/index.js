const express = require('express');
const app=express();

app.get('/',(req,res)=>{
    res.send("This is very good")
});


app.listen(8000,function(){
    console.log(`server listening on port`); 
});
