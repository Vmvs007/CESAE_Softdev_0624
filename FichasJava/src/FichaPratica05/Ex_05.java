package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[5];
        double somatorio = 0, media=0;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextDouble();
        }

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            somatorio = somatorio + vetor[i];
        }

        media = somatorio / vetor.length;
        System.out.println("Média: " + media);


    }
}
