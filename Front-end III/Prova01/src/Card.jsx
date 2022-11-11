function Card (props) {
    return (
    <div className="card" style={{backgroundColor:props.listaCor.cor}} >
        <p>{props.listaCor.nomeCor}</p>
        <h3>{props.listaCor.cor}</h3>
    
    </div>
    )
}

export default Card;