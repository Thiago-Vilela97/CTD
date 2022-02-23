let carro = {
    nome: "Fox",
    ano: "2011"
}

for(let prop in carro) {
    console.log(carro[prop]);
}

let series = ["Friends", "Game of thrones", "Breaking bead"];

for (let values of series) {
    console.log(values);
}