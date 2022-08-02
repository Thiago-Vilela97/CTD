package entities;

import exceções.ExceptionSaque;

public interface Conta {
    void saque(Double valor) throws ExceptionSaque;
    void deposito(Double valor);
}
