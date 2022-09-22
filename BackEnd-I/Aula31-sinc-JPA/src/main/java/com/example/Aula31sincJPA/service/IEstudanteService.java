package com.example.Aula31sincJPA.service;

import java.util.List;
import java.util.Optional;

public interface IEstudanteService<T> {

    public List<T> findAllEstudantes();
    public Optional<T> findEstudanteById(Long id);
    public T addEstudante(T t);
    public String deleteEstudante(Long id);
    public String updateEstudante(T t);
}
