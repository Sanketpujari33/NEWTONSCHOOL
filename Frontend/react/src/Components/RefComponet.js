import React, { Component, createRef } from 'react';

class RefComponet extends Component {
    constructor(){
        super();
        this.inputRef=createRef();
    }
    componentDidMount(){
        console.log(this.inputRef.current.value="1000");
        
    }
    getValue(){
        console.log(this.inputRef.current.value);
        this.inputRef.current.style.color='red';
        this.inputRef.current.style.backgroundcolor='black';
    }
    render() {
        return (
            <div>
                <h1>Ref in React</h1>
                <input type="text" ref={this.inputRef}/>
                <button>Check Ref</button>
            </div>
        );
    }
}

export default RefComponet;
