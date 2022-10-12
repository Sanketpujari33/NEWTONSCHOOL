// let element = document.getElementById('myFirst');
// element.style.color='red';
// element.innerText='Sanket Pujari is Best web Deve';
// element.innerHTML=`<br>Sanket Are smart bod</br>`;
// console.log(element);
// let sel=document.querySelector('#sel');
// sel = document.querySelector('.child');
// sel = document.querySelector("#sel");
// sel = document.querySelector('div');
// sel.style.color='green';
// console.log(sel);

// let elms=document.getElementsByClassName('child');

// elms = document.getElementsByClassName("container");
// elms=document.getElementsByTagName('div');
// console.log(elms);
// console.log(elms[0].getElementsByTagName('child'));
// for (let index = 0; index < elms.length; index++) {
//     const element = elms[index];
//     console.log(element);
//     element.style.color = "pink";

// }

// Array.from(elms).forEach(element=>{
// // console.log(element);
// element.style.color='pink';
// });

// let cont=document.querySelector('.no');
// cont = document.querySelector(".container");
// console.log(cont.childNodes);
// console.log(cont.children);
// let nodeName=cont.childNodes[1].nodeName;
// let nodeType = cont.childNodes[13].nodeType;
// console.log(nodeType);
/*
1.Element
2.Attribut
3.Text Node
8.Comments
9.document
10.docType
*/
// let container=document.querySelector('div.container');
// console.log(container.children[1].children[0].children);
// console.log(container.firstChild);
// console.log(container.firstElementChild);

// console.log(container.lastChild);
// console.log(container.lastElementChild);
// console.log(container.children);
// console.log(container.childElementCount);

// console.log(container.firstElementChild.parentElement);
// console.log(container.firstElementChild.nextElementSibling);
// console.log(container.firstElementChild.nextElementSibling.nextElementSibling);

// let element=document.createElement('li');
// let text=document.createTextNode('I  am a text node');
// element.appendChild(text);

// element.className='childul';
// element.id='createLi';
// element.setAttribute('tital','mytitle');
// element.innerHTML = `<b>Hello this is created by sanket</b>`;
// let ul=document.querySelector('ul.this');
// ul.appendChild(element);
// console.log(element);

// let elm2=document.createElement('h3');
// elm2.id='elem2';
// elm2.className='elem2';
// let tnode=document.createTextNode('this is a created node for elem2');
// elm2.appendChild(tnode);
// element.replaceWith(elm2);
// let myul=document.getElementById('myul');
// myul.replaceChild(element, document.getElementById('fst1'));

// document.getElementById('heading').addEventListener('mouseover',function(e){
//     let veriable;
//     console.log('You have clicked the heading');
//     veriable=e.target.className;
//     veriable = e.target.classList;
//     veriable =Array.from(e.target.classList);
//     veriable = e.target.id;
//     veriable = e.offsetX;
//     veriable = e.offsetY;
//     veriable = e.clientX;
//     veriable = e.clientY;
//     console.log(veriable);
// });

// let btn=document.getElementById('btn');
// btn.addEventListener('click', func1);
// btn.addEventListener("dblclick", func2);
// function func1(e){
//     console.log("Thanks",e);
//     e.preventDefault();
// }
// function func2(e) {
//     console.log("Thanks its a doubleclick", e);
//     e.preventDefault();
// }

// let it=document.querySelector('.no').addEventListener('mouseenter',func5);

// function func5(e){
// // e.style.color='red';
// this.style.color='red';
// console.log('wvdhjwkj');
// }

// let t=document.querySelector(".no").addEventListener("mouseleave",func7);
// function func7(e) {
//   this.style.color = "blue";
//   console.log("This exited no");
// };

// document.querySelector('.container').addEventListener('mousemove',function(e){
//     console.log(e.offsetX, e.offsetY);
//     document.body.style.backgroundColor=`rgb(${e.offsetX},155,0)`;
// console.log("You triggered mouse move event");
// });

// let str = "python";
// let li = document.links;
// console.log(li);
// Array.from(li).forEach((element) => {
//   href = element.href;
//   if (href.includes(str)) {
//     console.log(href);
//   }
// });
// let impArray=['adrak','pyaz','bhindi'];
// localStorage.setItem('Name','Harry');
// localStorage.setItem('Name2', 'Shekhar');
// localStorage.setItem("sabzi", JSON.stringify(impArray));
// // localStorage.clear();
// let names=localStorage.getItem('Name');

// names=JSON.parse(localStorage.getItem("sabzi"));
// console.log(names);
// console.log(typeof names);
// let impArray = ["adrak", "pyaz", "bhindi"];
// sessionStorage.setItem("Name", "Harry");
// sessionStorage.setItem("Name2", "Shekhar");
// sessionStorage.setItem("sabzi", JSON.stringify(impArray));
// localStorage.clear();
// let names = localStorage.getItem("Name");

// names = JSON.parse(sessionStorage.getItem("sabzi"));
// console.log(names);
// console.log(typeof names);

let div = document.createElement("div");
div.setAttribute("id", "edit");
div.innerText = "Double Click on me to Edit";

// It will increase the text size when mouseover on it.
div.addEventListener("mouseover", function () {
  div.style.fontSize = "150%";
});

// Appending the element to the body
document.body.appendChild(div);

// Creating the editable element
//Whenever someone double click on the text it will turn to editable.
let inpt = document.createElement("input");
inpt.setAttribute("value", "");
document.getElementById("edit").addEventListener("dblclick", function () {
  div.replaceWith(inpt);
});

// Click outside to save the text into local storage as (Edited) name.
inpt.addEventListener("blur", function () {
  localStorage.setItem("Edited", JSON.stringify(inpt.value));
});