package FichaPratica03;

import java.util.Scanner;

public class Ex_15_Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir ao utilizador para inserir um número
        System.out.print("Insira um número: ");
        int numero = input.nextInt();

        // Calcular o fatorial
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            for (int h = 0, soma = 0; h < fatorial; h++) {
                soma += i;
                if (h == fatorial - 1) {
                    fatorial = soma;
                }
            }
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }
}
