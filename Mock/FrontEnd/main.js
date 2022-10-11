// // let fetchbtn=document.getElementById('fetchBtn');
// // fetchbtn.addEventListener('click', buttonClickHandler);

// // function buttonClickHandler(){
// // console.log('You have clicked the button click');

// //     const xhr=new XMLHttpRequest();

// //     xhr.open('GET' ,"Sanket.txt", true);
// // xhr.open('GET', "https://jsonplaceholder.typicode.com/todos/1", true);

// //     xhr.onreadystatechange=function(){
// //         console.log('ready state is', xhr.readyState);

// //     }
// //     xhr.onprogress=function(){
// //         console.log('On progress');
// //     }
// //     xhr.onload = function () {
// //         if(this.status===200){
// //             console.log(this.responseText);

// //         }else{
// //             console.log("Some Erre occured");
// //         }
// //     }
// //     xhr.send();
// // console.log('We Are Dane!');
// // }


// // let fetchbtn = document.getElementById('fetchBtn');
// // fetchbtn.addEventListener('click', buttonClickHandler);

// // function buttonClickHandler() {
// //     console.log('You have clicked the button click');
// //     const xhr = new XMLHttpRequest();
// //     xhr.open("POST", "http://dummy.restapiexample.com/api/v1/create", true);
// //     xhr.getResponseHeader("Content-type", "application/json");

// //     xhr.onprogress = function () {
// //         console.log('On progress');
// //     }
// //     xhr.onload = function () {
// //         if (this.status === 200) {
// //             console.log(this.responseText);
// //         } else {
// //             console.log("Some Erre occured");
// //         }
// //     }

// //     params = `{"name":"test34545","salary":"123","age":"23"}`;
// //     xhr.send(params);
// //     console.log('We Are Dane!');
// // }



// // let popBtn = document.getElementById('popBtn');
// // popBtn.addEventListener('click', popHandler);

// // function popHandler() {
// //     console.log('You have clicked the pop handler');
// //     const xhr = new XMLHttpRequest();
// //     xhr.open("GET", "http://dummy.restapiexample.com/api/v1/employees", true);
// //     xhr.onload = function () {
// //         if (this.status === 200) {
// //             let obj = JSON.parse(this.responseText);
// //             console.log(obj);
// //             let list = document.getElementById("list");
// //             str = "";
// //             for (key in obj) {
// //                 str += `<li>${obj[key].data[employee_name]}</li>`;
// //             }
// //             list.innerHTML = str;
// //         } else {
// //             console.log("Some error occured");
// //         }
// //     };

// //     // send the request
// //     xhr.send();
// //     console.log("We are done fetching employees!");
// // }


// // let myBtn=document.getElementById("myBtn");

// // let constent=Document.getElementById('content');

// // function getData(){
// //     console.log('Start GetData');
// //     url="Sanket.txt";
// //     fetch(url).then((response)=>{
// //         console.log('Inside frist than');

// //         return response.text();
// //     }).than((data)=>{
// //         console.log('Inside second then');

// //         console.log(data);

// //     })
// // }

// // console.log('Before running getData');
// // getData();
// // console.log('After running getdata');



// // let myBtn = document.getElementById("myBtn");
// // let constent = Document.getElementById('content');
// // function getData() {
// //     url = "https://api.github.com/users";
// //     fetch(url).then((response) => {
// //         return response.text();
// //     }).than((data) => {
// //         console.log(data);
// //     })
// // }
// // getData();




// // let myBtn = document.getElementById("myBtn");
// // let constent = Document.getElementById('content');
// // function getData() {
// //     params ={
// //         methad: 'post',
// //         headers:{
// //             'Accept':'application/json',
// //             'Content -Type':"application/json",
// //         }
// //     }
// //     url = "https://api.github.com/users";
// //     fetch(url,params).then((response) => {
// //         return response.text();
// //     }).than((data) => {
// //         console.log(data);
// //     })
// // }
// // getData();

// // const thead = document.querySelector("table > thead > tr");
// // const tbody = document.querySelector("table > tbody");

// // const iplData = document.getElementById('iplData');
// // const url = "https://my-json-server.typicode.com/FreSauce/json-ipl/data";
// // fetch(url).then((result) => {
// //     result.json().then((res) => {
// //         getData(res)
// //     })
// // })

// // function getData(data){
// // Object.keys(data[0]).forEach(altr=>{
// //     thead.innerHTML+=`<th>${altr}</th>`;
// // });
// // data.forEach(ele=>{
// // let append="";
// // append+="<tr>";
// // Object.values(ele).forEach(entry=>{
// //     append+=`<td>${entry}</td>`;

// // });
// // append+="</tr>"
// // tbody.innerHTML+=append;
// // });
// // }




// function sumbit(){
//     var id = document.getElementById("id");
//     var pass = document.getElementById("pass");
    

    
// }


//Js flat array Method?
// const items = [1, 2, 3, [5, 5], [[8, 9]], [99], 125];
    
//     function flatArray(items) {
//       return items.reduce((arrayData, element) => {
//         if (Array.isArray(element)) {
//           arrayData = [...arrayData, ...flatArray(element)];
//         } else {
//           arrayData = [...arrayData, element];
//         }
//         return arrayData;
//       }, []);
//     };
    
//     console.log(flatArray(items));
//     // [1, 2, 3, 5, 5, 8, 9, 99, 125]

//     const result = {
//        number: flatArray(items),
//     };





    
// var arr = [['object1', 'object2'],['object1'],['object1','object2','object3']];
// var flattened = [].concat.apply([],arr);


// [['object1'], ['object2']].flat() // ['object1', 'object2']


//Js flat array Method You have complet a function take tow parameters array, integer depth?


