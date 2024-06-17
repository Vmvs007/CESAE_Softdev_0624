package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, media;

        // Ler nota1
        System.out.print("Insira a nota 1 (0-20): ");
        nota1 = input.nextDouble();

        // Ler nota2
        System.out.print("Insira a nota 2 (0-20): ");
        nota2 = input.nextDouble();

        // Ler nota3
        System.out.print("Insira a nota 3 (0-20): ");
        nota3 = input.nextDouble();

        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20 || nota3 < 0 || nota3 > 20) {
            System.out.println("Notas inválidas");
        } else {

            // Calcular a media ponderada
            media = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.4;

            // System.out.println("Média: " + media);

            // Avaliar se teve positiva
            if (media >= 9.5) { // Positiva
                System.out.println("Aprovado");
            } else { // Negativa
                System.out.println("Reprovado");
            }

        }


    }
}
