/*
You Have to Create a div and inject it into page which contains a heading
whenever someone clicks on the div, it dhould be cons=verted into an editable
item wheneveruser clicks any (blur). save the into local storege.
*/

// create a new Element
let divElem=document.createElement('div');

// Add text to that created element

let text=document.createTextNode('This is my element, click to edit it');
divElem.appendChild(text);
//Give element id, style and class
divElem.setAttribute('id','elem');
divElem.setAttribute('style','border: 2px solid black; width: 154px; margin: 34px; padding: 23px;');
divElem.setAttribute("class", "elem");


// graph the main container
let container=document.querySelector('.container');
let first= document.getElementById('myfirst');


//insert  div element before element with id first
container.appendChild(divElem, first);

console.log(divElem, container, first);

//add event listener to the divElem

divElem.addEventListener('click',()=>{
    let nTextAreas= document.getElementByClassName('textarea').length;
    if(nTextAreas == 0){
    let html=elem.innerHTML;
    divElem.innerHTML=`<textarea class="textarea from-control" id="textarea" row="3">${html}<textarea>`;
    }
    //listen for the blur event on textarea
    let textarea=document.getElementById('textarea');
    textarea.addEventListener('blur',()=>{
        elem.innerHTML=textarea.value;
    })
});



