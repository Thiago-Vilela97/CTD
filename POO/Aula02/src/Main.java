import java.util.Locale;
import java.util.Scanner;

public class Main {

        public static int maiorNumero(int n1, int n2, int n3) {

        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Exercicio 1
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " É um número primo.");
        else
            System.out.println(num + " Não é um número primo.");

        // Exercicio 2 - Função criada antes do "Void main"

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int result = maiorNumero(n1, n2, n3);
        System.out.println(result);
    }
}
