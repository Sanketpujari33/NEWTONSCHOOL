console.log("This is tutorial 29");
//Apply, call & Bind in js

//call

// let userDetails={
//     names:"Sanket Pujari",
//     age:24,
//     Designation:"Software Enginner",
//     peintDetails: function(){
//     console.log(this.names);
    
//     }
// }
// userDetails.peintDetails();

// let userDetails2= {
//   names: "Shekhar Pujari",
//   age: 27,
//   Designation: "ITI",
// };
// function borrowing
// userDetails.peintDetails.call(userDetails2);


// let userDetails = {
//   names: "Sanket Pujari",
//   age: 24,
//   Designation: "Software Enginner",
 
// };
//  let peintDetails= function () {
//     console.log(this);
//   }


//   let userDetails2 = {
//     names: "Shekhar Pujari",
//     age: 27,
//     Designation: "ITI",
//   };

// peintDetails.call(userDetails2)




//Applay
let userDetails={
    names:"Sanket Pujari",
    age:24,
    Designation:"Software Enginner",
}
 let peintDetails= function(state, country){
    console.log(this.names+" "+state+" "+ country);
    
    }
peintDetails.call(userDetails, "Mahrashtra", "India");

let userDetails2= {
  names: "Shekhar Pujari",
  age: 27,


  Designation: "ITI",
};
// function borrowing
//call
peintDetails.call(userDetails2,"Mahrashtra","India");


//apply
peintDetails.apply(userDetails2, ["Mahrashtra", "India"]);


//Bind
let newFun = peintDetails.bind(userDetails, "Mahrashtra", "India");
newFun();
