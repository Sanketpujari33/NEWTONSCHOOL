const UserSchema = require('./UserSchema');
//---------------------------------LOGIN-Token-verifiction---------------------------------------------------------------------------

const jwt = require('jsonwebtoken');
const secretKey = "Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398Sanket3398";

//----------------------------------------------------------------------------------------------
const verifyToken = (req, res, next) => {
    const token = req.headers.authorization;
    if (!token) {
        res.status(401).json({ massage: "Token is Absent" });
        return;
    }
    try {
        const isVerified = jwt.verify(token, secretKey);
        if (!isVerified.email) {
            res.status(401).json({ massage: "Authentication failed" });
            return;
        }
        req.userEmail = isVerified.email;
        next();
    } catch (err) {
        console.log(err);
        res.status(401).json({ massage: "Authentication Failed" });
        return;
    }
}
//---------------------------------------------------------------------------------------
module.exports =verifyToken;
//---------------------------------------------------------------------------------------
