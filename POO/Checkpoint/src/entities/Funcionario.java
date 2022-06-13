package entities;

import entities.enums.StatusFuncionario;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Funcionario {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
    private int id;
    private String nome;
    private String cpf;
    private Date dataHoraEntrada;
    private Date dataHoraSaida;
    private StatusFuncionario statusFuncionario;

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
        if(dataHoraEntrada == null) {
            this.statusFuncionario = StatusFuncionario.valueOf("AUSENTE");
        }
        else {
            this.statusFuncionario = StatusFuncionario.valueOf("PRESENTE");
        }
    }

    @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Nome: ");
            sb.append(getNome()+"\n");
            if(dataHoraEntrada == null) {
                sb.append("Funcionario não registrou Entrada/Saída!"+"\n");
            } else {
                sb.append("Data da entrada: ");
                sb.append(sdf.format(dataHoraEntrada)+"\n");
                sb.append("Data da saída: ");
                sb.append(sdf.format(dataHoraSaida)+"\n");
            }

            sb.append("O funcionário "+ nome + " está: "+ statusFuncionario+"\n");
            return sb.toString();
        }
}
