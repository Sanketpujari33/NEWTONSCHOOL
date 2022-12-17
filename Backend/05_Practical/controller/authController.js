const userModel = require('../models/userModels')
const jwt = require('jsonwebtoken');
const jwt_key = require('../secrets');
const {sendMail}=require('../utility/nodemailer')
//sign up user
module.exports.signup = async function signup(req, res) {
    try {
        let dataObj = req.body;
        console.log(dataObj);

        let user = await userModel.create(dataObj);
        sendMail("signup",user);
        if (user) {
            return res.json({
                massage: "User Sign Up",
                data: user,
            });
        } else {
            return res.json(
                {
                    massage: "error while signing up",
                });
        }

    } catch (err) {
        res.status(500).json({
            massage: err.message,
        })
    }
}

//login user
module.exports.login = async function login(req, res) {
    try {
        let data = req.body;
        if (data.email) {
            let user = await userModel.findOne({ email: data.email });
            if (user) {
                //bcrypt -> compare
                if (user.password == data.password) {
                    let uid = user['_id'];
                    let jwt_id = jwt.sign({ payload: uid }, jwt_key);
                    res.cookie('login', jwt_id, { httpOnly: true });
                    return res.json({ massage: 'User has logged in', userDetails: data })
                } else {
                    return res.json({ massage: 'Wrong Password' })
                }
            }
        } else {
            return res.json({ massage: 'Usre Not found' })
        }
    }
    catch (err) {
        return res.status(500).json({
            massage: err.message
        })
    }
}

// Logout
module.exports.logout = function logout(req, res) {
    res.cookie('login', '', { maxAge: 1 });
    res.json({
        massage: "User Logged out succesfully"
    })
}

//is Authorised-> to check the user's role [adimin,user, restaurant, delivery boy]
module.exports.isAuthorised = function (roles) {
    return function (req, res, next) {
        if (roles.includes(req.role) === true) {
            next();
        } else {
            res.status(401).json({
                massage: "opration not allowed"
            })
        }
    }
}

//protect Router
module.exports.protectRoute = async function protectRoute(req, res, next) {
    try {
        let token;
        if (req.cookies.login) {
            token = req.cookies.login;
            let payload = jwt.verify(token, jwt_key);
            if (payload) {
                // console.log('payload token',payload);
                const user = await userModel.findById(payload.payload);
                req.role = user.role;
                req.id = user.id;
                // console.log(req.role);
                // console.log(req.id);
                next();
            } else {
                return res.json({
                    massage: 'Increate Detials'
                });
            }
        } else {
            //browser
            const client=req.get('User_Agent');
            if(client.includes("Mozilla")===true){
                return res.redirect('/login');
            }else{
            //testing API -Postman
            return res.json({
                massage: 'please login'
            });
            }
        }
    } catch (err) {
        return res.json({
            massage: err.message
        });
    }
}

//forget Password
module.exports.forgetPassword = async function forgetPassword(req, res) {
    let { email } = req.body;
    try {
        const user = await userModel.findOne({ email: email });
        if (user) {
            const resetToken = user.createResetToken();
            //http://abc.com/resetpassword/resetToken
            let resetPasswordLink = `${req.protocol}://${req.get(
                "host"
                )}/resetpassword/${resetToken}`;
            // send email to the user
            //nodemailer
            let obj={
                resetPasswordLink:resetPasswordLink,
                email:email,
            }
            sendMail('resetPasswordLink',obj);
        } else {
            return res.json({
                massage: "please signup"
            })
        }
    } catch (err) {
        return res.status(500).json({
            massage: err.message,
        })
    }
}

//reset Password
module.exports.resetPassword = async function resetPassword(req, res) {
    try {
        const token = req.parmas.token;
        let { password, confirmpassword } = req.body;
        const user = await userModel.findOne({ resetToken: token });
        if (user) {
            //reset PasswordHandler will update user in db
            user.resetPasswordHandler(password, confirmpassword);
            await user.save();
            res.json({
                massage: "password changed Succesfully plase login agian"
            })
        } else {
            res.json({
                massage: "user not found"
            })
        }

    } catch (error) {
        res.json({
            massage: error.message
        })
    }

}