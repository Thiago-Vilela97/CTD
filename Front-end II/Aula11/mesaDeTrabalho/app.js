var botaoSubmit = document.getElementById("botaoSubmit");


console.log(botaoSubmit);

botaoSubmit.addEventListener ("click", function(ev) {
    ev.preventDefault();

    var nome = document.getElementById("name").value;
    var sobrenome = document.getElementById("nickName").value;

    // console.log(sobrenome);

    var imprimir = document.querySelector("main");

    var nomeSemEspaco = tirarEspaço(nome);
    var imprimeNome = escreverHtml(nomeSemEspaco);
    var imprimeNomeMaiusculo = tudoMaiusculo(imprimeNome);
    var imprimeNomeMinusculo = tudoMinusculo(imprimeNome);
    var concatenarNomes = concatenar(nome,sobrenome);

    imprimir.innerHTML += imprimeNome;
    imprimir.innerHTML += imprimeNomeMaiusculo;
    imprimir.innerHTML += imprimeNomeMinusculo;
    imprimir.innerHTML += concatenarNomes;

    


    function tirarEspaço(palavra) {
        return palavra.trim();
    }
    function tudoMaiusculo(palavra) {
        return palavra.toUpperCase();
    }
    function tudoMinusculo(palavra) {
        return palavra.toLowerCase();
    }

    function escreverHtml (dado) {
        return `<h1>${dado}</h1>`
    }

    function concatenar (dado1, dado2) {
        return `<h1>${dado1.concat(" ", dado2)}</h1>`
    }

})