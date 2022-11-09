import React, { Component } from 'react';
import { CommonContext } from './CommonContext'

class Header extends Component {
    render() {
        return (
            <div>
                <CommonContext.Consumer >
                    {
                        ({color})=>(
                        <h1 style={{backgroundColor:color}}>HeaderPage</h1>
                    )
                    }
                </CommonContext.Consumer>
            </div>
        );
    }
}

export default Header;
