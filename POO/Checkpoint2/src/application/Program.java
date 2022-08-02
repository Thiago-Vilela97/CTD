package application;

import entities.Banco;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import exceções.ExceptionSaque;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ExceptionSaque {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o nome do banco: ");
        String nomeBanco = sc.nextLine();

        Banco banco = new Banco(nomeBanco);

        System.out.println();
        System.out.print("Quantas contas poupança deseja inserir? ");
        int qtdContasPoupanca = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= qtdContasPoupanca; i++) {
            System.out.println("Entre com os dados da conta #"+i);
            System.out.print("Número da conta: ");
            Integer numeroConta = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldo = sc.nextDouble();
            System.out.println();

            banco.addConta(new ContaPoupanca(numeroConta, titular, saldo));
        }

//        Entrada para testes das contas correntes e poupança

//        ContaPoupanca contaTeste = new ContaPoupanca(357, "Poupança teste", 5300.0);
//        banco.addConta(contaTeste);
//        Double rende = contaTeste.rendePorMes();
//        contaTeste.saque(5200.0);
//        contaTeste.deposito(3200.0);
//
//        ContaCorrente contaTeste1 = new ContaCorrente(357, "Poupança teste", 5300.0,7000.0);
//        banco.addConta(contaTeste1);
//        contaTeste1.saque(6000.0);
//        System.out.println(banco);
//        contaTeste1.deposito(1000.00);



        System.out.println();
        System.out.print("Quantas contas corrente deseja inserir? ");
        int qtdContasCorrente = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= qtdContasCorrente; i++) {
            System.out.println("Entre com os dados da conta #"+i);
            System.out.print("Número da conta: ");
            Integer numeroConta = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            Double limiteSaque = sc.nextDouble();
            System.out.println();

            banco.addConta(new ContaCorrente(numeroConta, titular, saldo,limiteSaque));
        }

        System.out.println();
        System.out.println(banco);

        sc.close();
    }
}
