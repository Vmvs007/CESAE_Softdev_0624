package FichaPratica04;

import java.util.Scanner;

public class Ex_02_Feio {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numSecreto, palpite = -1, contadorTentativas;

        // Ler numSecreto
        System.out.print("Jogador 1 - Introduza um número ( 0 - 100 ): ");
        numSecreto = input.nextInt();

        // Ciclo para imprimir 20 enters
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        for (contadorTentativas = 0; contadorTentativas < 5 && palpite != numSecreto; contadorTentativas++) {

            // Jogador 2 tenta acertar
            System.out.print("Jogador 2 - Tente adivinhar: ");
            palpite = input.nextInt();

            if (palpite > numSecreto) {
                System.out.println("Errado, o seu palpite é superior");
            }

            if (palpite < numSecreto) {
                System.out.println("Errado, o seu palpite é inferior");
            }
        }

        if(palpite==numSecreto){
            System.out.println("Acertou! Foram precisas " + contadorTentativas + " tentativas");
        }else{
            System.out.println("Esgotou as tentativas... Perdeu D:");
        }


    }
}
