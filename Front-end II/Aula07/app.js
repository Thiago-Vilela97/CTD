/* 
Passo a passo para executar o desafio - Aula 7
1 - Criar a opção de escolha do felino 
2 - Verificar qual foi a escolha
3 - Definir uma url da internet
4 - Alteram o atributo "src"
*/

// Isabela Wagner, Matheus Ferreira, Thiago Vilela, Juliana Ruama, Danielle Alves



function alterarImagem(imagem) {
    var imagem, index;
    index = prompt('Selecione o Felino que deseja alterar a imagem: \n 1 - tigre\n 2 - Leão\n 3 - Leopardo \n 4 - Pantera negra\n 5 - Jaguar\n 6 - guepardo');
    
    if (index == "1") {
        imagem = document.querySelectorAll("img");
        console.log(imagem[0]);
        imagem[0].removeAttribute("src");
        var link = prompt('Entre com o novo link da imagem')
        imagem[0].setAttribute("src",link)
    }
    if (index == "2") {
        imagem = document.querySelectorAll("img");
        console.log(imagem[0]);
        imagem[1].removeAttribute("src");
        var link = prompt('Entre com o novo link da imagem')
        imagem[1].setAttribute("src",link)
    }
    if (index == "3") {
        imagem = document.querySelectorAll("img");
        console.log(imagem[0]);
        imagem[2].removeAttribute("src");
        var link = prompt('Entre com o novo link da imagem')
        imagem[2].setAttribute("src",link)
    }
    if (index == "4") {
        imagem = document.querySelectorAll("img");
        console.log(imagem[0]);
        imagem[3].removeAttribute("src");
        var link = prompt('Entre com o novo link da imagem')
        imagem[3].setAttribute("src",link)
    }
    if (index == "5") {
        imagem = document.querySelectorAll("img");
        console.log(imagem[0]);
        imagem[4].removeAttribute("src");
        var link = prompt('Entre com o novo link da imagem')
        imagem[4].setAttribute("src",link)
    }
    if (index == "6") {
        imagem = document.querySelectorAll("img");
        console.log(imagem[0]);
        imagem[5].removeAttribute("src");
        var link = prompt('Entre com o novo link da imagem')
        imagem[5].setAttribute("src",link)
    }

} 

function darkMode () {
    document.querySelector('body').classList.toggle('dark');
}

