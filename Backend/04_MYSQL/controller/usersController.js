const db=require('../models/config')

module.exports.getAllUser=(req, res)=>{
        db.query("SELECT * FROM users", (err,result)=>{
            if(err){
                console.log('it is err');
                
                res.send("error")
            }else{
                res.send(result);
            }
        })

};

// module.exports.
