let globlNumbers=[]
let sorter=null
let globlIndex=0
function bubbleSort(arr){
    const states=[]
    const n=arr.length
    for(let i=0; i<n; i++){
        for(let j=0; j<n-1-i; j++){
            if(arr[j]>arr[j+1]){
                [arr[j],arr[j+1]]=[arr[j+1],arr[j]]

                states.push([arr[j],arr[j+1],'swop'])
            }else{
                states.push([arr[j],arr[j+1],'no-swop'])
            }
        }
    }
    return states;
}
function htmlToElement(html){
    var templete=document.createElement('template');
    html=html.trim();
    templete.innerHTML=html;
    return templete.content.firstChild;
}
function createArray(e){
    e.preventDefault()
    const number =document.getElementById('numbers_input').value
    const numbersArray=number.split(',').map(num=>parseInt(num.trim(),10)).filter(num=>Number.isInteger(num))
    globlNumbers=numbersArray
    sorter=null
    globlIndex=0
    const main =document.getElementById('numbers-display')
}
function createArrayMarkup(array){
    const els=array.map((num, idx) =>`<div class="num num-${idx}" data-val="${num}"style="width:14px;height:${num*16}px;order:${idx+1}">${num}</div>`)
    els.push(`</div>`)
    els.unshift(`<div class="num-holder"></div>`)
    return els.join("")
}
function next(){
    if(sorter===null){
        sorter=bubbleSort(globlNumbers)
    }
    const k=sorter[globlIndex]
    globlIndex++;
    console.log(k);
    if(k){
        const [p,q,r]=k
        if(r!==`no-swop`){
            updateDisplayArray(p, q)
        }
        tempHighlight(p, q)
    }
}
function updateDisplayArray(p, q){
    const r=document.querySelector(`[data-val="${p}"]`)
    const s=document.querySelector(`[data-val="${q}"]`)
    const temp=r.style.order
    r.style.order=s.style.order
    s.style.order=temp
}
function tempHighlight(p, q){
   const r=document.querySelector(`[data-val="${p}"]`)
    const s=document.querySelector(`[data-val="${q}"]`)
    r.style.border=s.style.border=`2px solid black`
    setTimeout(()=>{
        r.style.border=s.style.border=``
    },100)
}