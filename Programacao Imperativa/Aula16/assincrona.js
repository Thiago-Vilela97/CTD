/*
//ARROW FUNCTION

// atividade assicrona
let print = mensagem => console.log(mensagem);
print("ola"); 

const soma = (n1,n2) => n1 + n2;
console.log(soma(10,5));

//CALLBACKS
const somar = (numeroA, numeroB) => numeroA + numeroB;

const calculadora = (numeroA, numeroB, operacao) => operacao(numeroA, numeroB);

console.log(calculadora(10, 20, somar));
console.log(calculadora(10, 20, (numeroA, numeroB) => numeroA-numeroB)); 
*/




const andar = () => "O carro está andando";
const parar = () => "O carro parou";

const acaoCarro = (callback) => callback();

console.log(acaoCarro(parar));
