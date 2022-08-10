package services;

import entities.Cartao;
import entities.Produto;

public interface IFacadeDesconto {

    int desconto(Cartao cartao, Produto produto, int quantidade);
}
