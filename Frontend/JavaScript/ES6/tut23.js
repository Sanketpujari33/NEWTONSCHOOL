console.log("This is tutorial 23");
// Throttling in javaScript
const myThrottle=(callback, time)=>{
    return (...args)=>{
        document.getElementById("btn").disabled = true;
        setTimeout(()=>{
            callback();
        },time);

    }
}

const newFun=myThrottle(()=>{
    document.getElementById("btn").disabled = false;
 console.log("User Clicked.!! ");
},4000);