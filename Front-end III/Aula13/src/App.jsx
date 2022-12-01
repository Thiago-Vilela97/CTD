import { useState, useLayoutEffect, useEffect } from "react";
import Box from "./Box";


function App() {

  const [count, setCount] = useState(0);
  const [visibleBox, setVisibleBox] = useState(true);

  // useLayoutEffect(()=>{
  //   console.log("Executei a Inicialização");
  // }, []);

  //setCount(count + 1)

  useEffect(()=>{
    console.log("Executei após a montagem do seu componente")
  }, [])

  useEffect(()=>{
    console.log("Executei o teste do Array do UseEffect")
  }, [visibleBox])

  return (
    <div>
      {visibleBox ? <Box /> : null}
      <button onClick={()=>setVisibleBox(!visibleBox)}>Handle Box</button>
      <h1>{count}</h1>  
      <button onClick={()=>setCount(count + 1)}>Soma + 1</button>    
    </div>
  )
}

export default App
