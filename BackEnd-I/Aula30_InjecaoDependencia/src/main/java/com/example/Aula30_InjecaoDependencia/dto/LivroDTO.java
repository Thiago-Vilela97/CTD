package com.example.Aula30_InjecaoDependencia.dto;

import com.example.Aula30_InjecaoDependencia.entity.LivroEntity;

public class LivroDTO {
    private String titulo;
    private String autor;

    public LivroDTO(LivroEntity livroEntity) {
        this.titulo = livroEntity.getTitulo();
        this.autor = livroEntity.getAutor();
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
