try{//some code that has an error
}
catch (e) {
//this will run if the code in the try block errors
}



try {
  throw new Error("This is a new error");
} catch (error) {
  console.log(error);
  console.log("End of try-catch block");
}




try {
  console.log("This statement works");
  throw new Error("This statement throws an error");
} catch (error) {
  console.log("Error has been handled");
} finally {
  console.log("Everything has been handled");
  
}




//////////////////////////////////////////////////////////
console.log("This is tutorial 44");

// Pretend this is coming from a server as response
let a = "Sanket bhau";
a = undefined;
if (a != undefined) {
  throw new Error("This is not undefined");
} else {
  console.log("This is undefined");
}

try {
  null.console;
  console.log("We are inside try block");

  functionSanket();
} catch (error) {
  console.log(error);
  console.log("Are you okay?");
  console.log(error.name);
  console.log(error.message);
} finally {
  console.log("Finally we will run this");
}