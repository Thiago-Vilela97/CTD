// Funções
//ESTRUTURA BÁSICA

function somar(a, b){
     console.log("Isso ai")
     return( a + b);
}
console.log (somar(2, 3));

//Exemplo 2

function nomePessoa(nome, idade) {
    return nome+" tem "+idade+ " anos";
}
console.log( nomePessoa("Thiago", 24));

//Função anonima

let sub = function(x, y) {
    console.log(x - y);
}

sub(10, 5);