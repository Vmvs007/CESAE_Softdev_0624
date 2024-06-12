package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, num3, mediaAritmetica, somatorio, mediaPonderada;

        // Ler num1
        System.out.print("Insira o num1: ");
        num1 = input.nextDouble();

        // Ler num2
        System.out.print("Insira o num2: ");
        num2 = input.nextDouble();

        // Ler num3
        System.out.print("Insira o num3: ");
        num3 = input.nextDouble();

        // Calcular o somatorio
        somatorio = num1 + num2 + num3;

        // Dividir o somatorio por 3 (calcular a media)
        mediaAritmetica = somatorio / 3;

        // Apresentar a media aritmetica
        System.out.println("Média Aritmética: " + mediaAritmetica);

        // Calcular a media ponderada
        mediaPonderada = (num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5);

        // Apresentar a media ponderada
        System.out.println("Média Ponderada: " + mediaPonderada);

    }
}
