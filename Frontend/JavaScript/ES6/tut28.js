console.log("This is tutorial 28");

// closure

var sum = function (a) {
  console.log(`Counter`, a);
  var c = 4;
  return function (b) {
    return a + b + c;
  };
};
let store = sum(2);

console.log(store(5));

var sums = function (a, b, c) {
  return {
    getSumTwo: () => {
      return a + b;
    },
    getSumThree: () => {
      return a + b + c;
    },
  };
};

var stores = sums(3, 4, 5);
console.log(stores.getSumTwo());

console.log(stores.getSumThree());
