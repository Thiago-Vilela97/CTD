//Calculadora Nível 1
function adicionar(a, b) {
    return (a + b);
}
function subtracao(a, b) {
    return  (a - b);
}
function multiplicacao(a, b) {
    return (a * b);
}
function divisao (a, b) {
    return (a/b);
}

//Calculadora Nível 2
console.log("-------------- Teste de Operações / Calculadora --------------");
console.log(adicionar(3, 3));
console.log(subtracao(6, 2));
console.log(divisao(2, 2));

//Calculadora Nível 3
function quadradoDoNumero(x) {
    console.log(multiplicacao(x, x));
}
quadradoDoNumero(5);

let soma1;
let soma2;
let media;
function mediaDeTresNumeros(x, y, z) {
    soma1 = adicionar(x, y);
    soma2 = adicionar(soma1, z);
    media = divisao(soma2, 3);
    console.log(media);
}
mediaDeTresNumeros(10, 5, 3);

function calculaPorcentagem(a, b) {
    let result = multiplicacao(a, b);
    let result2 = divisao(result, 100);
    return result2;
}
console.log(calculaPorcentagem(300, 15));

function geradorDePorcentagem(a, b) {
 //   let mult = multiplicacao(a, 100);
 //   let result = divisao(mult, b);
 return divisao(multiplicacao(a, 100), b);
 //    return result;
}
console.log(geradorDePorcentagem(10,100));

function anterior(numero) {
    return (numero - 1);
}
  
  function triplo(numero) {
    return (numero * 3);
  }
  function anteriorDoTriplo(numero) {
   return anterior(triplo(numero));
  }

  console.log(anteriorDoTriplo(2));