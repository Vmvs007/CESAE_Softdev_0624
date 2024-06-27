package FichaPratica04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {

            // Apresentar as opções
            System.out.println("\n**** Menu de Opções ****");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.print("Selecione a opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("**** Criar ****");
                    break;

                case 2:
                    System.out.println("**** Atualizar ****");
                    break;

                case 3:
                    System.out.println("**** Eliminar ****");
                    break;

                case 4:
                    System.out.println("**** Sair ****");
                    break;

                default:
                    System.out.println("**** Inválido ****");
                    break;
            }

        } while (opcao != 4);

    }
}
