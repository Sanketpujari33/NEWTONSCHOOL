console.log("This is tutorial 22");
// Debouncing in javaScript

let search=document.getElementById('search');




let counter=0;
function getData(){
    counter=counter+1;
console.log('Fetching Data ' + counter);
}

function myDebounce(callBack, time){
    let timer;
    return (...args)=>{
    if (timer) clearTimeout(time);
    timer=setTimeout(()=>{
            callBack();
    },time)
    }
}

const BetterFunction=myDebounce(getData,1000);