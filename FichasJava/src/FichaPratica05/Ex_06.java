package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        boolean crescente = true;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 1; i < vetor.length; i++) {
            if(vetor[i]<= vetor[i-1]){
                crescente=false;
            }
        }

        if(crescente){
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }

    }
}
