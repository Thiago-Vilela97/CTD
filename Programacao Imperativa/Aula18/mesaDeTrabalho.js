//1 Loop de pares

/*
const loopPares = n1 => {
    let result = 0;
    for (let i = 0; i <= 100; i++) {
        (result = i + n1);
        if (result % 2 == 0) {
            console.log("O numero " + result + " é par");
        }
        else { console.log(result) }
    }
}
loopPares(6);
*/

//2- Loop de ímpares
/*
const loopImpares = (numero, palavra) => {
    let result = 0;
    for (let i = 0; i <= 100; i++) {
        result = i + numero;
        if (result % 2 !== 0) {
            console.log(result + " É " + palavra);
        }
        else {
            console.log(result);
        }
    }
}
loopImpares(3, "ÍMPAR");
*/

//3-Você deve criar uma função chamada soma que receba um número como parâmetro e retorne a soma de todos os seus números
// anteriores, incluindo o número recebido por parâmetro.
/*
const soma = numero => {
    let result = 0;
    for (let i = numero; i >= 0; i--) {
        result += i;
    }
    return result;
}
console.log(soma(4));
*/

//4- Você deve criar uma função chamada newArray que receba um número como parâmetro e retorne um novo array com a quantidade de elementos
//equivalente ao valor do número que você passou por parâmetro.
/*
const newArray = valor => {
    let array = [];
    for (let i = 1; i <= valor; i++) {
        array.push(i);
    }
    return array;
}
console.log(newArray(8));
*/

//5- Você deve criar uma função chamada split que receba uma string e simule o comportamento da função split original.
// Se você não sabe como funciona, o Google pode ajudá-lo.
/*
const simulaSplit = variavel => {
    let array = [];
    for (let i = 0; i < variavel.length; i++) {
        array.push(variavel[i]);
    }
    return array;
}

console.log(simulaSplit("alfabeto"));
*/

//6- Você deve criar uma função chamada moverZeros que receba um array como parâmetro e retorne outro com os números 0 ordenados ao final.
/*
const teste = [1, 2, 3, 0, 4, 5, 6, 0, 8, 9, 0, 3, 4, 5, 0];

let moverZeros = array => {
    let guardaZero = [];
    let guardaDifZero = [];
    let novoArray = [];
    guardaZero = array.filter(function (valor) {
        return valor === 0;
    })
    guardaDifZero = array.filter(function (valor) {
        return valor !== 0;
    })
    for (let i = 0; i < guardaDifZero.length; i++) {
        novoArray.push(guardaDifZero[i]);
    }
    for (let i = 0; i < guardaZero.length; i++) {
        novoArray.push(guardaZero[i]);
    }
    return novoArray;
}
console.log(moverZeros(teste))
*/