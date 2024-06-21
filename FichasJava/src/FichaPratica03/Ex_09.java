package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num=0, somatorio=1, contador=-1, media;

        while(num!=-1){

            System.out.print("Insira um número: ");
            num= input.nextInt();

            somatorio=somatorio+num;
            contador++;

        }

        media=somatorio/contador;

        System.out.println("Média: "+media);

    }
}
