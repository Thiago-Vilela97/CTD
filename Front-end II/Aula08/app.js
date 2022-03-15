
// onload = function() {
//     alert("A tela foi carregada")
// }


let botaoEnviar = document.getElementById('botaoEnviar');

botaoEnviar.addEventListener("click", (evento) => {
    evento.preventDefault();
})

let texto = document.querySelectorAll("label");
console.log(texto[1]);

texto[1].onmouseover = function() {
    texto[1].style.color = "blue";
}

texto[1].onmouseout = function() {
    texto[1].style.color = "red";
}


let name = document.getElementById('name');

name.addEventListener ('keyup', function() {
    console.log("teste");
});