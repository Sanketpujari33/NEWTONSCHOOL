// const EventEmitter = require("events");
// const eventEmitterObject = new EventEmittlser();

const {registerEvent, eventEmitterObject}=require('./eventRegistration');
const {readFullFile , readFileInParts}=require("./streams");
const { createFile, updateFile, deleteFile} = require("./fileCrud");

registerEvent('newEvent');
eventEmitterObject.emit('newEvent');


// readFullFile();
// readFileInParts();

// createFile();
// updateFile("\nThis is a new data");
deleteFile();