package com.example.Aula30_InjecaoDependencia.repository;

import java.util.List;

public interface ILivroRepository<T> {
    List<T> buscarTodosLivros();
}
