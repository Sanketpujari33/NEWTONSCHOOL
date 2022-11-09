import React from 'react'
import {useSearchParams} from 'react-router-dom'

export default function Filter() {
    const[ SearchParams, setSearchParams]=useSearchParams();
    const age=SearchParams.get('age');
    const city=SearchParams.get('city')
  return (
    <div>
      <h1>Filter Page</h1>
      <h3>Age is: {age}</h3>
      <h3>City is: {city}</h3>
      <input type="text" onChange={(e)=>setSearchParams({text:e.target.value, age:10, city:"Kolhar"})} placeholder="Set Age In Query Prams"/>
      <button onClick={()=>setSearchParams({age:40})}>Set Age In Query Prams</button>
    </div>
  )
}
