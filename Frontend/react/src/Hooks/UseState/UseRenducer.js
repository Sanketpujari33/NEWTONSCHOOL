import React from 'react'
import { useReducer } from 'react'

const initialState = { count: 0 };
function reducer(state, action) {
    switch (action.type) {
        case 'increment':
            return { count: state.count + 1 };
        case 'decrement':
            return { count: state.count - 1 };
        default:
            throw new Error();
    }
}
function UseRenducer() {
    const [state, dispatch] = useReducer(reducer, initialState);

    return (
        <div>
            <button onClick={() => dispatch({ type: 'increment' })}>Increment</button>
            <br />
            <h1>Count: {state.count}</h1>
            <br />
            <button onClick={() => dispatch({ type: 'decrement' })}>Decrement</button>
        </div>
    )
}

export default UseRenducer