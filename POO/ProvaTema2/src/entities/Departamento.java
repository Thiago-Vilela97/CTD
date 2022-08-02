package entities;

import java.util.Date;

public class Departamento extends Obra implements Comparable<Departamento>{

    private int quantidadeAndares;
    private int apartamentoPorAndar;
    private int numeroApartamentos;

    public Departamento(String endereco, Date dataInicio, Date dataTerminoPrevista, int quantidadeAndares,
                        int apartamentoPorAndar) {
        super(endereco, dataInicio, dataTerminoPrevista);
        this.quantidadeAndares = quantidadeAndares;
        this.apartamentoPorAndar = apartamentoPorAndar;
        this.numeroApartamentos = setNumeroApartamentos();
    }

    public int getQuantidadeAndares() {
        return quantidadeAndares;
    }

    public void setQuantidadeAndares(int quantidadeAndares) {
        this.quantidadeAndares = quantidadeAndares;
    }

    public int getApartamentoPorAndar() {
        return apartamentoPorAndar;
    }

    public void setApartamentoPorAndar(int apartamentoPorAndar) {
        this.apartamentoPorAndar = apartamentoPorAndar;
    }

    public int getNumeroApartamentos() {
        return setNumeroApartamentos();
    }

    public int setNumeroApartamentos() {
        this.numeroApartamentos = quantidadeAndares * apartamentoPorAndar;
        return this.numeroApartamentos;
    }

    @Override
    public String obterConclusaoObra() {
        if (getDataTerminoPrevista() == getDataTerminoReal() && getStatusObra().equals("ACABADO")) {
            return "Obra concluida no prazo determinado";
        }
        return "Obra atrasada";
    }

    public String mostrarCaracteristica() {
        if (getQuantidadeAndares() > 15 ) {
            return "É um arranha céu!";
        }
            return "É um departamento simples! Não é um arranha céu!";
    }

    @Override
    public int compareTo(Departamento outro) {
        if (this.numeroApartamentos > outro.getNumeroApartamentos()) return 1;
        if (this.numeroApartamentos < outro.getNumeroApartamentos()) return -1;
        return 0;
    }
}
