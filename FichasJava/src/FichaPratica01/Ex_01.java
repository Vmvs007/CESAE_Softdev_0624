package FichaPratica01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Import de Scanner - sempre que queremos ler dados do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, soma;

        // Ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        // Calcular a soma
        soma = num1+num2;

        // Apresentar a soma
        System.out.println("Soma: "+soma);
    }
}
