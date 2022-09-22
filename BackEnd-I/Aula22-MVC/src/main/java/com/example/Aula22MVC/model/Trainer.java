package com.example.Aula22MVC.model;

public class Trainer {
    private String nome;

    public Trainer(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
