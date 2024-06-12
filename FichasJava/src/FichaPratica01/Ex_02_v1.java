package FichaPratica01;

import java.util.Scanner;

public class Ex_02_v1 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;

        // Ler num1
        System.out.print("Introduza um numero: ");
        num1 = input.nextDouble();

        // Ler num2
        System.out.print("Introduza outro numero: ");
        num2 = input.nextDouble();


        // Calcular a soma
        resultado = num1 + num2;

        // Apresentar a soma
        System.out.println("Soma: " + resultado);


        // Calcular a subtracao
        resultado = num1 - num2;

        // Apresentar a subtracao
        System.out.println("Subtracao: " + resultado);


        // Calcular a multiplicacao
        resultado = num1 * num2;

        // Apresentar a multiplicacao
        System.out.println("Multiplicacao: " + resultado);


        // Calcular a divisao
        resultado = num1 / num2;

        // Apresentar a divisao
        System.out.println("Divisao: " + resultado);

    }
}
