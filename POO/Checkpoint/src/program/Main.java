package program;

import entities.Construtora;
import entities.Engenheiro;
import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Construtora construtora = new Construtora("Direcional");

        System.out.println("Entre com os dados do funcionario:");
        System.out.print("id: ");
        int id = sc.nextInt();
        System.out.print("nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("cpf: ");
        String cpf = sc.nextLine();


        Funcionario func1 = new Engenheiro(id, nome, cpf);
        construtora.addFuncionario(func1);

        System.out.println(func1);

        sc.close();
    }
}