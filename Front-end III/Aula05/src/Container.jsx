function Container(props) {
    return (
        <div style={{backgroundColor: 'black', color:'white'}}>
            {props.children}
        </div>
    )
}

export default Container;