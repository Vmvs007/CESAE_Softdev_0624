package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int comprimento, largura, area, perimetro;

        // Ler comprimento
        System.out.print("Insira o comprimento do retangulo: ");
        comprimento = input.nextInt();

        // Ler largura
        System.out.print("Insira a largura do retangulo: ");
        largura = input.nextInt();

        // Calcular o perimetro
        perimetro = comprimento + comprimento + largura + largura;

        // Calcular a area
        area = comprimento * largura;

        // Apresentar o perimetro
        System.out.println("Perimetro: " + perimetro);

        // Apresentar a area
        System.out.println("Area: " + area);

    }
}
