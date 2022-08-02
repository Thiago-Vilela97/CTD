package entities;

import exceções.ExceptionSaque;

public abstract class AbstractConta implements Conta{

    private Integer numeroConta;
    private String titular;
    private Double saldo;


    public AbstractConta(Integer numeroConta, String titular, Double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void deposito(Double valor) {
        setSaldo(getSaldo()+valor);
    }

}
