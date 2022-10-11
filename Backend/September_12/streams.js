const fs = require('fs');

// fs is predifine Module

function readFullFile() {
    const start = Date.now();
    fs.readFile("./info.txt", 'utf-8', (err, data) => {
        console.log('time taken is ', Date.now()-start);
        console.log("Hear is the output=", data);
        // fs.readFile this are all file read at one time;
        //It is given Low app performance;
    });
}
function readFileInParts(){
    const stream=fs.createReadStream('./info.txt','utf-8');
    // read files in parts
    stream.on('data', (partialInfo)=>{
        console.log("Partial read",partialInfo.length);
        
    })
    stream.on('end',()=>{
        // file read completly
        console.log('Read Successfully.');
    })
    stream.on('error',(err)=>{
        //read a file that time Any arr;
        console.log('Error Occurred -',err);
        
    })
}
// It is Ato emit a files
//It is use case are are file fast
// and file is read by read 
module.exports = { readFullFile, readFileInParts};