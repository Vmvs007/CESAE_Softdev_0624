package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        System.out.print("Insira o inicio: ");
        inicio = input.nextInt();

        System.out.println("Insira o fim:");
        fim = input.nextInt();

        while (inicio <= fim) {

            if(inicio%5==0){
                System.out.println(inicio);
            }

            inicio++;
        }

    }
}
