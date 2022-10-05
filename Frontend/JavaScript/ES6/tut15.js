function myIterable() {
  let counter = 0;
  return {
    next: function () {
      if (counter < 5) {
        counter++;
        return { done: false, value: counter };
      } else {
        return { done: true, value: undefined };
      }
    },
  };
}


console.log("The file is tutorial 15");
// Iterators

function fruitsIterator(values) {
  let nextIndex = 0;
  // we will return an object
  return {
    next: function () {
      if (nextIndex < values.length) {
        // We will return below object
        return {
          value: values[nextIndex++],
          done: false,
        };
      } else {
        // We will return below object with only done
        return {
          done: true,
        };
      }
    },
  };
}

const myArray = ["Apples", "Grapes", "Oranges", "Bhindi"];
console.log("My array is ", myArray);

// Using the iterator
const fruits = fruitsIterator(myArray);
console.log(fruits.next().value);
console.log(fruits.next().value);
console.log(fruits.next().value);
console.log(fruits.next().value);
console.log(fruits.next().value);
