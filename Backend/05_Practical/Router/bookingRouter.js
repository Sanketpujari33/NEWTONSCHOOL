const express = require("express");
const app = express();
app.use(express.json());
const bookingRouter = express.Router();
const { protectRoute } = require('../controller/authController');
const { createSession } = require('../controller/bookingController');

bookingRouter.post('/createSession',protectRoute,createSession)
bookingRouter.get('/createSession', function(req, res){
    res.sendFile('/Users/Sanke/OneDrive/Desktop/NewtonSchoole/Backend/FoodApp/view/booking.html')
});

module.exports=bookingRouter;