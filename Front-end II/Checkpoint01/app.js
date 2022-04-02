let botaoEnviar = document.getElementById('botaoEnviar');

botaoEnviar.addEventListener("click", (evento) => {
    evento.preventDefault();

    let formUrl = document.getElementById('Url').value;
    let formPais = document.getElementById('pais').value;
    let formDescricao = document.getElementById('Descricao').value;


    let newContent = `
    <div class="card" style="width: 18rem;">
        <img src="${formUrl}" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">${formPais}</h5>
          <p class="card-text">${formDescricao}</p>
         </div>
      </div>`

    

    console.log(newContent);

    const newCard = document.querySelector("main");

    console.log(newCard);
    newCard.innerHTML = newCard.innerHTML + newContent;
    
  
    
})