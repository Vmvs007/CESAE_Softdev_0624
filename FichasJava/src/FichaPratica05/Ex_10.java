package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int numeroPesquisa, contador = 0;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.println();

        // Imprimir matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

        // Ler numero de pesquisa
        System.out.print("\nIntroduza um número para pesquisar: ");
        numeroPesquisa = input.nextInt();

        // Iterar a matriz à procura do número
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] == numeroPesquisa) {
                    contador++;
                }
            }
        }

        System.out.println("Há " + contador + " posições na matriz com o número " + numeroPesquisa);


    }
}
