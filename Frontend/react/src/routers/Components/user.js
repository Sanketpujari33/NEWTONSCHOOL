import React from 'react'
import {useParams, useLocation} from 'react-router-dom'

function User() {
    const params=useParams;
    const {name}=params();

 const location=useLocation();
    console.log(location);
    
    // get hash #1000
    //get key  is are get a unique any route
    // pathname path link component
    //search prams
    //state
    return (
        <div>
            <h1>This is {name} Page</h1>
        </div>
    )
}
export default User