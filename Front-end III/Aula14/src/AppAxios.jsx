import { useState, useEffect } from "react";
import axios from "axios";

function AppAxios() {

  const [posts, setPosts] = useState([])
  
  async function getDataByServer() {

    try {
      const response = await axios.get("https://jsonplaceholder.typicode.com/posts")
      setPosts(response.data)
    } catch (error) {
      alert("Houve um erro na solicitação")
    }
  }

  async function newPost() {
    try {
        
        const post = {
            title: "Novo post Thiaguim",
            body: "Conteúdo do post",
            userId: 1,
        };

       const response = await axios.post("https://jsonplaceholder.typicode.com/posts", post)

       alert("POST SALVO COM SUCESSO")
    } catch (error) {
        alert("Não foi possivel adicionar o post")
    }
  }

  useEffect(() => {
    getDataByServer();
  },[])

   return (
    <div>
      {posts.length > 0 ? JSON.stringify(posts) : "Caregando...."}
      <button onClick={newPost}>Salvar Post</button>
    </div>
  )
}

export default AppAxios;
