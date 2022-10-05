let myset = new Set([iterable]);


set1.add(x);

set1.delete(x);

set1.clear();

set1.entries();

set1.has(x);

set1.values();

set1.keys();


let set = new Set();
let john = { name: "John" };
let sanket = { name: "sanket" };
let cavin = { name: "cavin" };
//  some users come multiple times
set.add(john);
set.add(sanket);
set.add(cavin);
set.add(john);
set.add(sanket);
// set keeps only unique values
for (let user of set) {
  console.log(user.name);
}



console.log('This is tutorial 19');

// Set stores unique values
const mySet = new Set();  // Initialize an empty set
console.log('The set looks like :',mySet);

// Adding values to this set
mySet.add('this');
mySet.add('My name');
mySet.add('this');
mySet.add('that');
mySet.add(34);
mySet.add(true);
mySet.add(false);
mySet.add('that2');
console.log('The set looks like this now:',mySet);

// Use a constructor to initialize the set
let mySet2 = new Set([1, 45, 'this', false, {a:4, b:8}, 'this']);
console.log('New set:',mySet2);


console.log(mySet.size); // Get the size of the set

console.log(mySet.has(346)); // Check whether set has 346 or not

console.log('Before removal', mySet.has('that2'));
mySet.delete('that2'); // Remove an element from the set
console.log('After removal', mySet.has('that2'));


// Iterating a set
// for(let item of mySet){
//     console.log('Item is  :', item );
// }

mySet.forEach((item)=>{
    console.log('Item is  :', item );
})

// Quiz: Can you use Array.from(mySet) to convert set into an array?