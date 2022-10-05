const fs = require('fs');

// const path=require('path');

const pathOfNewFile = __dirname + '/crud.text';
function createFile() {
    fs.writeFileSync(pathOfNewFile, 'This is the initial message.');

}
function updateFile(data) {
    fs.appendFile(pathOfNewFile, data, (err) => {
        if (err) console.log('Error Occurred -', err);
        else console.log('File got updated');

    })
}
function deleteFile() {
    fs.unlinkSync(pathOfNewFile);
    console.log("File got deleted");
}
module.exports = { createFile, updateFile, deleteFile };