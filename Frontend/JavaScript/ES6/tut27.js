console.log("This is tutorial 27");
//Infinite Currying function in javascript


function add(a){
    return function(b){
       if(b) return add(a+b);
        return a;
    }
}
console.log(add(5)(6)(9)(9)(6)());