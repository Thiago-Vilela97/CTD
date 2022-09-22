package com.example.Aula30_InjecaoDependencia.service;

import java.util.List;

public interface ILivroService<T> {
    List<T> buscarTodosLivros();
}
