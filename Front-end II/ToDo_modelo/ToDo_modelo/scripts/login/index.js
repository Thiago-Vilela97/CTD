//Capturando as informações
let campoEmailLogin = document.getElementById("inputEmail");
let campoSenhaLogin = document.getElementById("inputPassword");
let botaoAcessar = document.getElementById("botaoAcessar");

let campoEmailLoginNormalizado;
let campoSenhaLoginNormalizado;

//variável de controle da validação
let emailEValido = false;

//Definindo objeto
const usuarioObjeto = {
  email: "",
  password: "",
};

botaoAcessar.addEventListener("click", function (evento) {
  if (validacaoTelaDeLogin()) {
    //Normalizando as informações
    campoEmailLoginNormalizado = retiraEspacosDeUmValor(campoEmailLogin.value);
    campoSenhaLoginNormalizado = retiraEspacosDeUmValor(campoSenhaLogin.value);
    campoEmailLoginNormalizado = converteValorRecebidoParaMinusculo(campoEmailLoginNormalizado);

    //Populando o objeto com as informações normalizadas
    usuarioObjeto.email = campoEmailLoginNormalizado;
    usuarioObjeto.password = campoSenhaLoginNormalizado;

    let usuarioJson = JSON.stringify(usuarioObjeto);

    let endPoinLogin = "https://ctd-todo-api.herokuapp.com/v1/users/login";
    let configuração = {
      method: "POST",
      body: usuarioJson,
      headers: {
        "content-type": "application/json",
      },
    };

    fetch(endPoinLogin, configuração)
      .then((resultado) => {
        console.log(resultado.status);
        if(resultado.status == 201) {
            alert("Usuario logado com sucesso")
        } if (resultado.status == 400) {
            alert("Existe alguma informação divergente")
        }
        return resultado.json();
      })

      .then((resultado) => {
        console.log(resultado.jwt);
        localStorage.setItem("jwt", resultado.jwt)
        location.href = "tarefas.html"
      
      })
      .catch((erros) => {
        console.log(erros);
      });
      
    evento.preventDefault();
  } else {
    alert("Ambos os campos devem ser informados");
    evento.preventDefault(); //Não permite que o formulário seja executado / realizado o 'submit'
  }
});

//Validando o campo de Email
campoEmailLogin.addEventListener("blur", function () {
  //Captura o elemento "small"
  let inputEmailValidacao = document.getElementById("inputEmailValidacao");

  //Se o campo estiver com algum valor...
  if (campoEmailLogin.value != "") {
    inputEmailValidacao.innerText = "";
    campoEmailLogin.style.border = ``;
    emailEValido = true;

    //Se o campo estiver sem nenhum valor...
  } else {
    inputEmailValidacao.innerText = "Campo obrigatório";
    inputEmailValidacao.style.color = "#EE1729EC";
    inputEmailValidacao.style.fontSize = "8pt";
    inputEmailValidacao.style.fontWeight = "bold";
    campoEmailLogin.style.border = `1px solid #EE1729EC`;
    emailEValido = false;
  };

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
  validacaoTelaDeLogin();
});

function validacaoTelaDeLogin() {
  if (emailEValido) {
    botaoAcessar.removeAttribute("disabled");
    botaoAcessar.innerText = "Acessar";
    return true;
  } else {
    botaoAcessar.setAttribute("disabled", true);
    botaoAcessar.innerText = "Bloqueado";
    return false;
  }
}
