const express = require("express");
const app = express();
app.use(express.json());
const planRouter = express.Router();
const { protectRoute, isAuthorised } = require('../controller/authController');
const { getAllPlans, getPlan, createPlan, updatePlan, deletePlan, top3Plans } = require('../controller/planController')


//all plans open for user
planRouter
.route('/allPlans')
.get(getAllPlans)

//top3Plan
planRouter.route('/top3').get(top3Plans)

// own plan -> login neccessary
planRouter.use(protectRoute);
planRouter.route('/plan/:id')
.get(getPlan)

//admin and restaurant owner can only create,upadet or delete plans
planRouter.use(isAuthorised(['admin','restaurantowner']))
planRouter
.route('/crudPlan')
.post(createPlan)
    

planRouter
.route('/crudPlan/:id')
.patch(updatePlan)
.delete(deletePlan)


module.exports = planRouter;