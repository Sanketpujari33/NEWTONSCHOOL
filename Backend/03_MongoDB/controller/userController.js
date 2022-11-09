const userModel = require('../models/userModels');


module.exports.getUser = async function getUser(req, res) {
    let id = req.params.id;
    console.log(id);
    let user = await userModel.findById(id);
    console.log(user)
    if (user) {
        return res.json(user)
    } else {
        return res.json({
            massage: 'user not found',
        })
    }
}

module.exports.updateUser = async function updateUser(req, res) {
    try {
        let id = req.params.id;
        let user = await userModel.findById(id);
        let dataUpdate = req.body;
        if (user) {
            const keys = [];
            for (key in dataUpdate) {
                keys.push(key);
            }
            for (let index = 0; index < keys.length; index++) {
                user[keys[index]] = dataUpdate[keys[index]];
            }
            const updataData = await user.save();
            res.json({
                massage: "Data Updated Successfully",
                users: user
            });
        }
        else {
            res.json({
                massage: "user not found",
                users: user
            });
        }
    } catch (err) {
        res.json({
            massage: err.massage,
        });
    }
}

module.exports.deleteUser= async function deleteUser(req, res) {
    try {
        let id = req.params.id;
        let user = await userModel.findByIdAndDelete(id);
        if (!user) {
            res.json({
                massage: 'user not found'
            })
        } else {
            res.status(204).json({
                massage: "Data has been deleted",
                data: user
            })
        }
    } catch (err) {
        res.json({
            massage: err.massage,
        })
    }
}

module.exports.getAllUser = async function getAllUser(req, res) {
    try {
        let users = await userModel.find();
        if (users) {
            res.json({
                massage: 'user retrieved',
                data: users
            })
        } else {
            res.json({
                message: "user not prasent",
            })
        }
    }
    catch (err) {
        res.json({
            message: err.massage,
        })
    }
}
