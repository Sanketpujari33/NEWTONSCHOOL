let btn = document.getElementById('sign');
btn.addEventListener('click', async (e) => {
e.preventDefault();
let email = document.getElementById('email').value;
let name = document.getElementById('name').value;
let pass = document.getElementById('pass').value;
console.log(email,name,pass);
let resp=await axios.post('/auth/signup',{email,name,pass})
console.log('response',resp);

})