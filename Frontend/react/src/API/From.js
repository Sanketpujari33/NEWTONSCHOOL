import React from 'react'
import { useState } from 'react'


export default function From() {
    const [name, setName] = useState("")
    const [email, setEmail] = useState("")
    const [mobile, setMobile] = useState("")
function saveUser(){
    console.log(name, email, mobile);
    let data=(name,email, mobile)
    fetch('',{
        method:"POST",
        headers:{
            'Accept':'application/json',
            'Content-Type':'application/json'
        },
        body:JSON.stringify(data)
    }).than((result)=>{
        console.log(result);
        result.json().than((res)=>{
            console.log(res);
            
        })
    })
    
}
    return (
        <div>
            <h1>Post Api EXAMPLE</h1>
            <input type="text" value={name} onChange={(e) => { setName(e.target.value) }} name="name" /><br /><br />
            <input type="text" value={email} onChange={(e) => { setEmail(e.target.value) }} name="email" /><br /><br />
            <input type="text" value={mobile} onChange={(e) => { setMobile(e.target.value) }} name="mobile" /><br /><br />
            <button type='button' onClick={saveUser}>Update New User</button>
        </div>
    )
}
