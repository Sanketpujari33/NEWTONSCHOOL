// Sum Values using Iteration
function sum(numbers) {
  if (!Array.isArray(numbers)) {
    return -1
  } else {
    let total = 0;

    for (let idx = 0; idx < numbers.length; idx++) {
      total += numbers[idx];
    }
    return total;
  }
}


function sumUsingForEach(numbers) {
  if (!Array.isArray(numbers)) {
    return -1
  } else {
    let total = 0;

    numbers.forEach(function(value, index) {
      total += value;
    })

    return total;
  }
}



// Sum Values using Recursion

function sumRecursion(numbers) {
  if (!Array.isArray(numbers)) {
    return -1
  } else if (numbers.length === 1) {
    // Non-Recursive or Base case;

    return numbers[0];
  } else {
    // Recursive Case
    return numbers[0] + sumRecursion(numbers.slice(1));
  }
}

//   ========================================
// Factorial code Imperative Case:

function iterarativeFactorial(number) {
  if (number === 0) {
    return 0;
  }
  if (number === 1) {
    return 1;
  } else if (number > 1) {

    let factorial = 1;

    while (number > 0) {
      factorial *= number;
      number--
    }
    return factorial;
  }
}

// Factorial code Recursive Case:

function recursiveFactorial(number) {
  if (number === 0) {
      return 0;
    }
    if (number === 1) {
      return 1;
    } else if (number > 0) {
      return number * recursiveFactorial(number - 1);
    }
  }



//   Fibonacci Code Iterative

//  - F_{0}=0,
//  - F_{1}=1,
//  - F_{n}=F_{n-1}+F_{n-2}



function iterativeFibonacci(number) {

  if(isNaN(number)) return;
  if(number===0) return 0;
  if(number===1) return 1;

  let previousValue = 0;
  let currentValue = 1;

  for(let idx = n; idx>1;idx--){

    let nextValue = previousValue + currentValue;
    previousValue = currentValue;
    currentValue = nextValue;
  }
  return currentValue
}



//   Fibonacci Code Recursive Solution

function recursiveFibonacci(number){

  if(isNaN(number)) return;
  if(number===0) return 0;
  if(number===1) return 1;

  return recursiveFibonacci(number-2)+ recursiveFibonacci(number-1);
}