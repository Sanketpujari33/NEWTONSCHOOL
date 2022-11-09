//What is Redux
//A Container where you can store your whole application data.
//So we call it to State Management
//it Doesn't belong to the component state

//Redux Architectur

//                      Get Data From Action
//                      and Send to Store
//              Action ---->  Reducer ---->  Store   
//    Collect      |                           |    State of
//     Data        |                           |     Complete Application 
//     From        |________ < View <__________|
//     Component           React Componet
//     or API                     

//Redux with In



//file Folder Structure

//1. components 
                // header, user , Home, footer, sidebar, nevbar, search
//2. containers
        // components and service conect to each other containers works
//3. service
            // action
            //reducers
            //constants 
                    //which data action and reducers in between flow
import React from 'react'
import User from './User'

export default function Redux() {
    return (
        <div>
            <h1>App Componet</h1>
            <User data={{name:"Sanket Pujari", age:23}}/>
        </div>
    )
}
