import React, { useState } from 'react'
import User from './User'
export default function PreviousProps() {
    const [state, setstate] = useState(0)
  return (
    <div>
      <User state={state}/>
      <button onClick={()=>setstate(Math.floor(Math.random()*10))}>Update Counter</button>
    </div>
  )
}
