//Async Js Programing
//Callback, Promises, Async & Await


const cities = [
  { name: "Los Angeles", population: 3792621 },
  { name: "New York", population: 8175133 },
  { name: "Chicago", population: 2695598 },
  { name: "Houston", population: 2099451 },
  { name: "Philadelphia", population: 1526006 },
];

function getDatas(){
    setTimeout(()=>{
            cities.forEach((cities, index)=>{
                output+=`<li>${index}</li>`;
            })
            document.body.innerHTML=output
    },5000);
}
function creatdata(newData){
    setTimeout(()=>{
cities.puch(newData);
    },2000);
}
getDatas();
creatdata({ name: "india", population: 2695598937 });