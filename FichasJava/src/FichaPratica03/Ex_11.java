package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio=0,salto, fim;

        // ler valores
        System.out.print("Insira fim do intervalo: ");
        fim = input.nextInt();

        System.out.print("Insira o salto: ");
        salto= input.nextInt();

        // Imprimir os numeros entre inicio e fim
        while (inicio<=fim){
            System.out.println(inicio);
            inicio=inicio+salto;
        }

    }
}
