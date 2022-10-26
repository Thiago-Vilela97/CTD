import Button from './Button';
import Title from './Title';


function App() {

  function btn1Func(){
    alert('BTN 1');
  }

  function btn2Func(){
    alert('BTN 2');
  }

  return (
    <>
      <Title text="Texto 1" numero="2"/>
      <Title numero="20"/>
      <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Non, unde!</p>
      <Button name="Pressione" color="red" click={btn1Func}/>
      <Button name="Clique aqui" color="green" click={btn2Func}/>
   </> 
   )
}

export default App;