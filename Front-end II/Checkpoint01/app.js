let botaoEnviar = document.getElementById('botaoEnviar');

botaoEnviar.addEventListener("click", (evento) => {
    evento.preventDefault();

    let formUrl = document.getElementById('Url').value;
    let formPais = document.getElementById('pais').value;
    let formDescricao = document.getElementById('Descricao').value;

    let newContent = `
    <div class="card">
    <img src="${formUrl}" alt="">
    <h2>${formPais}</h2>
    <p>${formDescricao}</p>
    </div>`

    console.log(newContent);

    const newCard = document.querySelector("main");

    console.log(newCard);
    newCard.innerHTML = newCard.innerHTML + newContent;
    
  
    
})