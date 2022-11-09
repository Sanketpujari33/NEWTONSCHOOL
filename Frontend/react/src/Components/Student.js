import React, { Component } from 'react'

class Student extends Component {
        componentWillUnmount() {
            alert("The component has been unmounted.");
            
        }
    render() {
        return (
            <div className='App'>
                <h1> Student Components</h1>
            </div>
        )
    }
}
export default Student