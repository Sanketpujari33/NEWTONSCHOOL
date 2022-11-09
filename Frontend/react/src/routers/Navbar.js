import React from 'react'
import { NavLink} from 'react-router-dom'
import '../App.css'
export default function Navbar() {
    return (
        <div>
            <ul  className="navbar">
                <li ><NavLink className="nav-bar-Link"  to="/">Home</NavLink></li>
                <li><NavLink className="nav-bar-Link" to="/about">About</NavLink></li>
                <li><NavLink className="nav-bar-Link" to="/contact">Contact</NavLink></li>
                <li><NavLink className="nav-bar-Link" to="/filter">Filter</NavLink></li>
                <li><NavLink className="nav-bar-Link" to="/login">Login</NavLink></li>
                <li><NavLink className="nav-bar-Link" to="/App">SEND DATA</NavLink></li>
                <li><NavLink className="nav-bar-Link" to="/from">From</NavLink></li>
                <li><NavLink className="nav-bar-Link" to="/ContextColor">ContextColor</NavLink></li>
 
            </ul>
        </div>
    )
}
