//get requset

// let fetchBtn=document.getElementById('fetchbtn');
// fetchBtn.addEventListener('click', buttonClickHansler);

// function buttonClickHansler(){
//     console.log('You have click the button Click');

//     const xhr= new XMLHttpRequest();

//     xhr.open("GET", "https://jsonplaceholder.typicode.com/todos/1", true);

//     xhr.onprogress=()=>{
//         console.log('On Progress');
//     }
//     xhr.onreadystatechange=()=>{
//         console.log('ready state is: ', xhr.readyState);
//     }
//     xhr.onload=function(){
//         if(this.status==200){
//             console.log(this.responseText);
//         }else{
//             console.log('Some error occured');
//         }

//     }
//     xhr.send();
//     console.log('We are done!');
// }

// post requset

// let fetchBtn = document.getElementById("fetchbtn");
// fetchBtn.addEventListener("click", buttonClickHansler);

// function buttonClickHansler() {
//   console.log("You have click the button Click");

//   const xhr = new XMLHttpRequest();

//   xhr.open("POST", "https://dummy.restapiexample.com/api/v1/create", true);

//   xhr.getResponseHeader("Content-type", "application/json");
//   xhr.onprogress = () => {
//     console.log("On Progress");
//   };
//   xhr.onreadystatechange = () => {
    // console.log("ready state is: ", xhr.readyState);
//   };
//   xhr.onload = function () {
//     if (this.status == 200) {
//       console.log(this.responseText);
//     } else {
//       console.log("Some error occured");
//     }
//   };
//   params=`{"name":"test413234adas24","salary":"123", "age":"23"}`;
//   xhr.send(params);
//   console.log("We are done!");
// }



// let fetchBtn=document.getElementById('fetchbtn');
// fetchBtn.addEventListener('click', buttonClickHandler);
// function buttonClickHandler(){

// }


let popBtn=document.getElementById('popbtn');
popBtn.addEventListener('click', popHandler);


function popHandler(){
  console.log("You have click the pop Handler");

  const xhr = new XMLHttpRequest();

xhr.open('GET', 'https://dummy.restapiexample.com/api/v1/employees', true);


  xhr.onload = function () {
    if (this.status === 200) {

      let obj=JSON.parse(this.responseText);

      console.log(obj);
      let list =document.getElementById('list');
      str="";
      for(key in obj)
      {
        str += `<li>${obj[key].employee_name}</li>`;
      }
      list.innerHTML=str;
    } else {
      console.log("Some error occured");
    }
  };

  xhr.send();
  console.log("We are done fetching employees!");
}

