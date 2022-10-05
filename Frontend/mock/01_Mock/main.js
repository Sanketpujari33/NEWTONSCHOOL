function dis(data){
    document.getElementById('input').value+=data;
}
function clr(){
    document.getElementById("input").value="";
}
function result(){
    let equal=document.getElementById('input').value;
    let ans=eval(equal);
    document.getElementById('input').value =ans;
}