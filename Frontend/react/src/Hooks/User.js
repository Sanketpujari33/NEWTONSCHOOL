import React, { useEffect, useRef } from 'react'

export default function User(props) {
    const ref = useRef();
    useEffect(()=>{
        ref.current=props.state;
    })
    const previousProps=ref.current;
  return (
    <div>
     <h1>Diff {previousProps-props.state}</h1>
      <h1>Current Value {props.state}</h1>
      <h1>previous valu {previousProps}</h1>
    </div>
  )
}
