const express = require('express');
const app = express();
app.use(express.json());
const reviewRouter = express.Router();
const {getAllReview, topThreeReview, getPlanReview, createReiew, updateReview, deleteReview}=require('../controller/reviewController');
const { protectRoute, isAuthorised } = require('../controller/authController');

reviewRouter
.route('/all')
.get(getAllReview);

reviewRouter
.route('/topThree')
.get(topThreeReview)

reviewRouter
.route('/:id')
.get(getPlanReview)

reviewRouter.use(protectRoute);
reviewRouter.use(isAuthorised(['user']));
reviewRouter
.route('/crud/:plan')
.post(createReiew)
.patch(updateReview)
.delete(deleteReview)

module.exports=reviewRouter;