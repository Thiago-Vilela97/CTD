//Capturando as informações
let campoNome = document.getElementById("inputName");
let campoApelido = document.getElementById("inputApelido");
let campoEmail = document.getElementById("inputEmail");
let campoSenha = document.getElementById("inputSenha");
let campoRepetirSenha = document.getElementById("inputRepetirSenha");

//variaveis que serão normalizadas
let campoNomeNormalizado;
let campoApelidoNormalizado;
let campoEmailNormalizado;

//Capturando o botão criar conta
let botaoCriarConta = document.getElementById("botaoCriarConta");

//Criação das tags para validação de cada campo
let nomeValido = false;
let apelidoValido = false;
let emailValido = false;
let senhaValida = false;
let repetirSenhaValida = false;

//Definindo o objeto de um novo usuario
const novoUsuarioObjeto = {
    firstName: "",
    lastName: "",
    email: "",
    password: ""
}
let endPoinLogin = "https://ctd-todo-api.herokuapp.com/v1/users"
let configuração = {
    method: 'POST',

    Headers: {
        'content-type': 'application/json'
    },
    body: novoUsuarioObjeto
};

fetch(endPoinLogin, configuração)
    .then(
        resultado => {
            return resultado.json
        }
    )

    .then(resultado => {
        console.log(resultado);
    }

    )
    .catch(
        erros => {
            console.log(erros);
        }
    );

botaoCriarConta.addEventListener('click', function(ev){
  if(camposValidados()) {
    //Nomralizar as informações
    campoNomeNormalizado = retiraEspacosDeUmValor(campoNome.value);
    campoApelidoNormalizado = retiraEspacosDeUmValor(campoApelido.value);
    campoEmailNormalizado = converteValorRecebidoParaMinusculo(campoEmail.value);

    //Populando os campos do objeto com os valores do Input normalizados
    novoUsuarioObjeto.firstName = campoNomeNormalizado;
    novoUsuarioObjeto.lastName = campoApelidoNormalizado;
    novoUsuarioObjeto.email = campoEmailNormalizado;
    novoUsuarioObjeto.password = campoRepetirSenha.value;

    let novoUsuarioJson = JSON.stringify(novoUsuarioObjeto); 
    

    //Itens do fetch, para soolicitar dados da forma correta para a API
    let endPointNovoUsuario = "https://ctd-todo-api.herokuapp.com/v1/users";
    let configuraçãoNovoUsuario = {
        method: 'POST',
        body: novoUsuarioJson,
        headers: {
            'content-type': 'application/json'
        }
    };

    fetch(endPointNovoUsuario, configuraçãoNovoUsuario)
    .then(function(resultado){
        console.log(resultado.status);

        if (resultado.status == 201) {
            alert("Usuario criado com sucesso");
            location.href = "index.html";
        } if (resultado.status == 400) {
            alert("O usuario já existe")
        } 
        return resultado.json();
    })
    .then(function(resultado) {
        console.log(resultado);
        
    }).catch(function(erro) {
        console.log(erro);
    });

    ev.preventDefault();
  } else {
    ev.preventDefault();

  }
})


// Validação Campo Nome
campoNome.addEventListener('blur', function(){

    let campoNomeValidacao = document.getElementById('campoNomeValidacao');

    if (campoNome.value != "") {
        campoNomeValidacao.innerText = "";
        campoNome.style.border = "";
        nomeValido = true;
    } else {
        campoNomeValidacao.innerText = "Entre com um nome";
        campoNomeValidacao.style.fontSize = "8pt";
        campoNomeValidacao.style.color = "red";
        campoNomeValidacao.style.fontWeight = "bold";
        campoNome.style.border = "solid 1px red";
        nomeValido = false;
    }
});

//Validação campo Apelido
campoApelido.addEventListener('blur', function(){

    let campoApelidoValidacao = document.getElementById('campoApelidoValidacao');

    if (campoApelido.value != "") {
        campoApelidoValidacao.innerText = "";
        campoApelido.style.border = "";
        apelidoValido = true;

    } else {
        campoApelidoValidacao.innerText = "Entre com o apelido";
        campoApelidoValidacao.style.color = "red";
        campoApelidoValidacao.style.fontSize = "8pt"
        campoApelidoValidacao.style.fontWeight = "bold";
        campoApelido.style.border = "solid 1px red"
        apelidoValido = false;
    }
    })

//Validação campo Email
campoEmail.addEventListener('blur', function() {

    let campoEmailValidacao = document.getElementById('campoEmailValidacao');

    function validarEmail(email) {
        var re = /\S+@\S+\.\S+/;
        return re.test(email);
      }

    let testeEmail = validarEmail(campoEmail.value);

    if (testeEmail) {
        campoEmailValidacao.innerText = "";
        campoEmail.style.border = "";
        emailValido = true;

    } else {
        campoEmailValidacao.innerText = "Entre com um email válido";
        campoEmailValidacao.style.color = "red";
        campoEmailValidacao.style.fontSize = "8pt"; 
        campoEmailValidacao.style.fontWeight = "bold";
        campoEmail.style.border = "solid 1px red"
        emailValido = false;
    }
});

//Validação campo SENHA - Deve ter pelo menos 1 número / Deve ter ao menos 1 maiusculo / Deve ter ao menos 1 minusculo / no mínimo 6 caracteres

campoSenha.addEventListener('blur', function(){

    let campoSenhaValidacao = document.getElementById('campoSenhaValidacao');

    function validarSenha(senha) {
        var regra = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])([a-zA-Z0-9]{6,})$/;
        return regra.test(senha);
    }

    let testeSenha = validarSenha(campoSenha.value);

    if (testeSenha) {
        campoSenhaValidacao.innerText = "";
        campoSenha.style.border = "";
        senhaValida = true;

    } else {
        campoSenhaValidacao.innerText = "Entre com uma Senha válida, ela deve conter pelo menos:\n *Um número\n *Uma letra maiúscula\n *Uma letra minúscula \n *No mínimo 6 caracteres";
        campoSenhaValidacao.style.color = "red";
        campoSenhaValidacao.style.fontSize = "8pt"
        campoSenhaValidacao.style.fontWeight = "bold"
        campoSenha.style.border = "solid 1px red" 
        senhaValida = false;
    }

})

//Validação campo REPETIR SENHA - Deve ter pelo menos 1 número / Deve ter ao menos 1 maiusculo / Deve ter ao menos 1 minusculo / no mínimo 6 caracteres

campoRepetirSenha.addEventListener('blur', function(){

    let campoRepetirSenhaValidacao = document.getElementById('campoRepetirSenhaValidacao');

    if (campoRepetirSenha.value == campoSenha.value) {
        campoRepetirSenhaValidacao.innerText = "";
        campoRepetirSenha.style.border = "";
        repetirSenhaValida = true;
    } else {
        campoRepetirSenhaValidacao.innerText = "A senha está diferente";
        campoRepetirSenhaValidacao.style.color = "red";
        campoRepetirSenhaValidacao.style.fontSize = "8pt";
        campoRepetirSenhaValidacao.style.fontWeight = "bold";
        campoRepetirSenha.style.border = "solid 1px red";
        repetirSenhaValida = false;

    }
    camposValidados();
})

//Função para alterar visualização do botão caso esteje ou não validado

function camposValidados() {
    if (repetirSenhaValida === true) {
        botaoCriarConta.removeAttribute('disabled');
        return true;
        
    } else {
        botaoCriarConta.setAttribute('disabled', true);
        evento.preventDefault();
        return false;
        
    }
}




