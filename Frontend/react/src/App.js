// import "./App.css";
// import EffectTutorial from "./Hooks/UseEffect/EffectTutorial";
// import ReducerTutorial from "./Hooks/UseReducer/ReducerTutorial";
// import StateTutorial from "./Hooks/UseState/StateTutorial";
// import ContextTutorial from "./Hooks/UseContext/ContextTutorial";
// import ImperativeHandle from "./Hooks/UseImperativeHandle/ImperativeHandle";
// import RefTutorial from "./Hooks/UseRef/RefTutorial";
// import MemoTutorial from "./Hooks/UseMemo/MemoTutorial";
// import CallBackTutorial from "./Hooks/UseCallback/CallbackTutorial";
// import UseRenducer from "./Hooks/UseState/UseRenducer";
// import ClassStateTutorial from "./Hooks/UseState/ClassStateTutorial";
// import Counter from "./Hooks/UseState/Counter";
// import LifeCycleMethod from "./Components/LifeCycleMethod";
// import UseEffect from "./Hooks/UseEffect/EffectTutorial";
// import Roters from './routers/roters'
// function App() {

//   return (
//     <div className="App">
//     <Roters/>
//         {/* <StateTutorial /> */}
//         {/* <EffectTutorial/> */}
//         {/* <ReducerTutorial/> */}
//         {/* <ContextTutorial/> */}
//         {/* <ImperativeHandle/> */}
//         {/* <RefTutorial/> */}
//         {/* <MemoTutorial/> */}
//         {/* <CallBackTutorial/> */}
//         {/* <Counter /> */}
//         {/* <UseRenducer/> */}
//          {/* <LifeCycleMethod/> */}
//             {/* <UseEffect/> */}
//     </div>
//   );
// }

// export default App;


import React from 'react';
import './App.css';
import HomeContainer from './fileFolderStructure/containers/HomeContainer'
import HeaderContainer from './fileFolderStructure/containers/HeaderContainer'
function App() {
  return (
    <div className="App">
      <HeaderContainer />
      <HomeContainer />
    </div>
  );
}

export default App;