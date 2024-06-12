package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double preco1, preco2, preco3, precoTotal, precoComDesconto;

        // Ler preco1
        System.out.print("Insira o preço1: ");
        preco1 = input.nextDouble();

        // Ler preco2
        System.out.print("Insira o preço2: ");
        preco2 = input.nextDouble();

        // Ler preco3
        System.out.print("Insira o preço3: ");
        preco3 = input.nextDouble();

        // Calcular o preço total
        precoTotal = preco1 + preco2 + preco3;

        // Aplicar 10% de desconto
        precoComDesconto = precoTotal * 0.9;

        // Apresento o preço com desconto
        System.out.println("Preço Total: " + precoTotal);
        System.out.println("Preço c/ 10% de Desconto: " + precoComDesconto);

    }

}
