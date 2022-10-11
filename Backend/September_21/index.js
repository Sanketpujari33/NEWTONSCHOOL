const express=require('express');
const app=express();
app.set('views','./views');
app.set('view engine','ejs');

//---------------------------------------------------------------------------------------------------------------------
// app.get('/home',(req,res)=>{
//     res.render('home');
//     res.end();
// });
//---------------------------------------------------------------------------------------------------------------------

// app.get('/portfolio',(req,res)=>{
//     res.render('portfolio');
//     res.end();
// });

//---------------------------------------------------------------------------------------------------------------------
// const router=express.Router();
// const portfolioRouter=express.Router();
// const homeRouter=express.Router();
//---------------------------------------------------------------------------------------------------------------------
// homeRouter.get('/home',(req,res)=>{
// // router.get('/home',(req,res)=>{
//     res.render('home');
//     res.end();
// });
//---------------------------------------------------------------------------------------------------------------------
// portfolioRouter.get('/portfolio',(req,res)=>{
// // router.get('/portfolio',(req,res)=>{
//     res.render('portfolio');
//     res.end();
// });

//---------------------------------------------------------------------------------------------------------------------

// app.use(router);
// app.use(homeRouter);
// app.use(portfolioRouter);

//---------------------------------------------------------------------------------------------------------------------
// app.use('/',require('./home/index'));
// app.use('/',require('./porfolio/index'))
//---------------------------------------------------------------------------------------------------------------------
const router=express.Router();
//---------------------------------------------------------------------------------------------------------------------

router.get('/home',(req,res)=>{
    res.render('home');
    res.end();
});

//---------------------------------------------------------------------------------------------------------------------
router.get('/promise',(req,res)=>{
    console.log('This is a Promise request');
    const p=new Promise((resole, reject)=>{
        console.log('Promise has initiated.');
        // setTimeout(()=>{
        //     resole();
        //     res.send({message:"Promise completed"})
        // },2000)
        setTimeout(reject,5000)
    })
    p.then(()=>{
        res.status(200).send({message:"Promise Completed"})
    }).catch(()=>{
        console.log('Somthing went wrong');
        res.status(400).send({message:"Somthing went wrong"})
    })
});
//---------------------------------------------------------------------------------------------------------------------

router.get('./async-await',async (req,res)=>{
    // res.send(timeConsumingProcess()); Not work
    const data=await timeConsumingProcess();
    console.log('Data is', data);
    res.send(data);
    
})
//---------------------------------------------------------------------------------------------------------------------

async function timeConsumingProcess(){
 new Promise((resole,reject)=>{
    setTimeout(resole,4000)
 }).than(()=>{
    return "EvereyThing went well"
 })
}

//---------------------------------------------------------------------------------------------------------------------

app.listen(8080,(err)=>{
    if(err)console.log('Error is', err);
    console.log('Server is up.');
});

//---------------------------------------------------------------------------------------------------------------------




