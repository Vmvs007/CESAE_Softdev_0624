package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {

    /**
     * Método que lê um número inteiro e positivo do user
     *
     * @return Número Inteiro e Positivo
     */
    public static int lerPositivoInteiro() {

        Scanner input = new Scanner(System.in);

        int numeroLido;

        do {

            System.out.print("Introduza um número inteiro: ");
            numeroLido = input.nextInt();

        } while (numeroLido < 0);

        return numeroLido;
    }

    /**
     * Método que imprime uma linha com x asteriscos
     *
     * @param quantidadeAsteriscos Quantidade de Asteriscos a serem impressos
     */

    public static void linhaAsteriscos(int quantidadeAsteriscos) {
        for (int i = 0; i < quantidadeAsteriscos; i++) {
            System.out.print("*");
        }
        System.out.println();

    }


    public static void main(String[] args) {

        int numeroUser = lerPositivoInteiro();
        linhaAsteriscos(numeroUser);

    }


}
