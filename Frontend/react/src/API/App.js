import axios from 'axios';
import React from 'react'
import { useEffect } from 'react';
import { useState } from 'react'

export default function App() {
    const [data, setData] = useState([]);
    const [name, setName] = useState("")
    const [email, setemail] = useState("")
    const [mobile, setMobile] = useState("")
    const [userId, setUserId] = useState(null)
    let url="http://localhost:4000/todo";
    useEffect(() => {
        getUser();
    });
    function getUser() {
        axios
            .get(url)
            .then((response) => {
                setData(response.data);
                setName(response[0].name)
                setemail(response[0].email)
                setMobile(response[0].mobile)
                setUserId(response[0].id)
                console.log("API WAS CALLED");
            });
    }
    function deleteUser(id) {
        fetch(`url${id}`, {
            method: 'DELETE'
        }).then((result) => {
            result.json().then((res) => {
                console.log(res);
                getUser();
            })
        })
    }
    function selectUser(id) {
        let item=[id-1];
        setName(item.name)
        setemail(item.email)
        setMobile(item.mobile)
        setUserId(item.id)
    }
    function upDateUser(){
        let item={name,email, mobile, userId}
        fetch(`url${userId}`, {
            method: 'PUT',
            headers:{
                'Accept':'application/json',
                'Contenet-Type':'application/json'
            },
            body:JSON.stringify(item)
        }).then((result) => {
            result.json().then((res) => {
                console.log(res);
                getUser();
            })
        })
    }
    return (
        <div>
            <table border="1">
                <tbody>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Enail</td>
                        <td>Mobile</td>
                        <td>Opration</td>
                    </tr>
                </tbody>

                {
                    data.map((item) =>
                        <tr>
                            <td>{item.id}</td>
                            <td>{item.name}</td>
                            <td>{item.email}</td>
                            <td>{item.mobile}</td>
                            <td><button onClick={() => deleteUser(item.id)}>Delete</button></td>
                            <td><button onClick={() => selectUser(item.id)}>Update</button></td>
                        </tr>
                    )
                }
            </table>
            <div>
                <input type="text" value={name} onChange={(e)=>setName(e.target.value)}/><br /><br />
                <input type="text" value={email} onChange={(e)=>setemail(e.target.value)}/><br /><br />
                <input type="text" value={mobile} onChange={(e)=>setMobile(e.target.value)}/><br /><br />
                <button onClick={upDateUser}>Update</button>
            </div>
        </div>
    )
}
