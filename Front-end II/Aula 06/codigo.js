// 1- Adiciona ao cartão, o atributo "class" com o valor "cartao"

let cartao = document.getElementById("cartao");
cartao.setAttribute("class", "cartao");

// 2- Adicione o atributo "src" à imagem com o valor "https://www.youtube.com/img/desktop/yt_1200.png"
let imagem = document.querySelector("img");
imagem.setAttribute("src", "https://www.youtube.com/img/desktop/yt_1200.png");

// 3- Remova a classe "titulo-feio" do título do documento
let tituloFeio = document.querySelector("h1");
tituloFeio.removeAttribute("class", "tituloFeio");

// 4- Verifique se o link para o YouTube tem o atributo href ou não, e imprima esse resultado no console
let linkYoutube = document.getElementById("link_youtube");
if (linkYoutube.hasAttribute("href")) {
    console.log("Possui link");
}
else {
    console.log("Favor inserir o link do youtube")
}

// 5- Capture o valor de href do link do Wikipedia e exiba no console
let linkWikipedia = document.getElementById("link_wikipedia");

console.log(linkWikipedia.getAttribute("href"));