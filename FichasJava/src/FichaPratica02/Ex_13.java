package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int horas, minutos;

        // Ler valores
        System.out.print("Insira as horas:");
        horas = input.nextInt();

        System.out.print("Insira os minutos: ");
        minutos = input.nextInt();

        if(horas>=12){ // Tarde

            if(horas!=12){
                horas= horas-12;
            }

            System.out.println(horas+":"+minutos+"PM");

        }else{ // Manhã
            System.out.println(horas+":"+minutos+"AM");
        }
    }
}
