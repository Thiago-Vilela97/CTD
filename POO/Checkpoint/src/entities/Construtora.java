package entities;

import java.util.List;
import java.util.ArrayList;


public class Construtora {
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Construtora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Funcionario func : funcionarios) {
            sb.append(func);
            sb.append("\n");
        }
        return sb.toString();
    }
}



