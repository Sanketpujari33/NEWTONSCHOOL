//server creation

//1. http module

const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) => {
    console.log('requset has been made from browser to server');
    //    console.log(req.method);
    //    console.log(req.url);
    //    res.write('Content-Type','text/plain');
    //    res.write('Hello, Sanket ! :)');

    // response send with html 
    res.setHeader('Content-Type', 'text/html');
    // res.write('<h1>Hello, Sanket ! :)</h1>');
    // res.end();

    // response send with html file
    // fs.readFileSync('./views/index.html',(err,fileData)=>{
    //     if(err){
    //         console.log(err);
    //     }else{
    //         res.write(fileData);
    //         res.end();
    //     }
    // })
    // router web page and make a 404 web page
    let path = './views';
    switch (req.url) {
        case '/':
            res.statusCode=200;
            path +='/index.html';
            break;
        case '/protfolio-me':
            res.statusCode=200;
            // redirect->>web page change path that time use redirect
            res.setHeader('location','/protfolio')
            path +='/protfolio.html';
            break;
        default:
            res.statusCode=404;
            path += '/404.html';
    };
    fs.readFile(path, (err, fileData) => {
        if (err) {
            console.log(err);
        } else {
// Status code
// http Headers -> Status code-> 500 Types of Status code
//01)100-199;-> Information Purposes Status code
//02)200-299;->Success Purposes Status code
//03)300-399;-> Redirect Purposes
//04)400-499;->Client-Error Purposes
//05)500-599;->Server -Error Purposes-Crash-

// most of used Status Code
//200 
//201
//307
//308
//404
//400
//500
//502
// Serche Engine Optimization
            res.end(fileData);
        }
    })
})





//port number ,host, callback function
// 127.0.0.1, 8080, ()=>
// port number is doors in a web
server.listen(3000, 'localhost', () => {
    console.log('server is listening on port 3000');

})