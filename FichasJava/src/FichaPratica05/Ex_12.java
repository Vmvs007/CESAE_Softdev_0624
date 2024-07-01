package FichaPratica05;

import java.util.Random;
import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        Random rd = new Random();
        int aleatorio = rd.nextInt();
        int numeroRandom = rd.nextInt(1000);
        int numeroAleatorio = rd.nextInt(500,1000);

        // Declarar variáveis
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];

        // Ler vetor1
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira no Vetor1[" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        // Ler vetor2
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira no Vetor2[" + i + "]: ");
            vetor2[i] = input.nextInt();
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            matriz[linha][0] = vetor1[linha];
            matriz[linha][1] = vetor2[linha];
        }

        // Imprimir matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

    }
}
