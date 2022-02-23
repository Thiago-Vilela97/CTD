/*
let listaNumeros = [1, 2, 3, 4, 5, 6];

//map

let listaNumeroDobro = listaNumeros.map(function (valor, index) {
    return valor * 2
});

//filter

let listaNumerosFiltrados = listaNumeros.filter(function (valor, index) {
    return valor > 3;
});

console.log(listaNumerosFiltrados);

//reduce

let listaNumerosSomados = listaNumeros.reduce(function (acumulador, valor) {
    return acumulador + valor;
})

console.log(listaNumerosSomados);

//forEach

listaNumeros.forEach(function (valor, index) {
    console.log("O valor é: " + valor + " e a sua posição é: " + index);
})
*/

// Crie um array de números pares, e utilizando a função .map() nesse array, crie um novo array com apenas números ímpares.

let numerosPares = [2, 4, 6, 8, 10];

let numerosImpares = numerosPares.map(function (valor) {
    return valor - 1;
})

console.log(numerosImpares);

// Crie um array de nomes, que possua dois índices com o nome Maria. Utilize o .filter() para obter apenas esses dois índices com o nome Maria.

let nomes = ["Maria", "joao", "fulano", "ciclano", "Maria", "Maria"];

let nomesFiltrados = nomes.filter(function (nome) {
    return nome == "Maria";
})

console.log(nomesFiltrados);

// Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.

let numeros = [1, 5, 9, 3, 7];

let numerosFormatados = numeros.reduce(function (acumula, result) {
    return [acumula + " - " + result];
})

console.log(numerosFormatados);

// Crie um array de animais, após isso passe por cada índice utilizando o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.
let animais = ["vaca", "boi", "porco", "leão", "cobra"];

let texto = animais.forEach(function (animal, posicao) {
    console.log("O animal é: " + animal);
})

for (var i = 0; i < 50; i += 10) {
    console.log(i);
}
console.log(i);
