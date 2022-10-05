console.log("This is tut 19");
let impArray = ["adrak", "pyaz", "bhindi"];

// // Add a key-value pair inside local Storage
// localStorage.setItem('Name', 'Sanket');
// localStorage.setItem('Name2', 'Rohan');
// localStorage.setItem('Sabzi', JSON.stringify(impArray));

// Clears the entire local storage
// localStorage.clear();

// Clear a particular key-value pair
// localStorage.removeItem('Name2');

// Retrieve an item from the local Storage
let name = localStorage.getItem("Name");
name = JSON.parse(localStorage.getItem("Sabzi"));
console.log(name);

// sessionStorage.setItem('sessionName', 'sSanket');
// sessionStorage.setItem('sessionName2', 'sRohan');
// sessionStorage.setItem('sessionSabzi', JSON.stringify(impArray));
