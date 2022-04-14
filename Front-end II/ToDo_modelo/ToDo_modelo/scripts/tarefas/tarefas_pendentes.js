//renderizar lista de tarefas pendentes

var itemUlTarefasPendentes = document.querySelector('.tarefas-pendentes')


function renderizaTarefasPendentes(listaTarefas) {
    
    var novoItemLiTarefa = document.createElement('li')

    novoItemLiTarefa.innerHTML =
    `
    <li class="tarefa">
        <div class="not-done"></div>
        <div class="descricao">
          <p class="nome">${listaTarefas.description}</p>
          <p class="timestamp">Criada em: ${listaTarefas.createdAt}</p>
        </div>
      </li>
    `

    itemUlTarefasPendentes.appendChild(novoItemLiTarefa);

}