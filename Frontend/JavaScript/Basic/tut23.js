console.log("This is tutorial 23");

// Object literal : Object.prototype
let obj = {
  name: "Sanket",
  channel: "Code With Sanket",
  address: "Mars",
};

function Obj(givenName) {
  this.name = givenName;
}

Obj.prototype.getName = function () {
  return this.name;
};

Obj.prototype.setName = function (newName) {
  this.name = newName;
};

let obj2 = new Obj("Rohan Das");
console.log(obj2);
