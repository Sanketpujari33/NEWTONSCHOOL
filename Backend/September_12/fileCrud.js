const fs = require('fs');

// const path=require('path');//it use givan path of Files and directry;
//__dirname Directry Name;
// __filename files Name;

const pathOfNewFile = __dirname + '/crud.text';
function createFile() {
    //Create A File 
    fs.writeFileSync(pathOfNewFile, 'This is the initial message.')
}

function updateFile(data) {
    //Update file 
    fs.appendFile(pathOfNewFile, data, (err) => {
        if (err) console.log('Error Occurred -', err);
        else console.log('File got updated');
        // \t give the tabe is text file;
        // \n create new line in given file updateFile;
    })
}

function deleteFile() {
    //Delete File
    fs.unlinkSync(pathOfNewFile);
    console.log("File got deleted");
}
module.exports = { createFile, updateFile, deleteFile };
