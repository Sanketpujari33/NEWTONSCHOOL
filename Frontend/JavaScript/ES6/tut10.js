async function name(param1, param2, ...paramN) {
  // statements
}


// async function example
async function func() {
    console.log('Async/Await tutorial.');
    return Promise.resolve(1);
}
func();


async function func1() {
  console.log("Async/Await tutorial.");
  return Promise.resolve(1);
}
func1().then(function (res) {
  console.log(res);
});

// let result = await promise;



async function func2() {
  let promise = new Promise((resolve, reject) => {
    setTimeout(() => resolve("Done with Async/Await!"), 1000);
  });
  let result = await promise; // wait until the promise resolves
  console.log(result);
}
func2();


/////////////////////////////////////////////////////////
console.log("This is tutorial 43");

async function sanket() {
  console.log("Inside sanket function");
  const response = await fetch("https://api.github.com/users");
  console.log("before response");
  const users = await response.json();
  console.log("users resolved");
  return users;

  // return "sanket";
}

console.log("Before calling sanket");
let a = sanket();
console.log("After calling sanket");
console.log(a);
a.then((data) => console.log(data));
console.log("Last line of this js file");