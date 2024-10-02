package Views;

import Controllers.StaffController;

import java.util.Scanner;

public class StaffView {
    private StaffController staffController;

    public StaffView() {
        this.staffController = new StaffController();
    }

    public void menu() {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {
            System.out.println("\n\n******** Menu Funcionário *********");
            System.out.println("1. Adicionar Nova Venda");
            System.out.println("2. Consultar Stock Produto");
            System.out.println("3. Sair");

            System.out.print("Insira a opção: ");
            opcao = input.nextInt();

            System.out.println("__________________________________________________");
            switch (opcao) {
                case 1: // Adicionar Nova Venda
                    break;
                case 2: // Consultar Stock Produto
                    break;
                case 3: // sair
                    break;

                default:
            }
            System.out.println("__________________________________________________");
        } while (opcao != 3);

    }
}
