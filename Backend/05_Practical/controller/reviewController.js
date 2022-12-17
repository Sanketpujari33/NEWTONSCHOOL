const reviewModel = require('../models/reviewModel')
const planModel = require('../models/planModels')

module.exports.getAllReview= async function getAllReview(req, res) {
    try {
        const reviews = await reviewModel.find();
        if (reviews) {
            return res.json({
                message: "reviews retrieves",
                data: reviews
            });
        } else {
            return res.json({
                message: "reviews not found"
            });
        }
    }
    catch (error) {
        return res.json({
            message: error.message
        });
    }
}

module.exports.topThreeReview= async function topThreeReview(req, res) {
    try {
        const reviews = await reviewModel.find().sort({ rating: -1 }).limit(3)
        if (reviews) {
            return res.json({
                message: " top Three reviews retrieves",
                data: reviews
            });
        } else {
            return res.json({
                message: "reviews not found"
            });
        }
    }
    catch (error) {
        return res.json({
            message: error.message
        });
    }
}

module.exports.getPlanReview = async function getPlanReview(req, res) {
    try {
        let planId = req.params.id;
        let reviews = await reviewModel.find();
        reviews=reviews.filter(reviews=>reviews.plan._id==planId);
        if (reviews) {
            return res.json({
                message: "review retrieves  for a particular plan Successfull",
                data: reviews
            });
        } else {
            return res.json({
                message: "review not found"
            });
        }
    }
    catch (error) {
        return res.json({
            message: error.message
        });
    }
}

module.exports.createReiew=async function createReiew(req, res) {
    try {
        let id = req.params.plan;
        let plan = await planModel.findById(id);
        let reviews = await reviewModel.create(req.body);
        plan.Reviews=plan.Reviews+1;
        plan.ratingsAverage=(plan.ratingsAverage+reviews.rating)/plan.Reviews;
        await plan.save();
        return res.json({
            message: " top Three reviews retrieves",
            data: reviews
        });
    }catch (error) {
        return res.json({
            message: error.message,
        });
    }
}

module.exports.updateReview=async function updateReview(req, res){
    try {
        let planid = req.params.id;
        let id=req.body.id;
        // let idp = req.params.plan;
        let plan = await planModel.findById(planid);
            let dataToBeUpdated = req.body;
            const keys = [];
            for (key in dataToBeUpdated) {
                if(key=='id') continue;
                keys.push(key);
                
            }
            let review = await reviewModel.findById(id);
            for (let index = 0; index < keys.length; index++) {
                review[keys[index]] = dataToBeUpdated[keys[index]];
            }
            //doc 
            await review.save();
            return res.json({
                massage: "review update succesfully",
                data: review
            });

    } catch (error) {
        return res.status(500).json({
            massage: error.massage
        });
    }
}

module.exports.deleteReview = async function deleteReview(req, res) {
    try {
        let id=req.body.id;
            let deleteData = await reviewModel.findByIdAndDelete(id);
            return res.json({
                message: 'Review delete succesfully',
                data: deleteData
            });
    } catch (error) {
        return res.status(500).json({
            massage: error.massage
        });
    }
}
