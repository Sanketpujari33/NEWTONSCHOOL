import React, { useState } from 'react'

const initialCount = 0;

function Counter() {
    const [count, setCount] = useState(initialCount);


    return (
        <div>
            <h1>Function Components</h1>
            <p>Click {count} time</p>
            <button onClick={() => setCount((c) => c + 1)}> Click Me</button>
        </div>
    )
}

export default Counter;