package com.example.Aula28consumindoAPI;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ProdutoClienteController {

    private ProdutoCliente produtoCliente = new ProdutoCliente();

    @PostMapping("/salvar")
    public Produto salvar(@RequestBody Produto produto) {
        return produtoCliente.salvar(produto);
    }

    @GetMapping("/todos")
    public Produto buscarTodos(@RequestBody Integer id) {
        return produtoCliente.buscarPorId(id);
    }

    @PutMapping("/alterar")
    public Produto alterar(@RequestBody Produto produto) {
        return produtoCliente.alterar(produto);
    }

    @DeleteMapping("/excluir")
    public String excluir(@PathVariable Integer id) {
        return produtoCliente.excluir(id);
    }


}
