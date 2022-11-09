// const _ = require('lodash');
const express = require('express');
const app = express();
const userRouter = require('./Router/userRouter');
const authRouter = require('./Router/authRouter')
//middleware Function post , front->json
app.use(express.json());
app.listen(3000);
app.use('/user', userRouter);
app.use('/auth', authRouter)
//------------------------------------------------------------------------------------------------------------
function setCookies(req, res) {
    // res.setHeader('Set-Cookie',isLogged=true);
    // res.cookie('isLogged',true,{maxAge:1000*60*60*24, secure:true, httpOnly:true})
    res.cookie('isPrimeMember', true, { maxAge: 1000 * 60 * 60 * 24, secure: true, httpOnly: true })
    res.send('cookies has been set');
}
function getCookies(req, res) {
    let cookise = req.cookie
}

// CORS
//Cross Origin resoures Sharing
//preFlght