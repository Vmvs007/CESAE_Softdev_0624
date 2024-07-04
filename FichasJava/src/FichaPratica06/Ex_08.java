package FichaPratica06;

import java.util.Scanner;

public class Ex_08 {

    /**
     * Método que imprime uma matriz resultante da soma das duas matrizes enviadas por parâmetro
     * @param matriz1 Matriz 1
     * @param matriz2 Matriz 2
     */
    public static void somarMatrizes(int[][] matriz1, int[][] matriz2) {

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print(matriz1[linha][coluna] + matriz2[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

    }

    /**
     * Método que retorna o somatório de todos os elementos das duas matrizes
     * @param matriz1 Matriz 1
     * @param matriz2 Matriz 2
     * @return Somatório dos elementos das matrizes
     */
    public static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {
        int somatorio = 0;

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                somatorio = somatorio + matriz1[linha][coluna];
                somatorio = somatorio + matriz2[linha][coluna];
            }
        }

        return somatorio;
    }


    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        // Ler matriz 1
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print("Insira na matriz1[" + linha + "][" + coluna + "]: ");
                matriz1[linha][coluna] = input.nextInt();
            }
        }

        // Ler matriz 2
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {
                System.out.print("Insira na matriz2[" + linha + "][" + coluna + "]: ");
                matriz2[linha][coluna] = input.nextInt();
            }
        }

        System.out.println("__________________________________________________________");
        somarMatrizes(matriz1,matriz2);
        System.out.println("__________________________________________________________");

        System.out.println("Somatório: "+somatorioMatrizes(matriz1,matriz2));


    }
}
