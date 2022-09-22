package com.dh.service;

import org.example.ConfiguracaoJDBC;
import org.example.Filial;
import org.example.FilialDaoH2;
import org.example.FilialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilialServiceTest {

    FilialService filialService;

    @BeforeEach
    void doBefore() {
        filialService = new FilialService(new FilialDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void salvarFilial() {
        Filial filial = new Filial("intercity","jequitiba", 12, "Belo Horizonte", "MG", true);
        Filial filial1 = new Filial("Flip","P. Costa e Silva", 19, "Contagem", "SP", false);
        Filial filial2 = new Filial("Hotel3","Joao Rosa", 121, "Betim", "RJ", true);
        Filial filial3 = new Filial("Hotel 4","JK", 122, "Igarape", "BA", false);
        Filial filial4 = new Filial("Hotel 5","Av. Brasil", 132, "Divinopolis", "RN", true);
        filialService.salvar(filial);
        filialService.salvar(filial1);
        filialService.salvar(filial2);
        filialService.salvar(filial3);
        filialService.salvar(filial4);

        assertTrue(filial.getId()!= null);
        assertTrue(filial1.getId()!= null);
        assertTrue(filial2.getId()!= null);
        assertTrue(filial3.getId()!= null);
        assertTrue(filial4.getId()!= null);
    }
}

