import { useState } from "react";
import Card from "./Card"
import "./styles.css";


function App() {

  const [formDados, setFormDados]= useState({nomeCor: "", cor: ""})
  const [listaCor, setListaCor] = useState([])
  const [error, setError] = useState(false)


  function handleSubmit(event) {
    event.preventDefault();

    if (formDados.nomeCor == "" || formDados.cor == "" || formDados.nomeCor.length < 3) {
      setError(true)
      return;
    } 

    setListaCor([...listaCor, {
      nomeCor:formDados.nomeCor,
      cor: formDados.cor
    }]);
    setError(false)
    setFormDados({nomeCor: "", cor: ""})
  }


  return (
    <>
    <div className="menu">    
    <form onSubmit={handleSubmit}>
    <div>
    <h1>Adicionar nova cor</h1> | 

    <label> Nome 
        <input value={formDados.nomeCor} onChange={(e) => setFormDados({...formDados, nomeCor: e.target.value})}/>
    </label>

    <label> Cor 
        <input placeholder="Insira sua cor no formato hexadecimal" value={formDados.cor} onChange={(e) =>setFormDados({...formDados, cor: e.target.value})}/>
    </label>
    </div>
    <div className="button-confirma">
    <input className="confirma" type="submit"/> 
    </div>
    </form>
    </div>
    {error ? <p>Por favor, verifique os dados inseridos no formulário</p> : null} 
    <h2>Cores Favoritas:</h2>
    <div className="cards">
    {
      listaCor.map((cor) =>{
        return (
          <Card listaCor={cor}/>
        )
      })
    } 
    </div>
    </>
  )
}

export default App;