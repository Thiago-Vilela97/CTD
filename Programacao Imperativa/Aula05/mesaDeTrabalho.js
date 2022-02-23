// Funções simples
//Atividade 1
function conversao(polegadas) {
    return(polegadas * 2.54);

}
console.log(conversao(10));

//Atividade 2 Crie uma função que receba uma string e a converta em um URL. ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"
function texto(url) {
    return("http://www." +url+ ".com.br");
}
console.log(texto("thiago"));


//Atividade 3 Crie uma função que recebe uma string e retorna a mesma frase, mas com o caracter de exclamação ( ! ).
function exclamacao(texto) {
    return(texto+"!");
}
console.log(exclamacao("Faça isso por favor"));

//Atividade 4 Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.
function idadeCachorro(x) {
    return(x * 7);
}
console.log(idadeCachorro(8));

//Atividade 5 Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal.
//PS: considere que você trabalhe 160 horas no mês. 
function salarioHora(x) {
    return(x / 160);
}
console.log(salarioHora(2500));

//Atividade 6 Crie a função calculadora de IMC* de uma pessoa, que recebe a altura em centímetros e o peso em quilogramas.
// Em seguida, execute a função, testando diferentes valores. 
function imc(altura, peso) {
    return(peso / (altura/100*altura/100));
}
console.log(imc(270, 75));

//Atividade 7 Crie uma função que receba uma string em minúsculas, converta-a em maiúsculas e as retorne. Utilize o método .toUpperCase().
function uper(palavra) {
    console.log (palavra.toUpperCase());
}
uper("thiago adolfo");

//Atividade 8 Crie uma função que receba um parâmetro e retorne o tipo de dado deste parâmetro. 
//Dica: Isso te ajudará a entender o que o operador typeof faz.
function dataType(valor) {
    return typeof valor;
}
console.log(dataType("thiago"));

//Crie uma função pela qual passamos o raio de um círculo e ela retorna a circunferência.
//Dica: Investigue se o objeto Math tem entre suas propriedades o número Pi.
function circunferência(raio) {
    return (2 * Math.PI * raio); 
}
console.log(circunferência(10));

//Lista 2
console.log(Math.random());

//2
function cumprimentar(nome) {
console.log("Olá "+nome+", seja bem vindo!");
}
cumprimentar("Thiago");

//3
function cumprimentarA(nome) {
    const mensagem = "Olá, seja bem vindo! "
    console.log(mensagem + nome);
}
cumprimentarA("Thiago");
cumprimentarA("Stefanie");