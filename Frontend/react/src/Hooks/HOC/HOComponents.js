import React, { useState } from 'react'

export default function HOComponents() {
    return (
        <div>
            <h1>HOC</h1>
            <HOCRed cmp={Counter} />
            <HOCGreen cmp={Counter} />
            <HOCBlue cmp={Counter} />
        </div>
    )
}
function HOCRed(props) {
    return (
        <h1 style={{ backgroundColor: 'red', width: 100 }}>Red<props.cmp /></h1>

    )
}
function HOCGreen(props) {
    return (
        <h1 style={{ backgroundColor: 'green', width: 100 }}>Green<props.cmp /></h1>

    )
}
function HOCBlue(props) {
    return (
        <h1 style={{ backgroundColor: 'blue', width: 100 }}>Blue<props.cmp /></h1>

    )
}
function Counter() {
    const [state, setstate] = useState(0);
    return (
        <div>
            <h3>{state}</h3>
            <button onClick={setstate(state + 1)}>Update</button>
        </div>
    )

}