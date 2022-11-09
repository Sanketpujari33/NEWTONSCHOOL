import React, { useState } from 'react'

export default function controllComonent() {
    //  ControllComponent handel with state that resone coled conrtoll componet 
    const [state, setstate] = useState("");
    return (
        <div>
            <h1>Conrolled Component</h1>
            <input type="text" value={state} onChange={(e) => setstate(e.target.value)} />
        </div>
    )
}
