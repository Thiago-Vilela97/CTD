package com.example.Aula38MongoDBSINC.model;

public class EquipeModel {

    private Integer id;
    private String nome;
    private String pais;

    public EquipeModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "EquipeModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
