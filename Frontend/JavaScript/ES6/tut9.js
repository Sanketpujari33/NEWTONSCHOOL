console.log("This is my tutorial 42");

fetch("/js/users.json")
  .then((response) => {
    // handle response data
  })
  .catch((err) => {
    // handle errors
  });

fetch("URL here")
  .then((res) => res.json())
  .then((json) => console.log(json));



fetch("https://api.github.com/orgs/nodejs")
  .then((response) => response.json())
  .then((data) => {
    console.log(data); // Prints result from `response.json()` in getRequest
  })
  .catch((error) => console.error(error));




let data = {
  first_name: "John",
  last_name: "Adams",
  job_title: "Software Engineer",
};
const options = {
  method: "POST",
  body: JSON.stringify(data),
  headers: {
    "Content-Type": "application/json",
  },
};
fetch("https://reqres.in/api/users", options)
  .then((res) => res.json())
  .then((res) => console.log(res));




// Button with id myBtn
let myBtn = document.getElementById("myBtn");

// div with id content
let content = document.getElementById("content");

// function getData(){
//     console.log("Started getData")
//     url = "Sanket.txt";
//     fetch(url).then((response)=>{
//         console.log("Inside first then")
//         return response.text();
//     }).then((data)=>{
//         console.log("Inside second then")
//         console.log(data);
//     })
// }

function getData() {
  console.log("Started getData");
  url = "https://api.github.com/users";
  fetch(url)
    .then((response) => {
      console.log("Inside first then");
      return response.json();
    })
    .then((data) => {
      console.log("Inside second then");
      console.log(data);
    });
}

function postData() {
  url = "http://dummy.restapiexample.com/api/v1/create";
  data = '{"name":"sanketb347485945","salary":"123","age":"23"}';
  params = {
    method: "post",
    headers: {
      "Content-Type": "application/json",
    },
    body: data,
  };
  fetch(url, params)
    .then((response) => response.json())
    .then((data) => console.log(data));
}

// console.log("Before running getData")
// getData()
// console.log("After running getData")
postData();
