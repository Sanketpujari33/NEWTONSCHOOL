import React from 'react'
import { useState } from 'react';

export default function PreviousState() {
    const [state, setstate] = useState(1);
    function updateCounter(){
        // let random=Math.floor(Math.random()*10);
        // setstate((pre)=>{
        //     if(pre<5){
        //     alert("low value");
        //     }else{
        //         return random;
        //     }
        // });
        for (let index = 0; index < 5; index++) {
            setstate((pre)=>{
                return pre+1;
            })
            
        }
    }
  return (
    <div>
        <h1>{state}</h1>
        <button onClick={updateCounter}>Click Me to Update Counter</button>
    </div>
  )
}
