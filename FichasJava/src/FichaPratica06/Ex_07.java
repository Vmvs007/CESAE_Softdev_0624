package FichaPratica06;

import static FichaPratica06.Ex_02.lerPositivoInteiro;

public class Ex_07 {

    public static void imprimirMoldura(String caracter, int linhas, int colunas) {

        // Primeira linha
        for (int i = 0; i < colunas; i++) {
            System.out.print(caracter);
        }

        System.out.println();

        // Linhas do meio
        for (int linhaAtual = 0; linhaAtual < linhas - 2; linhaAtual++) {

            // Caracter inicial
            System.out.print(caracter);

            // Imprimir espaços do meio
            for (int colunaAtual = 0; colunaAtual < colunas - 2; colunaAtual++) {
                System.out.print(" ");
            }

            // Caracter final
            System.out.println(caracter);
        }


        // Ultima linha
        for (int i = 0; i < colunas; i++) {
            System.out.print(caracter);
        }

    }


    public static void main(String[] args) {

        imprimirMoldura("g", 4,4);

    }
}
