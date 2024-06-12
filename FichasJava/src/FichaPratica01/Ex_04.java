package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, area;

        // Ler raio
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        // Calcular a area
        area = 3.14 * raio * raio;

        // Apresentar a area
        System.out.println("Area: " + area + " m2");

    }
}
