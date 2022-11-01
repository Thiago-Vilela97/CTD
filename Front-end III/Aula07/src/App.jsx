import { useState } from "react";

const App = () => {

const [items, setItems] = useState([]);

function addItem() {
  setItems([...items, items.length + 1]);
}

  return (
    <>
    <ul>
      {items.map((item)=> (
        <li>{`O item ${item} foi adicionado`}</li>
      ))}
    </ul>
    <button onClick={addItem}>Adicionar Item</button>
    </>
   );


 };

export default App;