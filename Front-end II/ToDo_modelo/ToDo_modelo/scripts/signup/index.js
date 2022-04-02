//Capturando as informações
let campoNome = document.getElementById("inputName");
let campoApelido = document.getElementById("inputApelido");
let campoEmail = document.getElementById("inputEmail");
let campoSenha = document.getElementById("inputSenha");
let campoRepetirSenha = document.getElementById("inputRepetirSenha");

let botaoCriarConta = document.getElementById("botaoCriarConta");

//Criação das tags para validação de cada campo
let nomeValido = false;
let apelidoValido = false;



// Validação Campo Nome
campoNome.addEventListener('blur', function(){

    let campoNomeValidacao = document.getElementById('campoNomeValidacao');

    if (campoNome.value != "") {
        campoNomeValidacao.innerText = "";
        campoNome.style.border = "";
        nomeValido = true;
    } else {
        campoNomeValidacao.innerText = "Entre com um nome";
        campoNomeValidacao.style.fontSize = "8pt";
        campoNomeValidacao.style.color = "red";
        campoNomeValidacao.style.fontWeight = "bold";
        campoNome.style.border = "solid 1px red";
        nomeValido = false;
    }
});

//Validação campo Apelido
campoApelido.addEventListener('blur', function(){

    let campoApelidoValidacao = document.getElementById('campoApelidoValidacao');

    if (campoApelido.value != "") {
        campoApelidoValidacao.innerText = "";
        campoApelido.style.border = "";
        apelidoValido = true;

    } else {
        campoApelidoValidacao.innerText = "Entre com o apelido";
        campoApelidoValidacao.style.color = "red";
        campoApelidoValidacao.style.fontSize = "8pt"
        campoApelidoValidacao.style.fontWeight = "bold";
        campoApelido.style.border = "solid 1px red"
        apelidoValido = false;
    }
    camposValidados(apelidoValido);
})

//Função para alterar visualização do botão caso esteje ou não validado
function camposValidados(campo) {
    if (campo == true) {
        botaoCriarConta.removeAttribute('disabled');
    } else {
        botaoCriarConta.setAttribute('disabled', true);
        evento.preventDefault();
    }
}

