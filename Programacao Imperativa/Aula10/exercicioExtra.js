let lista = ["arroz", "feijao", "batata", "carne", "pizza"];
console.log(" a função Join junta os elementos de um array")
console.log(lista.join(" - "));

lista.pop();
console.log(" a função pop elimina o ultimo item de um array (caso queira, ela salva o valor em uma variável)");
console.log(lista);

lista.push("pastel", "frango");
console.log(" a função push adiciona um item ao final do nosso array");
console.log(lista);

let y = lista.shift();
console.log(" a função shift elimina o primeiro item de um array");
console.log(y);
console.log(lista);

lista.unshift("pão", "mussarela");
console.log("a função unshift adiciona 1 ou mais itens no inicio de um array");
console.log(lista);