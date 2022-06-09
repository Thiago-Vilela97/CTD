import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int n = sc.nextInt();
        int num = 0;

        while(n>0) {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.print(num);;

                }
                num++;
            }
            n--;
        }

    }
}