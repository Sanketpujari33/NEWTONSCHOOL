import React from 'react'
import { Link, useNavigate} from 'react-router-dom'

export default function Home() {


  const navigate=useNavigate();
  const navToPage=(url)=>{
    navigate(url)
    // let x=false;
    // if(x){
    //   navigate('/about')
    // }else{      
    // navigate('/filter')
    // }
  }
  return (
    <div>
      <h1>HOME PAGE</h1>
      <p>This is a Home page of our awesome App</p>
      <p>And Here we are learning about Router</p>
      <Link to="/about">Go to About Page</Link><br/><br/>
      {/* <button onClick={()=>navigate('/about')}>Go to About Page</button><br/><br/>
      <button onClick={()=>navigate('/filter')}>Go to Filter Page</button> */}
      <button onClick={()=>navToPage('/about')}>Go to About Page</button><br/><br/>
      <button onClick={()=>navToPage('/filter')}>Go to Filter Page</button>
    </div>
  )
}
