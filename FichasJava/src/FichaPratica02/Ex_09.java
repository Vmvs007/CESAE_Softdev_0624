package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int a, b, c;

        // Ler valores
        System.out.print("Insira um número: ");
        a = input.nextInt();

        System.out.print("Insira um número: ");
        b = input.nextInt();

        System.out.print("Insira um número: ");
        c = input.nextInt();

        if (a < b && a < c) {
            System.out.println("Menor: " + a);
        }

        if (b < a && b < c) {
            System.out.println("Menor: " + b);
        }

        if (c < a && c < b) {
            System.out.println("Menor: " + c);
        }
    }
}
