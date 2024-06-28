package FichaPratica05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();

        }

        System.out.println("\n___________________________________________\n");

        // Imprimir vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }


    }
}
