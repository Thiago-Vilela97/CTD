
function executar() {

let botaoEnviar = document.getElementById('botaoEnviar');

botaoEnviar.addEventListener("click", (evento) => {
    evento.preventDefault();

    var titulo = document.getElementById("pais");
console.log(titulo);

var tituloHtml = document.createElement("h1");

var teste = document.createTextNode(titulo.value);

console.log(teste);
})



}
