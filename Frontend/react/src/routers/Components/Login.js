import React, { useEffect } from 'react'
import { useNavigate } from 'react-router-dom';

function Login() {
    const login = () => {
        localStorage.setItem('login', true);
        navigate('/')
    }
    useEffect(() => {
        let login = localStorage.getItem('login');
        if (!login) {
            navigate('/login')
        }
    });
    const navigate = useNavigate();
    return (
        <div>
            <h1>Login Page</h1>
            <label>User</label><br />
            <input type="text" /><br />
            <label>Password</label><br />
            <input type="text" /><br /><br />
            <button onClick={login}>Login</button>
        </div>
    )
}
export default Login;