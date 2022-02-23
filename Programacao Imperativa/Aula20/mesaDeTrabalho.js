let questionario = [
    {
        "nome": "Abigael Natte",
        "opniao": 1,
        "idade": 29
    },
    {

        "nome": "Ramon Connell",
        "opniao": 2,
        "idade": 45
    },
    {

        "nome": "Jarret Lafuente",
        "opniao": 3,
        "idade": 21
    },
    {

        "nome": "Ansel Ardley",
        "opniao": 3,
        "idade": 15
    },
    {

        "nome": "Jacki Shurmer",
        "opniao": 1,
        "idade": 24
    },
    {

        "nome": "Jobi Mawtus",
        "opniao": 1,
        "idade": 48
    },
    {

        "nome": "Thomasin Latour",
        "opniao": 2,
        "idade": 18
    },
    {

        "nome": "Lonnie Verheijden",
        "opniao": 3,
        "idade": 37
    },
    {

        "nome": "Alonso Wannan",
        "opniao": 2,
        "idade": 22
    },
    {

        "nome": "Bendite Huggett",
        "opniao": 1,
        "idade": 44
    }
];


// a média das idades das pessoas que responderam ótimo;

function mediaIdadeOpniao(array, opniao) {
    let pessoasOpniao = array.filter(function (valor) {
        return valor.opniao === opniao
    })

    let result = 0;
    let somaIdadeOpniao = pessoasOpniao.map(function (valor) {
        return result += valor.idade
    })

    let mediaIdadeOpniao = result / pessoasOpniao.length;

    return mediaIdadeOpniao;

}


// a quantidade de pessoas que responderam regular;

function opnioes(array, opniao) {
    let opniaoEscolhida = array.filter(function (valor) {
        return valor.opniao === opniao;
    })
    let result = 0;

    result = opniaoEscolhida.length;

    if (opniao == 1) {
        console.log("A quantidade de pessoas que opnaram Regular é: " + result)
    }
    if (opniao == 2) {
        console.log("A quantidade de pessoas que opnaram Bom é: " + result)
    }
    if (opniao == 3) {
        console.log("A quantidade de pessoas que opnaram Ótimo é: " + result)
    }
    else {
        console.log("Opção inválida")
    }
}

// a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.

function calcularPorcentagem(array, opiniao) {
    let total, porcentagem, opinaramBom;

    certaOpniao = array.filter(function (valor) {
        return valor.opniao == opiniao
    })

    total = certaOpniao.length;
    porcentagem = total * 100 / array.length;
    console.log("A porcentagem que responderam ao requisito selecionado é: " + porcentagem + "%");

}


console.log(mediaIdadeOpniao(questionario, 3));
opnioes(questionario, 3);
calcularPorcentagem(questionario, 1)