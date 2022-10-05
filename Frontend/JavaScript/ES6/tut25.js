console.log("This is tutorial 24");
//Implementing Memoization in JavaScript
//Memoization is an optimization technique that can be used to reduce 
//time -consuming calculations by saving previous input to somthing called
//cache and returning the result from it;

let sum=0;
const calc=(n)=>{
    for (let index = 0; index <=n; index++) {
        sum+=index;
    }
    return sum;
}
// console.time();
// console.log(calc(5));
// console.timeEnd();

// console.log("-----------------------------")
const memoization=(fun)=>{
    let cache={};
    return function (...args){
    let n=args[0];
    if(n in cache){
        console.log('caches');
        console.log(cache);
        
        return cache[n];
    }else{
        console.log('Calculating First time');
       let result= fun(n);
       cache[n]=result;
       return result;
    }
    }
}
console.time();
const efficient=memoization(calc);
console.log(efficient(5));
console.timeEnd();

console.time();
console.log(efficient(6));
console.timeEnd();


console.time();
console.log(efficient(5));
console.timeEnd();