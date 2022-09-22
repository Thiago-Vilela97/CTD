package com.example.Aula30_InjecaoDependencia.entity;

public class LivroEntity {
    private Integer id;
    private String titulo;
    private String autor;

    public LivroEntity() {
    }
    public LivroEntity(Integer id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
