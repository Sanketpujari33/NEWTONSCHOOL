// This is your test secret API key.
let SK = 'sk_test_51LuhIiSDdFqrK5OfzLvS9BHeYBnIoVvHnUTRnfs9W55TbDDbxAkMbKxKem4o02GdSS1YGmGjGXcf1eFcFh7sYs9J00AXqq6JFW';
const stripe = require('stripe')(SK);
const planModel = require('../models/planModels');
const userModel = require('../models/userModels');


module.exports.createSession = async function (req, res) {
    try {
        let userId = req.id;
        let planId = req.params.id;
        const user = await userModel.findById(userId);
        const plan = await planModel.findById(planId);
        const session = await stripe.checkout.sessions.create({
            payment_method_type: ['card'],
            customer_email: user.email,
            client_refernce_id: plan.id,
            line_items: [
                {
                    name: plan.name,
                    description: plan.description,
                    //deplay website
                    amount: plan.price * 100,
                    currency: "inr",
                    quantity: 1
                },
            ],
            // mode: 'payment',
            //dev=>http
            //production=>http
            success_url: `$(req.protocal)://${req.get("host")}/profile`,
            cancel_url: `$(req.protocal)://${req.get("host")}/profile`
        });
        res.status(200).json({
            status:"success",
            session
        });
    } catch (error) {
        res.status(500).json({
            error:error.message
        });
    }
}


// const express = require('express');
// const app = express();
// app.use(express.static('public'));

// const YOUR_DOMAIN = 'http://localhost:4242';
// app.post('/create-checkout-session', async (req, res) => {

//     res.redirect(303, session.url);
// });

// app.listen(4242, () => console.log('Running on port 4242'));