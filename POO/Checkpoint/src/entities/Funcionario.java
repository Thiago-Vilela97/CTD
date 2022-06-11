package entities;

import java.util.Date;

public abstract class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private Date dataHoraEntrada;
    private Date dataHoraSaida;
    private String statusFuncionario;

    public Funcionario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void definirDataHoraEntrada(Date DataHoraEntrada) {
        this.dataHoraEntrada = DataHoraEntrada;
    }
    public void definirDataHoraSaida(Date DataHoraSaida) {
        this.dataHoraSaida = DataHoraSaida;
    }
    public void definirStatusFuncionario() {
        if (dataHoraEntrada == null) {
            this.statusFuncionario = "AUSENTE";
        } else {
            this.statusFuncionario = "PRESENTE";
        }
    }

    @Override
    public String toString() {
        return "Esse funcionário está: "+ statusFuncionario;
    }
}
