package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler valores
        System.out.print("Insira um número: ");
        num1 = input.nextDouble();

        System.out.print("Insira um número: ");
        num2 = input.nextDouble();

        // Ler operacao aritmética
        System.out.print("Operação desejada (+ - * /): ");
        operacao = input.next();

        switch (operacao) {

            case "+": // Soma
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;

            case "-": // Subtracao
                resultado = num1 -num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;

            case "*": // Multiplicacao
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;

            case "/": // Divisao
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;

            default:
                System.out.println("Operação não reconhecida");
                break;
        }

    }
}
