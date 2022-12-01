import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import api from "../../services/api";

import "./styles.css";

const Home = () => {
  const [products, setProducts] = useState([]);
  const [idProduct, setIdProduct] = useState("");
  const [labelFunction, setLabelFunction] = useState("Cadastrar Produto")
  const [formData, setFormData] = useState({
    name: "",
    description: "",
    price: "",
    manufacturer: "",
    image: "",
  });

  useEffect(() => {
    getProducts();
  }, []);

  async function getProducts() {
    try {
      const response = await api.get("/products");
      setProducts(response.data);
    } catch (error) {
      alert("Erro ao buscar produtos");
    }
  }

  async function newProduct() {
    const { name, price, description, manufacturer, image } = formData;

    try {
      await api.post("/products", {
        name,
        price,
        description,
        manufacturer,
        image,
      });
      emptyState();
      getProducts();
    } catch (error) {
      alert("Não foi possivel cadastrar o produto");
    }
  }

  //Delete
  async function deleteProduct(_id) {
    try {
      await api.delete(`/products/${_id}`);
      getProducts();
      alert("Produto removido com sucesso")
    } catch (error) {
      alert("Não foi possível Deletar o produto")
    }
  }

  //Preencher campo para poder editar
  function fillState(product) {
    setFormData({
      name: product.name,
      description: product.description,
      price: product.price,
      manufacturer: product.manufacturer,
      image: product.image,
    })

    setIdProduct(product._id);
    setLabelFunction("Editar Produto")
  }

  //Editar, de fato, após ter preenchido os campos
  async function editProduct() {
    try {
      await api.put(`/products/${idProduct}`,
      {
        name: formData.name,
        description: formData.description,
        price: formData.price,
        manufacturer: formData.manufacturer,
        image: formData.image,
      });
      setIdProduct("");
      emptyState();
      alert("Produto editado com sucesso");
      getProducts();
      setLabelFunction("Cadastrar Produto")
    } catch (error) {
      alert("Erro ao tentar editar produto")
    }
  }

  function emptyState() {
    setFormData({
      name: "",
      description: "",
      price: "",
      manufacturer: "",
      image: "",
    });
  }

  function submitForm() {
    if(idProduct) {
      editProduct();
    } else {
      newProduct();
    }
  }

  return (
    <div className="container">
      <form>
        <h2>{labelFunction}</h2>
        <input
          placeholder="Nome"
          value={formData.name}
          onChange={(event) =>
            setFormData({ ...formData, name: event.target.value })
          }
        />
        <input
          placeholder="Preço"
          value={formData.price}
          onChange={(event) =>
            setFormData({ ...formData, price: event.target.value })
          }
        />
        <input
          placeholder="Fabricante"
          value={formData.manufacturer}
          onChange={(event) =>
            setFormData({ ...formData, manufacturer: event.target.value })
          }
        />
        <input
          placeholder="Image"
          value={formData.image}
          onChange={(event) =>
            setFormData({ ...formData, image: event.target.value })
          }
        />
        <textarea
          placeholder="Descrição"
          value={formData.description}
          onChange={(event) =>
            setFormData({ ...formData, description: event.target.value })
          }
        />
        <button type="button" onClick={submitForm}>
          Salvar
        </button>
      </form>

      <div className="products">
        <h1>Produtos</h1>

        <div className="content">          
          {products.map((product) => (
            <div className="content-div"> 
              <button onClick={() => deleteProduct(product._id)}>
              Excluir
              </button>
            <Link
              key={product._id}
              to={`/details/${product._id}`}
              className="container-item"
            >            
              <img src={product.image} />
              <p>{product.price}</p>
              <p>{product.name}</p>
              </Link>
              <button onClick={() => fillState(product)}>
              Editar
              </button>           
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};

export default Home;
