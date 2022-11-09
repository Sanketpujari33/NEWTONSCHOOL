import { useState, useMemo } from "react";
import React from 'react'
import '/src/App.css'
export default function MemoPratise() {
    const [count, setcount] = useState(0);
    const [item, setitem] = useState(10);

    const multicount=useMemo(
        function multicount(){
        console.log('Multicount');
        return  count*5;
    }
    )
    
    // function multicount(){
        // console.log('Multicount');
        
    //     return  count*5;
    // }
    return (
        <div className="App">
            <h1>useMemo Hook is react</h1>
            <h2>Count:{count}</h2>
            <h2>Item:{item}</h2>
            <h2>multicount:{multicount}</h2>
            <button onClick={() => setcount(count + 1)}>update count</button>
            <button onClick={() => setitem(item * 10)}>update Item</button>
        </div>
    )
}
