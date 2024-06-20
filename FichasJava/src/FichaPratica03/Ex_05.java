package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidade;
        String mensagem;

        System.out.print("Insira a quantidade: ");
        quantidade = input.nextInt();

        System.out.print("Insira a mensagem: ");
        input.nextLine(); // Limpeza de buffer
        mensagem = input.nextLine();

        System.out.println("Quantidade: " + quantidade);
        System.out.println("Mensagem: " + mensagem);

    }
}
