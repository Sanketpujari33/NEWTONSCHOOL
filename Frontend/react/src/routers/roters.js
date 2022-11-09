import React from 'react'
import { BrowserRouter, Route, Routes, Navigate} from 'react-router-dom'
import About from './Components/About'
import Contact from './Components/Contact'
import Home from './Components/Home'
import Navbar from './Navbar'
// import Page404 from './Components/page404'
import User from './Components/user'
import Filter from './Components/Filter'
import Company from './Components/Company'
import Channel from './Components/channel'
import Other from './Components/Other'
import Login from './Components/Login'
import ArthRouters from './Components/ArthRouters'
import App from '../API/App'
import From from '../API/From'
import ContextColor from '../Hooks/ContextAPI/App'
export default function roters() {
    return (
        <div>
            <BrowserRouter>
            <Navbar/>
                <Routes>
                    <Route path='/' element={<ArthRouters Component={Home} />} />
                    <Route path='/login' element={<Login />} />
                    <Route path='/about' element={<About />} />
                    <Route path='/user/:name' element={<User />}/>
                    <Route path='/filter' element={<Filter />} />
                    {/* <Route path='/*' element={<Page404/>}/> */}
                    <Route path='/contact/' element={<Contact />}>
                    <Route path='company' element={<Company />}/>
                    <Route path='channel' element={<Channel />}/>
                    <Route path='other' element={<Other />}/>
                    </Route>
                    <Route path='/App' element={<App/>}/>
                    <Route path='/from' element={<From/>}/>
                    <Route path='/ContextColor' element={<ContextColor/>}/>
                    <Route path='/*' element={<Navigate to='/'/>}/>
                </Routes>
            </BrowserRouter>
        </div>
    )
}
