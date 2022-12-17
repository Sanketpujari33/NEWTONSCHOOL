const express = require('express');
const multer=require('multer')
const app = express();
const userRouter=express.Router();
app.use(express.json());
const {getUser,getAllUser,updateUser,deleteUser, updateProfileImage}=require('../controller/userController');
const {signup,login,isAuthorised,protectRoute,forgetPassword,resetPassword,logout}=require('../controller/authController');


//user oprations
userRouter
.route('/:id')
//upadate
.patch(updateUser)
//delete
.delete(deleteUser)

//Signup
userRouter
.route('/signup')
.post(signup)

//Login
userRouter
.route('/login')
.post(login)

//Loggout
userRouter
.route('/logout')
.get(logout)

//forget password
userRouter
.route('/forgetPassword')
.post(forgetPassword)

//Reset Password
userRouter
.route('/resetpassword/:token')
.post(resetPassword)

//multer for fileupload

const multerStorage=multer.diskStorage({
    destination:(req, file,cb)=>{
        cb(null,'public/images')
    },
    filename:(req, file, cb)=>{
    cb(null,`user-${Date.now()}.jpeg`);
    }
});

const filters= (req, file, cb)=>{
    if(file.mimetype.startsWith("image")){
        cb(null, true);
    }else{
        cb(new Error("Not an Image! Please upload an image", false))
    }
}

const upload=multer({
    storage: multerStorage,
    fileFilter: filters
});
userRouter.post("/ProfileImage", upload.single('photo'), updateProfileImage)
// get request 
userRouter.get('/ProfileImage', (req, res)=>{
    res.sendFile("/Users/Sanke/OneDrive/Desktop/NewtonSchoole/Backend/FoodApp/view/multer.html")
})
//profile page
userRouter
.use(protectRoute)
userRouter
.route('/userProfile')
.get(getUser)

//Admin Specific Function
userRouter.use(isAuthorised(['admin']));
userRouter
.route('')
.get(getAllUser)


module.exports = userRouter;