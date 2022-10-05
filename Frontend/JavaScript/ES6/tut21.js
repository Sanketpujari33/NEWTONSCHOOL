const person = {
  first: "John",
  last: "Addison",
  country: "UK",
  twitter: "@john_adison",
};
// const first = person.first;
// const last = person.last;


// const { first, last } = person;

const { first, last, country } = person;

console.log(first); // John
console.log(last); // Addison

var arr = ["Hello", "World"]  
// destructuring assignment  
var [firsts, second] = arr;  
console.log(firsts); // Hello  
console.log(second); // World  



// var colors = ["Violet", "Indigo", "Blue", "Green"];
// // destructuring assignment
// var [a, b, ...c] = colors;
// console.log(a);
// console.log(b);
// console.log(ac); 



console.log("This is tutorial 21");
// Destructuring in JavaScript

let a, b;
[a, b] = [34, 564];
// console.log(a, b);

[a, b, c, ...d] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];
// console.log(a)
// console.log(b)
// console.log(c)
// console.log(d)

// Array Destructuring
({ a, b, c, ...d } = { a: 34, b: 345, c: 67, d: 45, e: 34 });
// console.log(a, b, c, d)

const fruits = ["Apple", "Bananas", "Mangoes"];
[a, b, c] = fruits;
// console.log(a, b, c)

// Object Destructuring
const laptop = {
  model: "HP Pavilion",
  age: "23 days",
  gender: "Male",
  net: 1233,
  start: function () {
    console.log("started");
  },
};

const { model, age, gender, net, start } = laptop;
console.log(model, age, gender, net, start);
start();



