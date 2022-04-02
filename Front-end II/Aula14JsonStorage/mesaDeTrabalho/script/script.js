/*REQUISITOS
- Crie um formulário para capturar um texto inserido.
- Implemente o evento "submit", use-o para salvar o comentário em um array.
- Cada vez que um novo comentário é adicionado, renderize-o em uma tag "p" (remova o código permanente do HTML e torne-o dinâmico).
- Salve constantemente as informações no localStorage, caso a página seja recarregada os comentários devem ser mantidos.
*/

let botaoSubmit = document.getElementById("botaoSubmit");

if (localStorage.length < 1) {
    var index = 1;
}

// console.log(index);


botaoSubmit.addEventListener ("click", function (evento) {

    evento.preventDefault();
    
    var campoTexto = capturaInput("idtexto");

    var comentarios= [];

    comentarios = comentarios.push(campoTexto);

    

    localStorage.setItem(index, campoTexto);

    index = localStorage.length + 1;

    

    console.log(localStorage.length);

    

});

// localStorage.clear();
function capturaInput(idInput) {
    return document.getElementById(idInput).value;
}

