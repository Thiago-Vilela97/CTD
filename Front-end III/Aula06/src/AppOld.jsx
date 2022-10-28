const carros = [
  {
    id: 1,
    modelo: "Argo",
  },
  {
    id: 2,
    modelo: "Fusion",
  },
  {
    id: 3,
    modelo: "Sonata",
  },
  {
    id: 4,
    modelo: "Pulse",
  }
];

const App = () => {
  return (
    <ul>
      {
        carros.map(({id, modelo})=><li key={`list-car-${id}`}>{modelo}</li>)
      }
    </ul>
  ) 
  
};

export default App;