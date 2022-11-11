import { useState } from "react";

const App = () => {

  const [valueInputName, setValueInputName]= useState("");
  
  const [valueInputIdade, setValueInputIdade]= useState("");
  
  const [valueInputTime, setValueInputTime]= useState("");
  
  const [pessoa, setPessoa]= useState([]);

  const [errorInput, setErrorInput] = useState("");

  function handleSubmit(e) {
    if(valueInputName.trim() || valueInputIdade.trim() || valueInputTime.trim()){
        setPessoa([...pessoa, valueInputName, valueInputIdade, valueInputTime])
        setValueInputName("");
        setValueInputIdade("");
        setValueInputTime("");
        setErrorInput("");
    } else {
      setErrorInput("Preencha todos os campos");
    }
    e.preventDefault();
  }

  return (
    <div>
      <form onSubmit={handleSubmit}>

      <label> Nome Completo:  
      <input value={valueInputName}
      onChange={(e)=> setValueInputName(e.target.value)}
      />
      </label>

      <label> Idade:  
      <input value={valueInputIdade}
      onChange={(e)=> setValueInputIdade(e.target.value)}
      />
      </label>

      <label> Time:  
      <input value={valueInputTime}
      onChange={(e)=> setValueInputTime(e.target.value)}
      />
      </label>

      <p>{errorInput}</p>

      <input type="submit"/>
      </form>

      {pessoa.map((item) => <li>{item}</li>)}
    </div>
  )
}

export default App;
