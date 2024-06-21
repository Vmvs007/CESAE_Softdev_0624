package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, inicio=2;

        System.out.print("Insira um numero: ");
        num = input.nextInt();

        while (inicio<=num){
            System.out.println(inicio);
            inicio=inicio+2;
        }

    }
}
