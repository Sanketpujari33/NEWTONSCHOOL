const express = require('express');
const planModels = require('../models/planModels')

module.exports.getAllPlans = async function getAllPlans(req, res) {
    try {
        let plans = await planModels.find();
        if (plans) {
            return res.json({
                massage: 'all plans reteieved',
                data: plans
            });
        } else {
            return res.json({
                massage: 'plans not found',
            });
        }
    } catch (error) {
        return res.status(500).json({
            massage: error.massage
        });
    }
}

module.exports.getPlan = async function getPlan(req, res) {
    try {
        let id = req.params.id;
        let plan = await planModels.findById(id);
        if (plan) {
            return res.json({
                massage: 'plans reteieved',
                data: plan,
            });
        } else {
            return res.json({
                massage: 'plan not found',
            });
        }
    } catch (error) {
        return res.status(500).json({
            massage: error.massage
        });
    }
}

module.exports.createPlan = async function createPlan(req, res) {
    try {
        let planData = req.body;
        let createPlan = await planModels.create(planData);
        return res.json({
            message: 'plan created succesfully',
            data: createPlan,
        });
    } catch (error) {
        return res.status(500).json({
            massage: error.message
        });
    }
}

module.exports.deletePlan = async function deletePlan(req, res) {
    try {
        let id = req.params.id;
        let deletePlan = await planModels.findById(id);
        if (deletePlan) {
            let deleteData = await planModels.findByIdAndDelete(id);
            return res.json({
                message: 'plan delete succesfully',
                data: deleteData
            });
        } else {
            return res.json({
                message: 'plan not found',
            });
        }
    } catch (error) {
        return res.status(500).json({
            massage: error.massage
        });
    }
}

module.exports.updatePlan = async function updatePlan(req, res) {
    try {
        let id = req.params.id;
        let plan = await planModels.findById(id);
        if (plan) {
            let dataToBeUpdated = req.body;
            const keys = [];
            for (key in dataToBeUpdated) {
                keys.push(key);
            }
            for (let index = 0; index < keys.length; index++) {
                plan[keys[index]] = dataToBeUpdated[keys[index]];
            }
            //doc 
            await plan.save();
            return res.json({
                massage: "plan update succesfully",
                data: plan
            });
        } else {
            return res.json({
                massage: "plan not present"
            });
        }

    } catch (error) {
        return res.status(500).json({
            massage: error.massage
        });
    }
}

// get top 3 plans 
module.exports.top3Plans = async function top3Plans(req, res) {
    try {
        const plans = await planModels.find().sort({ ratingsAverage: -1}).limit(3);
        if (plans) {
            return res.json({
                massage: 'Top There plans',
                data: plans
            });
        } else {
            return res.json({
                massage: "plans are not present"
            });
        }
    } catch (error) {
        return res.status(500).json({
            massage: error.massage
        });
    }
}