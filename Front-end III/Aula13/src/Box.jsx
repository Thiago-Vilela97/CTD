import { useEffect } from "react"

const Box = () => {

    useEffect(
        ()=> ()=> console.log("O componente acabou de ser desmontado")
    , [])

    return (
        <div>
            <h1>Esse Box está sendo mostrado</h1>
        </div>
    );
};

export default Box;