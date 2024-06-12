package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // Ler valor1
        System.out.print("Insira o valor1: ");
        valor1 = input.nextInt();

        // Ler valor2
        System.out.print("Insira o valor2: ");
        valor2 = input.nextInt();


        System.out.println("Estou a trocar as variáveis...");

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar os valores
        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);

    }

}
