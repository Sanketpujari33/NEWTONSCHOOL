console.log("This is tutorial 24");

// Spred & Rest Operator

function addNumber(a, b, c,...other){
    // console.log(other);
    // console.log(other[4]);
    //console.log(arguments);//ES5
    
    // console.log(a , b, c);
    
    return a+b+c;
}
const rest=addNumber(2,5,6,4,8,9,7,3);
// console.log(rest);


//Spread
let names=["Sanket","Anuj","Ram"];

function getNames(name1, name2, name3){
    // console.log(name1, name2, name3);
    
}

getNames(names[0],names[1],names[2]);
getNames(...names);
getNames(names);


// Object

let student={
    name:"Sanket",
    age:24,
    hobbies:['coding', 'Travaling']

}


// const age=student.age;
// const {name, age}=student;
// console.log(name,age);

// const {age,...r} = student;
// console.log(age,r);

// const {...r } = student;
// console.log(r);


let newStudent={
    ...student,
    Study: "fullStactWeb"
}
console.log(newStudent);



