import { useState, useEffect } from 'react'

const pizzasBack = [
  {
    id: 1 ,
    nome: "Portuguesa",
    preco: 49.9,
  },
  {
    id: 2 ,
    nome: "Frango",
    preco: 43.9,
  }
]

function App() {

  const [pizzas, setPizzas] = useState([]);
  const [update, setUpdate] = useState(true);

  useEffect(()=> {
    setTimeout(()=> {
      setPizzas(pizzasBack);
      setUpdate(false)
    },2000)   
  },[update]);

  function updateList () {
    setUpdate(true)
  }


  return (
    <>
    {update ? <p>Carregando.....</p> : (
    <ul>
      {
        pizzas.map((pizza)=> <li>
          <p>{pizza.nome}</p>
          <p>{pizza.preco}</p>
          <br />
          </li>         
          )
      }
    </ul>)
    }   
    <button onClick = {updateList}>Atualizar lista</button>
    </>
  )
}

export default App
