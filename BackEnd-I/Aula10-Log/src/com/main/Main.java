package com.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        Calculadora calculadora = new Calculadora(1,3);
        int soma = calculadora.somar();
        System.out.println(soma);

        Calculadora calculadora1 = new Calculadora(1,0);
        double divisao = calculadora1.dividir();
        System.out.println(divisao);
    }
}