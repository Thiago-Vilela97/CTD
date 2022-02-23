const alicia = [33, 89, 34];
const bob = [33, 89, 34];

function encontrarGanhador(a, b) {
    let pontosPrimeiroParticipante = 0;
    let pontosSegundoParticipante = 0;
    for (let i = 0; i < 4; i++) {
        if (a[i] > b[i]) {
            pontosPrimeiroParticipante++;
        }
        else if (a[i] < b[i]) {
            pontosSegundoParticipante++;
        }
    }
    if (pontosPrimeiroParticipante > pontosSegundoParticipante) {
        return ("Alice com " + pontosPrimeiroParticipante + " pontos");
    }
    else if (pontosPrimeiroParticipante < pontosSegundoParticipante) {
        return ("Bob com " + pontosSegundoParticipante + " pontos");
    }
    else {
        return ("empate");
    }
}

console.log("O Ganhador é:", encontrarGanhador(alicia, bob));