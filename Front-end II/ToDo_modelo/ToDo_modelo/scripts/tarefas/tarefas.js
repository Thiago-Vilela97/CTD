//capturando as tags html
campoNomeUsuario = document.getElementById('nomeUsuario');
campoNovaTarefa = document.getElementById('novaTarefa');
botaoAddTarefa = document.getElementById('botaoAddTarefa');

window.onload = function() {
   
    //itens do fetch de localizar dados do usuario
    var endPointInfoUsuarios = "https://ctd-todo-api.herokuapp.com/v1/users/getMe"
    var token = localStorage.getItem("jwt");
    var config = {
        method: "GET",
        headers: {
            "authorization": token
        }
    }

    //Verificando se possui um token no LocalStorage, caso tenha renderiza nome do usuario
    if(!token) {
        location.href = "index.html"
    } else {
        fetch(endPointInfoUsuarios, config)
        .then(function(resultado) {
            return resultado.json()
        }).then(function(resposta) {
            const nomeUsuario = resposta.firstName;
            const sobrenomeUsuario = resposta.lastName;
            campoNomeUsuario.innerText = nomeUsuario +" "+sobrenomeUsuario ;
        })
    }

    //Itens de configuração para listar tarefas
    var endPointListarTarefas = "https://ctd-todo-api.herokuapp.com/v1/tasks";
    var configListarTarefas = {
        method: "GET",
        headers: {
            authorization: token
        }
    };

    //Função para listar tarefas
    function listarTarefas(endPoint, config) {
        fetch(endPoint, config)
        .then((resposta) => resposta.json())
        .then(function(resposta) {

            for (const tarefa of resposta) {
                listaTarefas = tarefa
                renderizaTarefasPendentes(listaTarefas);
                console.log(listaTarefas);
            }
            
        })
    }

    listarTarefas(endPointListarTarefas, configListarTarefas);

    //Itens de Configuração para criar nova tarefa
    var endPointCriarTarefa = "https://ctd-todo-api.herokuapp.com/v1/tasks";
    var objetoNovaTarefa = {
        description: "",
        completed: false
    };

    //Função para criar tarefas
    function criarNovaTarefa(endpoint, configuracao) {
        fetch(endpoint, configuracao)
            .then((resposta) => resposta.json())
            .then(function(resultado) {
                // location.reload();
            console.log(resultado);
    })
    }

    //evento para criar nova tarefa
    botaoAddTarefa.addEventListener('click', function(evento) {

        evento.preventDefault()

        objetoNovaTarefa.description = campoNovaTarefa.value;
        objetoNovaTarefa.completed = false;

        var novaTarefaJson = JSON.stringify(objetoNovaTarefa);

        var configCriarTarefa = {
            method: "POST",
            body: novaTarefaJson,
            headers: {
                "authorization": token,
                "content-type": "application/json",
            },
        }

        criarNovaTarefa(endPointCriarTarefa, configCriarTarefa)
                
    })
}