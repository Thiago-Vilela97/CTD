package com.example.Aula25EcommerceMVC.dao;

import com.example.Aula25EcommerceMVC.model.Produto;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    Produto salvar(Produto produto) throws SQLException;
    List<T> buscarTodos() throws SQLException;
    void alterar(T t) throws SQLException;
    Optional<T> buscarPorId(int id) throws SQLException;
    void excluir(int id) throws SQLException;
}
