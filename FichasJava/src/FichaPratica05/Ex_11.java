package FichaPratica05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int menor, maior;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Imprimir matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        // Encontrar o maior e o menor
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }

                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
            }
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);


    }
}
