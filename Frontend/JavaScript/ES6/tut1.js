class SimpleDate {
  constructor(year, month, day) {
    this._year = year;
    this._month = month;
    this._day = day;
  }
  addMonth(nMonths) {}
  getMonth() {
    return this.month;
  }
}



  class Car {
 constructor(name,year ) {
        this.name = name;
        this.year = year; 
}
greet() {
        return `${this.name} says hello.`;
}}

const car1 = new Car('Audi', 2018);
//new class from the parent
class Bike extends Car {
 constructor(name,year,speed) {
        //constructor with super
        super(name, year);
        // Adding new property
        this.speed = speed;
}}

const bike1 = new Bike(' Trek', 2019,200);