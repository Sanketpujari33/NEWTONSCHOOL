// post requset

let fetchBtn = document.getElementById("fetchbtn");
fetchBtn.addEventListener("click", buttonClickHansler);

function buttonClickHansler() {
  console.log("You have click the button Click");

  const xhr = new XMLHttpRequest();

  xhr.open("POST", "https://dummy.restapiexample.com/api/v1/create", true);

  xhr.getResponseHeader("Content-type", "application/json");
  xhr.onprogress = () => {
    console.log("On Progress");
  };
  xhr.onreadystatechange = () => {
console.log("ready state is: ", xhr.readyState);
  };
  xhr.onload = function () {
    if (this.status == 200) {
      console.log(this.responseText);
    } else {
      console.log("Some error occured");
    }
  };
  params=`{"name":"test413234adas24","salary":"123", "age":"23"}`;
  xhr.send(params);
  console.log("We are done!");
}
