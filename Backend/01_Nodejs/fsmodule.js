const fs=require('fs');

// fs.readFile('file.text','utf8', (err,data)=>{
//     console.log(err, data);
    
// } )

// const a=fs.readFileSync('file.txt');
// console.log(a.toString());

// fs.writeFile('file2.txt, "This is a data',()=>{
//     console.log('written to the file');
    
// });

b=fs.writeFileSync('file2.txt', "This is a data");
console.log(b);

console.log('Finidhed reading file');
