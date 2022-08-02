package entities;

import exceções.ExceptionSaque;

public class ContaCorrente extends AbstractConta{
    private Double limiteSaque;
    private Boolean chequeEspecial;
    private String tipoConta;

    public ContaCorrente(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
        super(numeroConta, titular, saldo);
        this.limiteSaque = limiteSaque;
        chequeEspecial = false;
        tipoConta = "Conta Corrente";
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public Boolean getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Boolean chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public void saque(Double valor) throws ExceptionSaque {
        if (valor > limiteSaque) {
            throw new ExceptionSaque("O valor para saque solicitado é maior que seu limite de saque!");
        }
        setSaldo(getSaldo()-valor);
        if (getSaldo()<0) {
            chequeEspecial = true;
        }
    }

    @Override
    public void deposito(Double valor) {

        setSaldo(getSaldo()+valor);
        if (getSaldo() > 0) {
            chequeEspecial = false;
        } else {
            chequeEspecial = true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de Conta: "+getTipoConta()+"\n");
        sb.append("Titular: "+getTitular()+"\n");
        sb.append("Número da conta: "+getNumeroConta()+"\n");
        sb.append("Saldo: "+getSaldo()+"\n");
        sb.append("Limite de saque: "+limiteSaque+"\n");
        sb.append("Cheque especial ativo? "+chequeEspecial+"\n");
        return sb.toString();
    }

}
