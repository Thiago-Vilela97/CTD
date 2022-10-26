function Title({text="Texto padrão", numero}) {
     
   
    return (
        <>
    <h1>{text}</h1>
    <h2>{numero >= 18 ? "Maior de idade" : "Menor de idade"}</h2>
    </>
    )
}

export default Title;