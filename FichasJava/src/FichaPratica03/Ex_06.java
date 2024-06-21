package FichaPratica03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        // ler valores
        System.out.print("Insira inicio do intervalo: ");
        inicio = input.nextInt();

        System.out.print("Insira fim do intervalo: ");
        fim = input.nextInt();

        // Imprimir os numeros entre inicio e fim
        while (inicio<=fim){
            System.out.println(inicio);
            inicio++;
        }


    }
}
