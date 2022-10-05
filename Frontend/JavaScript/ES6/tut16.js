function* myGenerator() {
  //code
}

function* awesomeGenerator() {
  yield "Hello World"; // We pause the execution here
  console.log("We are back again"); // When we resume, we are here
}
awesomeGenerator();

// {
//   value: [ next value ],
//   done: [ true if we reach the end, else false]
// }




function* myGenerator() {
    yield 1;
    yield 2;
}
let iterator = myGenerator();
let result;
do { 
result = iterator.next();
console.log(result);
} while (!result.done);
//Output:-
//{value: 1, done: false}
//{value: 2, done: false}
//{value: undefined, done: true}




console.log("this is tutorial 16");
// Generators in JavaScript
// 1 - 1B

function* numbersGen() {
  let i = 0;

  // yield 1;
  // yield 2;
  // yield 3;
  // yield 4;
  while (true) {
    yield i++;
    // yield (i++).toString();
  }
}

const gen = numbersGen();
console.log(gen.next().value);
console.log(gen.next().value);