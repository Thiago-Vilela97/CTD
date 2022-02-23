//1
// let filmes = ["Filme 1", "filme 2", "filme 3", "filme 4"];
//     for (let i = 0; i <= filmes.length; i++) {
//         console.log((filmes[i]).toUpperCase()) ;
//         }

//2

// function passagemDeElemento(array1, array2) {
//     for (let i = -3; i <= array2.length; i++) {
//         let guardaValor = array2.pop();
//         array1.push(guardaValor.toUpperCase());
//             }
//     return array1;
// }     
// let filmes1 = ["Filme 1", "filme 2", "filme 3", "filme 4"];
// let filmes2 = ["Filme w", "filme x", "filme y", "filme z"];

// passagemDeElemento(filmes1, filmes2);
// console.log(filmes1);


//3 - 
// function passagemDeElemento(array1 , array2 ) {
//     let invalido = array2.pop();
//     let qtd = array2.length;
//     for (let i = 0; i < qtd; i++) {
//         array1.push(array2.pop().toUpperCase());
//             }
//     console.log("Esse filme é inválido: "+invalido);
//     return array1;
// }     
// let filmes1 = ["Filme 1", "filme 2", "filme 3", "filme 4"];
// let filmes2 = ["Filme w", "filme x", "filme y", "filme z"];
// console.log(filmes1.length);
// console.log(passagemDeElemento(filmes1, filmes2));


//4
// const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
// const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

// function compararQualificacoes(cont1, cont2) {
//     let comparacoes = [];
//     for (let conta = 0; conta < cont1.length; conta++) {
//         comparacoes[conta] = cont1[conta] === cont2[conta];
//     }
//     return comparacoes;
// }
// console.log(compararQualificacoes(asiaScores, euroScores));

//Exercicio Bonus


let participanteA = [5, 8, 4, 9, 5];
let participanteB = [8, 7, 8, 6, 8];
let participanteC = [7, 5, 10, 8, 3];

function pontuacaoMedia(participante) {
    let qtd = participante.length;
    let soma = 0;
    let media = 0;
    for (let i = 0; i < qtd; i++) {
        soma += participante[i];
    }
    return ("A pontuação média desse participante é: " + (media = soma / qtd));
}

function pontuacaoMaior(participante) {
    return  ("A pontuação mais alta desse participante é: " +(Math.max.apply(null, participante)));
}

function competicao (part1, part2, part3) {
    if ()
}

console.log(pontuacaoMaior(participanteA));

