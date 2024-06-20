package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, count = 0;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (count <= limite) {
            System.out.println(count);
            count++;
            //count = count + 1;
        }


    }
}
