import styles from './styles.module.css';

const ItemList = ({item}) => {

    const {marca, modelo, descricao, cor, img} = item;
    return (
         <li className={styles.item_list} style={{ backgroundColor: cor}}>
        <h2>{modelo}</h2>
        <h3>{marca}</h3>
        <p>{descricao}</p>
        <img src={img}></img>
    </li>
    );
};

export default ItemList;