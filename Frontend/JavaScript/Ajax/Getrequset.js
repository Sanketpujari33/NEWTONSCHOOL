// get requset

let fetchBtn=document.getElementById('fetchbtn');
fetchBtn.addEventListener('click', buttonClickHansler);

function buttonClickHansler(){
    console.log('You have click the button Click');

    const xhr= new XMLHttpRequest();

    xhr.open("GET", "https://jsonplaceholder.typicode.com/todos/1", true);

    xhr.onprogress=()=>{
        console.log('On Progress');
    }
    xhr.onreadystatechange=()=>{
        console.log('ready state is: ', xhr.readyState);
    }
    xhr.onload=function(){
        if(this.status==200){
            console.log(this.responseText);
        }else{
            console.log('Some error occured');
        }

    }
    xhr.send();
    console.log('We are done!');
}
