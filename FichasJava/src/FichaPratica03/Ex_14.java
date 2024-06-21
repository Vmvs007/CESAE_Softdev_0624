package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int quantidade, count = 1, numAnterior, numAtual;
        boolean crescente = true;

        System.out.print("Quantos números deseja inserir: ");
        quantidade = input.nextInt();

        System.out.print("Insira um número: ");
        numAnterior = input.nextInt();

        while (count < quantidade) {
            System.out.print("Insira um número: ");
            numAtual = input.nextInt();

            if (numAnterior >= numAtual) { // Deixou de ser crescente
                crescente = false;
            }

            numAnterior = numAtual;

            count++;
        }
        
        if(crescente){ // crescente == true
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }

    }
}
