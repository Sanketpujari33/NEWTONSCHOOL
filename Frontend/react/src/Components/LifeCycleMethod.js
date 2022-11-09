import React, { Component } from "react";
import Student from "./Student";
class LifeCycleMethod extends Component {
    constructor() {
        //constructor are life Cycle method 
        super();
        console.log("2ST constructor");
        this.state = {
            count: 0,
            name: "sanket",
            show: true,
        };
    }
    componentDidMount() {
        console.log("componentDidMount");
        //ApI, Hide Show,Any Opration depand on Html page
        //Api Call
        // 1st render call after com0nentDidMount call
        //html page ready aftr rendr the didmount
        //No effect any changes like propas State in this component
    }
    componentDidUpdate(preProps, preState, snapshot) {
        // preProps this are show the preveous value in props
        // preState this are show the preveous value in state
        console.log("componentDidUpdate", preState.count === this.state.count);
        if (preState.count === this.state.count) {
            alert("State is alreday some");
        }
        // state are change with condition
        // do no use condtion goss on infinit loop
        if (this.state.count < 10) {
            this.setState({
                count: this.state.count + 1,
            });
        }
        //in this componentDidUpdate use ApI but use condition in the update function
    }
    shouldComponentUpdate() {
        console.log("shouldComponentUpdate");
        // It can stop rendering(rendating a block)
        //Use with state and props.
        //spasfic rendering are stop
        //apliction proformance and speed incress
        // use a specific conditiin stopping the rendering process
        //frist call the ShouldComponentUpdate after call componentDidUpdate method
        if (this.state.count > 5 && this.state.count < 10) {
            return true;
        }
        return false;
    }
    componentWillUnmount() {
        alert("The component has been unmounted.");
        //data Loading is stopped  by default  when the component is  removed from the DOM
        //setTimeInterval stopped by default when the component is removed from the DOM
        // Any Event and Function call this method
    }
    render() {
        // render are life cycle methode use to 
        //conpond ready, state and props change
        console.log("1ed render");

        return (
            <>
                <div>
                    <h1> componentDidUpdate {this.state.count} </h1>

                    <button
                        onClick={() => {
                            this.setState({ count: this.state.count + 1 });
                        }}
                    >
                        count{" "}
                    </button>
                </div>
                <div>
                    <h1> componentDidMount {this.state.name} </h1>
                    <button
                        onClick={() => {
                            this.setState({
                                name: (this.state.name = "Pujari"),
                            });
                        }}
                    >
                        count{" "}
                    </button>{" "}
                </div>{" "}
                <div>
                    <h1> componentWillUnmount </h1>
                    this.state.show ? <Student /> : <h1>
                        {" "}
                        Chiled Component Remove{" "}
                    </h1>{" "}
                    <button
                        onClick={() =>
                            this.setState({
                                show: this.State.show,
                            })
                        }
                    >
                        {" "}
                        Toggle Child Component{" "}
                    </button>{" "}
                </div>{" "}
            </>
        );
    }
}

export default LifeCycleMethod;
