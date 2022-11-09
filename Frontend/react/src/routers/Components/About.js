import React from 'react'
import { Link } from 'react-router-dom'

export default function About() {
  return (
    <div>
      <h1>ABOUT PAGE</h1>
      <p>This is a About page of our awesome App</p>
      <p>And Here we are learning about Router</p>
      <Link to="/contact">Go to Contact Page</Link>
      <li> <Link to="/user/Sanket" state={{name:"sanket pujari"}}>Sanket</Link></li>
     <li> <Link to="/user/Shekhar">Shekhar</Link></li><br/>
    </div>
  )
}
