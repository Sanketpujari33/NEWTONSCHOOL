import React, { Component } from 'react';
import { CommonContext } from './CommonContext'

class Main extends Component {
    render() {
        return (
            <div>
                <CommonContext.Consumer >
                    {
                        ({color})=>(
                        <h1 style={{backgroundColor:color}}>Hello, This is Main Page</h1>
                    )
                    }
                </CommonContext.Consumer>
            </div>
        );
    }
}

export default Main;
