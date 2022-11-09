import React from 'react'
import { useState } from 'react'

export default function StateWithObject() {
    const [state, setstate] = useState({name:'Sanket', age:23});
  return (
    <div>
      <h1>State Object with Hooks</h1><br/>
      <input type="text" placeholder="enter Name" value={state.name} onChange={(e)=>{setstate({...state,name:e.target.value})}}/><br/><br/>
      <input type="text" placeholder="enter Age" value={state.age} onChange={(e)=>{setstate({name:state.name,age:e.target.value})}}/><br/><br/>
      <h2>{state.name}</h2><br/>
      <h2>{state.age}</h2><br/>
    </div>
  )
}
