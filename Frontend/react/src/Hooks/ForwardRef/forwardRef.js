import React from 'react'
import { useRef } from "react";
import User from './user'

export default function forwardRef() {
    const inputRef = useRef(null);
    function updateInput() {
        inputRef.current.value = "1000"
    }
    return (
        <div>
            <h1>forwardRef in react</h1>
            <User ref={inputRef} />
            <button onClick={updateInput}>Update InputBox</button>
        </div>
    )
}
