package com.example.Aula30_InjecaoDependencia.controller;

import com.example.Aula30_InjecaoDependencia.entity.LivroEntity;
import com.example.Aula30_InjecaoDependencia.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroController {

    @Autowired
    private ILivroService livroService;

    @GetMapping("/livros")
    public List<LivroEntity> buscarTodosLivros() {
        return livroService.buscarTodosLivros();
    }
}
