import React, { PureComponent } from 'react';
import '../App.css';

class PureComonents extends PureComponent {
    constructor(){
        super();
        this.state={
            count:1
        }
    }
    render() {
        console.log('check-rerending');
        
        return (
            <div className='App'>
                <h1>Pure Component {this.state.count}</h1>
                <button onClick={()=>this.setState({count:this.state.count+1})}>update Count</button>
            </div>
        );
    }
}

export default PureComonents;
