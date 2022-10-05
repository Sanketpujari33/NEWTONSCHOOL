
console.log("This is tutorial 26");
//Currying function in javascript

function Addition(a, b, c){
    return a+b+c;
}
let result=Addition(2,5,6);
console.log(result);

function Add(a){
    return function(b){
        return function(c){
            return a+b+c;
        }
    }
}
// let a=Add(2);
// let b=a(5);
// let c=b(6);
// console.log(c);

let result1=Add(2)(5)(6);//Currying
console.log(result1);


userObj={
    name:"Sanket",
    age: 24
}
function userInfo(obj){
    return(userinfo)=>{
        return obj[userinfo];
    }
}

let res=userInfo(userObj);
console.log(res('name'));






