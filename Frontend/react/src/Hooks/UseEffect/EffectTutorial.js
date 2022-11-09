import React, { useEffect, useState } from "react";
import axios from "axios";

function EffectTutorial() {
    const [data, setData] = useState("");
    const [count, setCount] = useState(0);

    useEffect(() => {
        //combination of componentDidMount,componentDidUpdate, componentWillUnmount,
        //Component started THAT TIME IS call useEffect
        //any states and props that time call useEffect
        // update if make condition changes
        axios
            .get("https://jsonplaceholder.typicode.com/comments")
            .then((response) => {
                setData(response.data[0].email);
                console.log("API WAS CALLED");
            });
    }, []);

    return (
        <div>
            Hello World
            <h1>{data}</h1>
            <h1>{count}</h1>
            <button
                onClick={() => {setCount(count + 1);}}>
                Click
            </button>
        </div>
    );
}

export default EffectTutorial;