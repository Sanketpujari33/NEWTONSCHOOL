import React, { Component } from 'react';
import { CommonContext } from './CommonContext'

class UpdateButton extends Component {
    render() {
        return (
            <div>
                <CommonContext.Consumer >
                    {
                        ({ updateColor }) => (
                            <div>
                                <button onClick={() => updateColor('yellow')}>yellow</button>
                                <button onClick={() => updateColor('red')}>red</button>
                            </div>
                        )
                    }
                </CommonContext.Consumer>
            </div>
        );
    }
}

export default UpdateButton;