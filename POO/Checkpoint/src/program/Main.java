package program;

import entities.Construtora;
import entities.Engenheiro;
import entities.Funcionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        Construtora construtora = new Construtora("Direcional");

        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Entre com os dados do funcionario #"+i);
            System.out.print("id: ");
            int id = sc.nextInt();
            System.out.print("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("cpf: ");
            String cpf = sc.nextLine();

            System.out.print("Deseja registrar a entrada e a saída? (s/n) ");
            char entrada = sc.next().charAt(0);

            Funcionario func;
            if(entrada == 's') {
                System.out.print("Registre a entrada desse funcionário (dd/MM/yyyy HH:ss): ");
                sc.nextLine();
                Date horaEntrada = sdf.parse(sc.nextLine());
                System.out.print("Registre a saida desse funcionário (dd/MM/yyyy HH:ss): ");
                Date horaSaida = sdf.parse(sc.nextLine());

                func = new Engenheiro(id, nome, cpf);
                func.definirDataHoraEntrada(horaEntrada);
                func.definirDataHoraSaida(horaSaida);
            } else {
                func = new Engenheiro(id, nome, cpf);
            }



            func.definirStatusFuncionario();
            construtora.addFuncionario(func);
        }

        System.out.println();
        System.out.println("Registro dos funcionarios:");
        System.out.println(construtora);

        sc.close();
    }
}