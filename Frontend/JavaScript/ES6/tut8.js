function mul(a, b) {
  return a * b;
} //calling function
mul(3, 3); //returns 9


let additions = function(x,y) {
 return x + y;
}
console.log(additions(10,10)); // returns 20


let additio = (x,y) => x + y;
console.log(addition(10,10)); // 20;

greets = () => "Hello World!";
/////////////////////////////////////////////////////////////


console.log("this is tutorial 41");

// ARROW FUNCTIONS

// Creating a regular function
// const Sanket = function (){
//     console.log("This is the best person ever")
// }

// Converting it to an arrow function
// const Sanket = ()=>{
//     console.log("This is the best person ever")
// }
// Sanket();

// function returning something
// const greet = function(){
//     return "Good Morning";
// }

// One liners do not require braces/return
// one line will automatically return
// const greet = () =>  "Good Morning";

// const greet = () =>  ({name: "Sanket"});

// Single parameters do not need parenthesis
// but you will have to put parenthesis if there are multiple paramteres
const greet = (name) => "Good Morning " + name + ending;

console.log(greet("Sanket"));
