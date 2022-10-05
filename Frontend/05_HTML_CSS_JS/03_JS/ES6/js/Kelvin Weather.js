//The forecast today is 293 Kelvin.
const kelvin = 293;
//Celsius is similar to Kelvin
const celsius = 273;
//Use this equation to calculate Fahrenheit
let fahrenheit = celsius * (9 / 5) + 32;
//Use the .floor() method
fahrenheit = Math.floor(fahrenheit);
//Use string interpolation to replace TEMPERATURE
console.log(`The temperature is ${fahrenheit} degrees Fahrenheit.`);

// Convert to Newton
let newton = celsius * (33 / 100);

// Round down
newton = Math.floor(newton);

console.log(`The temperature is ${newton} degrees Newton.`);
