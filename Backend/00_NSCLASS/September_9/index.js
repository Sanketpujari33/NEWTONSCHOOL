const http=require('http');

const hostname=`127.0.0.1`;
const port=3000;

const server=http.createServer((req, res)=>{
  if (req.url == '/data') { //check the URL of the current request
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.write(JSON.stringify({ message: "Hello World"}));  
    res.end();  
}else if (req.url == '/') { //check the URL of the current request
        
    // set response header
    res.writeHead(200, { 'Content-Type': 'text/html' }); 1
    
    // set response content    
    res.write('<html><body><p>This is home Page.</p></body></html>');
    res.end();

}
else if (req.url == "/student") {
    
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write('<html><body><p>This is student Page.</p></body></html>');
    res.end();

}
else if (req.url == "/admin") {
    
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write('<html><body><p>This is admin Page.</p></body></html>');
    res.end();

}
else
    res.end('Invalid Request!');
});
  server.listen(port, hostname, ()=>{
    console.log(`Server running at http://${hostname}:${port}/`);
});

// const {helper, helper}=require('./helper');

const help = require("./helper");

function firstFunction() {
  console.log(help.helper);
  console.log("This is my first program");
}
firstFunction();
var myLogModule = require('./log.js');

myLogModule.info('Node.js started');