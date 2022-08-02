package entities;

public class Projeto {
    private int id;
    private String nome;
    private String cidadeLocalizada;
    private Obra obra;

    public Projeto() {
    }
    public Projeto(int id, String nome, String cidadeLocalizada, Obra obra) {
        this.id = id;
        this.nome = nome;
        this.cidadeLocalizada = cidadeLocalizada;
        this.obra = obra;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidadeLocalizada() {
        return cidadeLocalizada;
    }
    public void setCidadeLocalizada(String cidadeLocalizada) {
        this.cidadeLocalizada = cidadeLocalizada;
    }
}
