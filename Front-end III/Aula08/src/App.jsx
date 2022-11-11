import { useRef, useState } from "react";

const App = () => {
 
  const[nome, setNome] = useState([])

  const [valueInput, setValueInput] = useState("");

  const [errorInput, setErrorInput] = useState("");

  const [isChecked, setIsChecked] = useState(false);

  function handleSubmit(event) {   

    if(valueInput.trim()){
      setNome([...nome, valueInput])     
      setErrorInput("");
      setValueInput("");
    } else {
      setErrorInput("Digite um nome no campo");
    }
    event.preventDefault();
    // alert(inputRef.current.value);   
  }

  return (
    <div style={isChecked ? {background: "red"} : {}}>
    <h1>{isChecked.toString()}</h1>

    {nome.map((item) =><li>{item}</li> )}

    <form onSubmit={handleSubmit}> 
    
      <input value={valueInput} 
      onChange={(event) => setValueInput(event.target.value)} />

      <label> Pressionado?
      <input 
      value={isChecked}
      type="checkbox" 
      onChange={(event)=> setIsChecked(event.target.checked)}/>
      </label>

      <p>{errorInput}</p>

      {isChecked ? <input type="submit"/> : null} 

    </form>
    </div>
  );
};

export default App;