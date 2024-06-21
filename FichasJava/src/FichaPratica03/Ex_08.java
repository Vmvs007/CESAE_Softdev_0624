package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, antecessor, sucessor;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        antecessor=num-5;
        sucessor=num+5;

        while (antecessor<=sucessor){

            if(antecessor!=num){
                System.out.println(antecessor);
            }else{
                System.out.println();
            }

            antecessor++;
        }



    }
}
