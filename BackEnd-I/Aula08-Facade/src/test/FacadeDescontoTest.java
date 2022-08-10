package test;

import entities.Cartao;
import entities.Produto;
import facade.FacadeDesconto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeDescontoTest {

    private FacadeDesconto facadeDesconto = new FacadeDesconto();
    private Cartao cartao;
    private Produto produto;

    @BeforeEach
    void doBefore() {
        cartao = new Cartao ("334465","Star Bank");
        produto = new Produto("ervilhas", "Lata");
    }

    @Test
    void validarDescontoBancoTest() {
        produto.setTipo("Enlatado");

        int desconto = facadeDesconto.desconto(cartao, produto, 1);
        assertEquals(20,desconto);
    }

    @Test
    void validarDescontoProdutoTeste() {
        cartao.setBanco("Itau");

        int desconto = facadeDesconto.desconto(cartao, produto, 1);
        assertEquals(10, desconto);
    }

    @Test
    void validarDescontoQuantidadeTeste() {
        produto.setTipo("enlatado");
        cartao.setBanco("Itau");

        int desconto = facadeDesconto.desconto(cartao, produto, 12);
        assertEquals(15, desconto);
    }

    @Test
    void validarDescontoTotalTeste() {
        int desconto = facadeDesconto.desconto(cartao, produto, 12);
        assertEquals(45, desconto);
    }
}
