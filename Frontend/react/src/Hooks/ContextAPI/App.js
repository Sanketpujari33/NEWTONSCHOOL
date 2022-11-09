import React, { Component } from 'react';
import { CommonContext } from './CommonContext'
import Footer from './Footer';
import Header from './Header';
import Main from './Main';
import UpdateButton from './UpdateButton';

class App extends Component {
    constructor(){
        super();
        this.updateColor=(color)=>{
            this.setState({
                color:color
            })
        }
        this.state={
            color:"orange",
            updateColor:this.updateColor
        }
    }
    render() {
        return (
            <div>
                <CommonContext.Provider value={this.state}>
                <Header/>
                    <h1>Complete and Easy Example for Context API</h1>
                    <Main/>
                    <UpdateButton/>
                <Footer/>
                </CommonContext.Provider>
            </div>
        );
    }
}

export default App;
