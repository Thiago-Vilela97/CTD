// Aqui realizamos a consulta da promisse, esperando sua resposta assíncrona

let botao = document.querySelector('.btnContainer');

botao.addEventListener("click", evento => {
    evento.preventDefault();

    fetch('https://randomuser.me/api/')
    .then(response => {
        
        return response.json()
    })
    .then(data => {
        //manipulamos a resposta
        // console.log(data.results[0])
        return data.results[0]

    })
    .then(dados => {
        renderizarDadosUsuario(dados);
    })

function renderizarDadosUsuario(dados) {
    /* -------------------------------- Tarefa 1 -------------------------------- */
    // Aqui devem desenvolver uma função que seja exibida na tela:
    // a foto, o nome completo do usuário e o e-mail.
    // Isto deve ser baseado nas informações que obtemos da API e inseridas no HTML.
    let card = document.querySelector('.card');
    card.innerHTML =
    `
    <img class="imagem" src="${dados.picture.large}"> </img>
    <p>${dados.name.title} ${dados.name.first} ${dados.name.last} </p>
    <p> ${dados.email} </p>
    `
}
})





/* --------------------------- Tarefa 2 (extra) --------------------------- */
// Aqui você pode ir para o ponto extra de usar o botão que está comentado no HTML.
// Você pode descomentar o código no index.html e usar esse botão para executar uma nova solicitação API, sem recarregar a página.
// Cabe aos desenvolvedores decidirem qual bloco de código deve ser contido dentro de uma função para que ele possa ser executado toda vez que um clique de botão for realizado.