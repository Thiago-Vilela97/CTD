package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> conta = new ArrayList<>();

    public Banco(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getConta() {
        return conta;
    }

    public void addConta(Conta novaConta) {
        this.conta.add(novaConta);
    }
    public void removeConta(Conta conta) {
        this.conta.remove(conta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco: "+nome+"\n");
        for (Conta contas : conta) {
              sb.append(contas);
              sb.append("\n");
        }
        return sb.toString();
    }
}
