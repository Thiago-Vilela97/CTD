import {Link, useNavigate} from "react-router-dom"

const Home = () => {

    const navigate = useNavigate();

    function handleNavigate() {
        navigate("/contact")
    }


    return (       
        <div>
        <h1>Home Page</h1>
        <Link to="/contact"> Ir para contact</Link>  
        <br/><br/>
        <button onClick={handleNavigate}> Ir para página de contato</button>  
        </div>
    );
}

export default Home;