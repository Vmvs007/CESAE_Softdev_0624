package Views;

import Controllers.AdminController;
import Model.Sale;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminView {

    private AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void menu() {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {
            System.out.println("\n\n******** Menu Administrador *********");
            System.out.println("1. Produto Mais Vendido - Unidades");
            System.out.println("2. Produto Mais Vendido - Valor");
            System.out.println("3. Venda Mais Unidades");
            System.out.println("4. Venda Mais Valor");
            System.out.println("5. Total Vendas");
            System.out.println("6. Média Vendas");
            System.out.println("7. Sair");

            System.out.print("Insira a opção: ");
            opcao = input.nextInt();

            System.out.println("__________________________________________________");
            switch (opcao) {
                case 1: // Produto Mais Vendido - Unidades
                    break;
                case 2: // Produto Mais Vendido - Valor
                    break;
                case 3: // Venda Mais Unidades
                    break;
                case 4: // Venda Mais Valor
                    break;
                case 5: // Total Vendas
                    this.totalSales();
                    break;
                case 6: // Média Vendas
                    this.averageSales();
                    break;
                case 7: // Sair
                    break;
                default:
            }
            System.out.println("__________________________________________________");
        } while (opcao != 7);

    }

    private void totalSales() {
        System.out.println("Total Vendas: " + adminController.totalSales()+" €");
    }

    private void averageSales() {
        System.out.println("Média Vendas: " + adminController.averageSales()+" €");
    }

}
