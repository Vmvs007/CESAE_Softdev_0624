package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercicio 3 *****");

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, imposto;

        // Ler salario anual
        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        if (salario <= 15000) { // Taxa de 20%
            imposto = salario * 0.2;
            System.out.println("Taxa de 20%: " + imposto);
        }

        if(salario>15000 && salario<=20000){ // Taxa de 30%
            imposto = salario * 0.3;
            System.out.println("Taxa de 30%: " + imposto);
        }

        if(salario>20000 && salario <=25000){ // Taxa de 35%
            imposto = salario * 0.35;
            System.out.println("Taxa de 35%: " + imposto);
        }

        if(salario>25000){ // Taxa de 40%
            imposto = salario * 0.4;
            System.out.println("Taxa de 40%: " + imposto);
        }

    }
}
