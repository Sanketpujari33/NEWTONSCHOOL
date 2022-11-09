import React from 'react'
import { Link , Outlet} from 'react-router-dom'

export default function Contact() {
  return (
    <div>
      <h1>CONTACT PAGE</h1>
      <p>This is a Contact page of our awesome App</p>
      <p>And Here we are learning about Router</p>
      <Link to="company">Company</Link>
      <Link to="channel">Chnnel</Link>
      <Link to="other">Other</Link><br/><br/>
      <Outlet/>
    </div>
  )
}
