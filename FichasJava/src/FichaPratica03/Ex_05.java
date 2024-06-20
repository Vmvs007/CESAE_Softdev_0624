package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limite, x = 0;
        String mensagem;

        System.out.print("Insira a quantidade: ");
        limite = input.nextInt();

        System.out.print("Insira a mensagem: ");
        input.nextLine(); // Limpeza de buffer
        mensagem = input.nextLine();

        while (x < limite) {
            System.out.println(mensagem);
            x++;
        }

    }
}
