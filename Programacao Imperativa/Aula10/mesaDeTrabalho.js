let lista = ["arroz", "feijao", "batata", "carne", "pizza"];
console.log(lista);

//A
console.log(lista[3]);

//B
lista[0] = "Thiago";
lista[1] = "Joao";
lista[2] = "Fulano";
lista[3] = "Ciclano";
lista[4] = "teste";
console.log(lista);

//C
lista.push("adicionar1");
console.log(lista);

//D
lista.pop();
console.log(lista);

//E
console.log(lista[2] == lista[3]);

//Parte 2 - O que esse códigos retornam
//1) 5
//2) Spiderman
//3)Uma strig qualquer



let grupoDeAmigos = [ ["Harry", "Ron", "Hermione"], ["Spiderman", "Hulk", "Ironman"], ["Penélope Glamour", "Pierre Nodoyuna","Patán"] ];
console.log(grupoDeAmigos[1][0]);

let teste = "Olá mundo";
console.log(teste.indexOf("mundo"));

console.log(teste.slice(4,9));

let str = "uma string qualquer";
let thiago = [ [45, 89, 0], ["Digital", "House", true], ["string", "123","false", 54, true, str] ];
console.log(thiago[2][thiago[2].length - 1]);

//Parte 3 - Array invertido
//1
function imprimirInverso(indexada) {
    for (let result = indexada.length; result >=0; result--)
    console.log (indexada[result]) ;
}
console.log(lista);
imprimirInverso(lista);
console.log(lista);

//2 - Não fiz

//Parte 4 - Somar array
function somarArray (recebe) {
    
}