const http = require('http');
const express = require('express');
const app = express();
app.use(express.json())
const server = http.createServer(app);

app.post('/signup', (req, res) => {
    const body = req.body;
    console.log('I got this data: ', body.name, body.email, body.password);
    console.log('You have been signedup');
    res.json({
        massage: "Succesfully Signed up "
    });
});
app.put('/update-user', (req, res) => { 
    console.log('User got Updated');
    const body=req.body;
    console.log('The Updated body is ', body);
    
    res.json({
        massage:"Succesfully Updsted"
    });
})

app.delete("/delete-user", (req,res)=>{
    console.log('Deleting user');
    console.log(req.body);
    
    // res.json({
    //     massage:"Deleted Succesfully"
    // });
    // res.status(204).json()
    res.status(204).send()
});

app.get('/math-table',(req, res)=>{
    const tableOf=parseInt(req.query.table_of);
    const tableTill = parseInt(req.query.table_till);
    console.log(typeof tableOf);
    console.log(typeof tableTill);
    console.log('query param are: ',tableOf,tableTill);
    
    const tableData=[];
    for (let index = 1; index<tableTill ; index++){
        tableData.push((tableOf+"x"+index+"="+(tableOf*index)))     
    }

    res.status(200).json({
        tableOf,
        tableData
    });
})

app.get('/user/:user_name',(req, res)=>{
    console.log(req.params.user_name, "is the username");
    console.log(req.headers.authorization);
    res.status(200).end();
});

server.listen(8080, '127.0.0.1', () => {
    console.log('My Express server is live');
});