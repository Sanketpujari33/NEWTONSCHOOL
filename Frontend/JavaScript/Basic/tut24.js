console.log("This is tutorial 24");

const proto = {
  slogan: function () {
    return `This company is the best`;
  },
  changeName: function (newName) {
    this.name = newName;
  },
};

// This creates Sanket object
let Sanket = Object.create(proto);
Sanket.name = "Sanket";
Sanket.role = "Programmer";
// Sanket.changeName("Sanket2")
// console.log(Sanket)

// This also creates Sanket object
const Sanket1 = Object.create(proto, {
  name: { value: "Sanket", writable: true },
  role: { value: "Programmer" },
});
Sanket1.changeName("Sanket2");
// console.log(Sanket1)

// Employee constructor
function Employee(name, salary, experience) {
  this.name = name;
  this.salary = salary;
  this.experience = experience;
}

// Slogan
Employee.prototype.slogan = function () {
  return `This company is the best. Regards, ${this.name}`;
};

// Create an object from this constructor now
let SanketObj = new Employee("Sanket", 345099, 87);
console.log(SanketObj.slogan());

// Programmer
function Programmer(name, salary, experience, language) {
  Employee.call(this, name, salary, experience);
  this.language = language;
}

// Inherit the prototype
Programmer.prototype = Object.create(Employee.prototype);

// Manually set the constructor
Programmer.prototype.constructor = Programmer;

let rohan = new Programmer("Rohan", 2, 0, "Javascript");
console.log(rohan);
