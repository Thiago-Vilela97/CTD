let nome = " Thiago Vilela ";
console.log (nome.length);

//Retirar o espaço no inicio e no final da string (no meio ñ)
console.log (nome.trim());


//Quebra a string em array
nome = nome.trim();
console.log(nome.split(" "));

//arrays
let lista = ["Thiago","22","Neuza","Thiago", 22, true];
//exibir o valor por posição
console.log(lista[2]);
//alterar o valor da posição
lista[2] = "Novo"
console.log(lista[2]);

//adicionar um item ao final do nosso array
lista.push("adicionar1", "novo2");
console.log(lista);

//eliminar o ultimo item de um array
let x = lista.pop();
console.log(lista);
console.log(x);

//eliminar o primeiro item de um array
let y = lista.shift();
console.log(lista);
console.log(y);

//adiciona 1 ou mais elemento ao inicio do array
lista.unshift("Fulano", "Ciclano");
console.log(lista);

//juntar os elementos de um array
let strlista = lista.join();
console.log(strlista);

let separadoPorTraco = lista.join(" - ");
console.log(separadoPorTraco);

console.log(lista.lastIndexOf(22));
console.log(lista.indexOf(22));

console.log(lista.includes(22));
console.log(lista.includes(82));