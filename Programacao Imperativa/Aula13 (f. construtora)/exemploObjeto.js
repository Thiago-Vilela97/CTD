// let carro = {
//     modelo: "Uno",
//     marca: "Fiat",
//     cor: "Azul",
//     andar: function() {
//         return "Carro "+this.marca + " "+ this.modelo+ " está andando";
//     }
// }

// console.log(carro);
// console.log(carro.modelo);
// console.log(carro.cor);
// console.log(carro.andar());

function Carro(modelo, cor) {
    this.modelo = modelo;
    this.cor = cor;
    this.andar = function() {
    return "O Carro "+this.modelo + " "+this.cor + " está andando";
           }
}

let carro1 = new Carro ('Ford', 'Vermelho');
let carro2 = new Carro ('Fiat', 'Azul');
console.log(carro1);
console.log(carro2.andar());