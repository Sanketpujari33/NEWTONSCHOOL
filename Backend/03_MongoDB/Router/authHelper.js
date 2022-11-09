//let flag=false; //user logged in or not
const jwt=require('jsonwebtoken');
// jwt--> json web Token
//jwt-> HEADER ->Algorthum
//      PlayLoad-> uid -uniqe id
//      Signature-> secretKey and uid and Algorthum
const jwt_key='fhgadsvhashifijdgshddoihqwi9hbdasjdioqwbgd';


function protectRoute(req,res, next){
    if(req.cookies.login){
        log
        let isVerified=jwt.verify(req.cookies.login,jwt_key);
        if(isVerified){
            next();
        }else{
            return res.json({
                massage:'user not verified'
            });
        }
    }else{
        return res.json({
            massage:'operation not allowed'
        });
    }
}

// // cookise?
// function setCookie(name,value,days) {
//     var expires = "";
//     if (days) {
//         var date = new Date();
//         date.setTime(date.getTime() + (days*24*60*60*1000));
//         expires = "; expires=" + date.toUTCString();
//     }
//     document.cookie = name + "=" + (value || "")  + expires + "; path=/";
// }
// function getCookie(name) {
//     var nameEQ = name + "=";
//     var ca = document.cookie.split(';');
//     for(var i=0;i < ca.length;i++) {
//         var c = ca[i];
//         while (c.charAt(0)==' ') c = c.substring(1,c.length);
//         if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length);
//     }
//     return null;
// }
// function eraseCookie(name) {   
//     document.cookie = name +'=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';
// }


// setCookie('ppkcookie','testcookie',7);

// var x = getCookie('ppkcookie');
// if (x) {
// }


module.exports=authHelper