package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, soma, subtracao, multiplicacao, divisao;

        // Ler num1
        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();

        // Calcular a soma
        soma = num1 + num2;

        // Calcular a subtracao
        subtracao = num1 - num2;

        // Calcular a multiplicacao
        multiplicacao = num1 * num2;

        // Calcular a divisao
        divisao = num1 / num2;

        // Apresentar a soma
        System.out.println("Soma: " + soma);

        // Apresentar a subtracao
        System.out.println("Subtracao: " + subtracao);

        // Apresentar a multiplicacao
        System.out.println("Multiplicacao: " + multiplicacao);

        // Apresentar a divisao
        System.out.println("Divisao: " + divisao);

    }
}
