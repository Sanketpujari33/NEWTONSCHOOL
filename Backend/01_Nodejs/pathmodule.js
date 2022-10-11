const path=require('path');


const a1=path.basename('C:\\temp\\myfile.html');// Retuen Base Name Of File

const a2 = path.dirname('C:\\temp\\myfile.html');//retuen Director name of file;

console.log(a1);
console.log(a2);

const a3=path.extname(__filename);//Retuen Patha of file name;

console.log(__filename, a3);


