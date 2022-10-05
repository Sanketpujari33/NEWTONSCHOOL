console.log("This is tutorial 25");
//Event Bubbling & Capturing
//Stop Propagation, Immediadate Propagation & Prevent Default


let div = document.querySelector("div");
let btn = document.querySelector("button");
let a =document.querySelector('a');

// bubbling
// div.addEventListener("click", () => {
//   console.log("div");
// });
// btn.addEventListener("click", () => {
//   console.log("Button");
// });


//Capturing
// div.addEventListener(
//   "click",() => {
//     console.log("div");
//   }, true);
// btn.addEventListener(
//   "click",() => {
//     console.log("Button");
//   },true);


//Stop Propagation
// div.addEventListener("click", () => {
//   console.log("div");
// });
// btn.addEventListener("click", (event) => {
//     event.stopPropagation();
//   console.log("Button");
// });


// Immediadate Propagation

// div.addEventListener("click", () => {
//   console.log("div");
// });
// btn.addEventListener("click", (event) => {
//   console.log("Button");
// });
// btn.addEventListener("click", (event) => {
//   console.log("Button1");
// });


// StopImmediadate Propagation

// div.addEventListener("click", () => {
//   console.log("div");
// });
// btn.addEventListener("click", (event) => {
//   console.log("Button");
// });
// btn.addEventListener("click", (event) => {
//     event.stopImmediatePropagation();
//   console.log("Button1");
// });



//  Prevent Default
a.addEventListener('click',(e)=>{
    e.preventDefault();
    console.log("LINK");
})