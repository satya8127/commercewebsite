

import React ,{ useEffect }from 'react'


function App() {

  const rebody = {
  username:'satya8127',
  password:'9989108789',
};
 
useEffect( () =>{
  fetch("/authenticate/login",{
    // mode: 'no-cors',
    headerAuth: {
      "Content-Type": "application/json ; charset=utf-8"
      
    }, method: "post",
    body: JSON.stringify(rebody.username,rebody.password),
      body2: JSON.stringify(rebody.password),
    
  }).then(console.log(JSON.stringify(rebody.username))).then(console.log(JSON.stringify(rebody.password)))
  .then(response =>response.json()).then( json => console.log(json))
  
  // Promise.all([response.json,response.headerAuth]))
  // .then(([body,headerAuth]) =>{

})
  


// const submitHandler = e =>{
//   e.preventDefault();
//   console.log(data);
// }
  return (
    <div><center>
      {/* <form onSubmit={submitHandler}>
      <input type="text" name='username'  value={username} onChange={onChange} placeholder='username'/> <br></br>
      <input type="password" name='password'  value={password} onChange={onChange} placeholder='password' /><br></br>
      <input type="submit" name='submit'/>

</form> */}
</center>
    </div>
  )
}

export default App
