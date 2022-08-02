package entities;

import exceções.ExceptionSaque;

public class ContaPoupanca extends AbstractConta {
    private String tipoConta;
    public ContaPoupanca(Integer numeroConta, String titular, Double saldo) {

        super(numeroConta, titular, saldo);
        tipoConta = "Conta Poupança";

    }

    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public void saque(Double valor) throws ExceptionSaque {
        if(getSaldo() - valor < 0){
            throw new ExceptionSaque("Valor de saque inválido!");
        }
        setSaldo(getSaldo() - valor);
    }

    public Double rendePorMes() {
        return getSaldo() * 0.03;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("Tipo de Conta: "+getTipoConta()+"\n");
            sb.append("Titular: "+getTitular()+"\n");
            sb.append("Número da conta: "+getNumeroConta()+"\n");
            sb.append("Saldo: "+getSaldo()+"\n");
            sb.append("Rende por mês: "+rendePorMes()+"\n");
            return sb.toString();
    }

}
