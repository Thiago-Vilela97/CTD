//Crie uma função que receba um array composto por números e retorna uma nova matriz (array) com todos os
// valores divididos pela soma de toda a matriz, usando map() e reduce().

/*
let numeros = [2, 3, 4, 5, 6, 7, 8];

function divSum(array) {

    let somatorio = array.reduce(function (armazena, valor) {
        return armazena + valor
    })

    let divisao = array.map(function (valor) {
        return somatorio / valor
    })
    return divisao;
}
console.log(divSum(numeros));
*/


//Crie uma função que receba um array de palavras e um número, e que retorna uma matriz (array) com apenas as
// palavras que têm mais do que uma quantidade de letras maior do que o número informado. (verifique como funciona
// o método filter ())
/*
let array1 = ["fulaono", "clano", "abobora", 1];

function novaArray(array) {
    let n1 = array.pop();
    let filtro = array.filter(function (array) {
        return array.length > n1;
    })
    return filtro
}
console.log(novaArray(array1))
*/

//Crie um array de objetos literais, onde cada objeto será um aluno e terá dois atributos: nome e nota. Crie duas funções que
// ordenam o array: uma ordenará os alunos em ordem alfabética e a outra o fará por nota, da mais alta para a mais baixa.

/*
let alunos = [
    { nome: "Thiago", nota: 10 },
    { nome: "Fulano", nota: 8 },
    { nome: "Ciclano", nota: 1 },
    { nome: "Joao", nota: 7 },
    { nome: "Maria", nota: 9 },
]

function ordenaNome(array) {
    array.sort(function (a, b) {
        if (a.nome > b.nome) {
            return 1;
        }
        if (a.nome < b.nome) {
            return -1;
        }
        else {
            return 0;
        }
    })
    return array
}

function ordenaNotas(array) {
    array.sort(function (a, b) {
        if (a.nota < b.nota) {
            return 1;
        }
        if (a.nota > b.nota) {
            return -1;
        }
        else {
            return 0;
        }
    })
    return array
}

console.log(ordenaNotas(alunos))
console.log(ordenaNome(alunos))
*/


