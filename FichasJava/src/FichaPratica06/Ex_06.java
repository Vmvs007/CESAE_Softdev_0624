package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_05.*;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanhoVetor, opcao;

        System.out.print("Insira o tamanho do vetor: ");
        tamanhoVetor = input.nextInt();

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        do {
            System.out.println("\n\n***** Análise de um Vetor *****");
            System.out.println("1. Maior Elemento");
            System.out.println("2. Menor Elemento");
            System.out.println("3. Crescente ou Não Crescente");
            System.out.println("4. Sair");

            System.out.println("Selecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Maior Elemento

                    int maior = maiorValorArray(vetor);
                    System.out.println("Maior Elemento: " + maior);

                    break;

                case 2: // Menor Elemento

                    System.out.println("Menor Elemento: " + menorValorArray(vetor));

                    break;

                case 3: // Crescente ou não crescente

                    if (arrayCrescente(vetor)) {
                        System.out.println("Crescente");
                    } else {
                        System.out.println("Não crescente");
                    }

                    break;

                case 4:
                    System.out.println("Obrigado, até à próxima!");
                    break;

                default:
                    System.out.println("Obrigado por fazer asneiras!");
                    break;
            }


        } while (opcao != 4);
    }
}
