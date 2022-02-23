let listaPessoas = [
    {
        "sexo": "F",
        "nome": "Abigael Natte",
        "altura": "1.61"
    },
    {

        "sexo": "M",
        "nome": "Ramon Connell",
        "altura": "1.75"
    },
    {

        "sexo": "M",
        "nome": "Jarret Lafuente",
        "altura": "1.55"
    },
    {

        "sexo": "F",
        "nome": "Ansel Ardley",
        "altura": "1.67"
    },
    {

        "sexo": "F",
        "nome": "Jacki Shurmer",
        "altura": "1.75"
    },
    {

        "sexo": "M",
        "nome": "Jobi Mawtus",
        "altura": "1.88"
    },
    {

        "sexo": "M",
        "nome": "Thomasin Latour",
        "altura": "1.67"
    },
    {

        "sexo": "F",
        "nome": "Lonnie Verheijden",
        "altura": "1.63"
    },
    {

        "sexo": "M",
        "nome": "Alonso Wannan",
        "altura": "1.92"
    },
    {

        "sexo": "F",
        "nome": "Bendite Huggett",
        "altura": "1.80"
    }
];

// Encontrar a menor e a maior altura na lista de pessoas

let menorAltura = Math.min.apply(Math, listaPessoas.map(function (x) {
    return x.altura;
}))


let maiorAltura = Math.max.apply(Math, listaPessoas.map(function (x) {
    return x.altura;
}))

console.log(`A menor altura do grupo é ${menorAltura}m e a maior é ${maiorAltura}m.`)

// Calcular a média de altura das mulheres

function mediaAlturaMulheres(array) {

    let mulheres = array.filter(function (sx) {
        return sx.sexo == "F";
    });

    let result = 0;
    let somaAltura = mulheres.map(function (valor) {
        return result += parseFloat(valor.altura);
    });


    let media = 0;
    return media = result / mulheres.length;

}

console.log(mediaAlturaMulheres(listaPessoas));

//Calcular o numero de Homens da lista

const numeroHomens = array => {

    let valor = array.filter(function (sex) {
        return sex.sexo == "M"
    })
    return valor.length;
}


console.log(numeroHomens(listaPessoas))

