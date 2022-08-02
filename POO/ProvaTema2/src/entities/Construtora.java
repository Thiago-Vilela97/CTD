package entities;

import java.util.ArrayList;
import java.util.List;

public class Construtora {
    private String nome;
    private List<Projeto> projetos;

    public Construtora(String nome) {
        this.nome = nome;
        projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

}
