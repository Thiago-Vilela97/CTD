let arrayNome = ["Thiago", "Joao", "Carlos", "Fulano" ];

for (let i = 0; i <arrayNome.length; i++) {
    console.log(i, " - ", arrayNome[i]);
}

//Microdesafio Ciclo FOR
//1 Escrever "Olá mundo" 5x

for (let index = 1; index <= 5; index++) {
    console.log("Olá Mundo");
}

//2 escrever apenas números ímpares de 0 a 10

for (let i = 1; i <=10; i++) {
    if (i%2 != 0) {
        console.log("número ímpar =", i);
    }
}

//3 Criar uma taboada
for (let calc = 0; calc < 10; calc++) {
    for (let teste = 0; teste < 10; teste ++) {
        console.log(calc, "*", teste,"=", calc*teste);
    }
}