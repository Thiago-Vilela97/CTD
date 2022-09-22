package com.example.Aula31AssORM.service;

import java.util.List;
import java.util.Optional;

public interface IEstudanteService<T> {
    public List<T> findAllEstudantes();
    public Optional<T> findEstudantesById(Long id);
    public T addEstudante(T t);
    public String deleteEstudantes(Long id);
    public String updateEstudante(T t);
}
