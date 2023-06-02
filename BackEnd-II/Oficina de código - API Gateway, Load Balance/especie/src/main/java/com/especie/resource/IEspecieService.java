package com.especie.resource;

import java.util.List;
import java.util.Optional;

public interface IEspecieService<T> {
    List<T> findAll();
    Optional<T> findById(Integer id);
    T adicionar(T t);
    String deletar(Integer id);
    String atualizar(T t);
}
