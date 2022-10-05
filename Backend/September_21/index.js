const express=require('express');
const app=express();

app.set('views','./views');
app.set('view engine','ejs');

app.get('/home',(req,res)=>{
    res.render('home');
    res.end();
});

// app.get('/portfolio',(req,res)=>{
//     res.render('portfolio');
//     res.end();
// });

app.listen(8080,(err)=>{
    if(err)console.log('Error is', err);
    console.log('Server is up.');
});



