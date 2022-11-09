import React, { useRef } from "react";

function RefTutorial() {
    //react say that use that time most importan in app
    //Drectly DOM manuplation
    //
    const inputRef = useRef(null);

    const onClick = () => {
        inputRef.current.value = "";
    };
    return (
        <div>
            <h1>Pedro</h1>
            <input type="text" placeholder="Ex..." ref={inputRef} />
            <button onClick={onClick}>Change Name</button>
        </div>
    );
}

export default RefTutorial;