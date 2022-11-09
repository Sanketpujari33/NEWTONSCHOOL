import React, { Component } from 'react';
import { CommonContext } from './CommonContext'

class Footer extends Component {
    render() {
        return (
            <div>
                <CommonContext.Consumer >
                    {
                        ({color})=>(
                        <h1 style={{backgroundColor:color}}>Footer Page</h1>
                    )
                    }
                </CommonContext.Consumer>
            </div>
        );
    }
}

export default Footer;
