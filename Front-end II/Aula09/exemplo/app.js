
let nomeUsuario = "thiago";

//funções declaradas
function exibeNome(nome) {
    return console.log(nome);
}

exibeNome(nomeUsuario);

//auto invoke
(function () {
console.log("função automatica");
})();

//funções expressas
let valores = function somaValores(valorA, valorB) {
    return valorA + valorB;
}

console.log(valores(2,3)); 

//funções CallBack

function executaCalculo(CallBack) {

    let valor1 = 4;
    let valor2 = 6;

    let soma = valor1+valor2;
    CallBack(soma);
}

function exibeResultado(resultado) {
    console.log(`O resultado foi ${resultado}`);
}

executaCalculo(exibeResultado);

//arrow function

let soma = (valorA, valorB) => valorA + valorB;

console.log(soma(2,2));