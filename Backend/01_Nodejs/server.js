//server creation

//1. http module

const http=require('http');

const server=http.createServer((req,res)=>{
    console.log('requset has been made from browser to server');
})


//port number ,host, callback function
// 127.0.0.1, 8080, ()=>
// port number is doors in a web


server.listen(3000,'localhost',()=>{
    console.log('server is listening on port 3000');
    
})