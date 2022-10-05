const mySymbol = Symbol();


const sym1 = Symbol();
const sym2 = Symbol();
console.log(s1 === s2); // false


console.log(Symbol()) //Symbol()
console.log(Symbol('Some Test')) //Symbol(Some Test)



const mysymbol = Symbol()
const person = {
  [mysymbol]: 'John'
}
person[mysymbol] 
const mysymbol2 = Symbol()
person[mysymbol2] = () => 'Hello World'
console.log(person[mysymbol2]()) 
//Output: Hello World



let student = { name: "Sanket" };
let id_companyA = Symbol("id");
student[id_companyA] = "ID assigned by company A";
let id_companyB = Symbol("id");
student[id_companyB] = "ID assigned by company B";
console.log(student)
//Output: {name: "Sanket", Symbol(id): "ID assigned by company A", Symbol(id): "ID assigned by company B"}


console.log("This is tutorial 20");

// Symbols
const sym3 = Symbol("My identifier");
const sym4 = Symbol("My identifier");
// console.log('Symbol is ', sym1);
// console.log('Type of Symbol is ', typeof sym1);
console.log(sym3 === sym4);

const a = "this is";
const b = "this is";

console.log(a === b);
console.log(null === null);
console.log(undefined === undefined);

const k1 = Symbol("identifier for k1");
const k2 = Symbol("for k2");

myObj = {};
myObj[k1] = "Sanket";
myObj[k2] = "Rohan";
myObj["name"] = "Good boy";
myObj[4] = "Good int";

console.log(myObj);
console.log(myObj[k1]);
console.log(myObj[k2]);
console.log(myObj.k2); // !! ALERT !!: cannot do this to get Rohan because it is same as myObj["k2"]

// Symbols are ignored in for in loop
for (key in myObj) {
  console.log(key, myObj[key]);
}

console.log(JSON.stringify(myObj));
