package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor, notas;

        // Ler valor
        System.out.print("Introduza o valor: ");
        valor = input.nextInt();

        if (valor % 5 == 0) {

            // Notas de 200
            notas = valor / 200;
            System.out.println("Notas de 200€: " + notas);

            // Atualizar o valor
            valor = valor % 200;

            // Notas de 100
            notas = valor / 100;
            System.out.println("Notas de 100€: " + notas);

            // Atualizar o valor
            valor = valor % 100;

            // Notas de 50
            notas = valor / 50;
            System.out.println("Notas de 50€: " + notas);

            // Atualizar o valor
            valor = valor % 50;

            // Notas de 20
            notas = valor / 20;
            System.out.println("Notas de 20€: " + notas);

            // Atualizar o valor
            valor = valor % 20;

            // Notas de 10
            notas = valor / 10;
            System.out.println("Notas de 10€: " + notas);

            // Atualizar o valor
            valor = valor % 10;

            // Notas de 5
            notas = valor / 5;
            System.out.println("Notas de 5€: " + notas);

        } else {
            System.out.println("Valor Inválido!");
        }


    }
}
