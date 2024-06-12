package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int segundosTotais, horas, minutos, segundos;

        // Ler minutos musica 1
        System.out.print("Insira os minutos da música 1: ");
        segundosTotais = (input.nextInt()) * 60;

        // Ler segundos da musica 1
        System.out.print("Insira os segundos da música 1: ");
        segundosTotais = segundosTotais + input.nextInt();

        // Ler minutos musica 2
        System.out.print("Insira os minutos da música 2: ");
        segundosTotais = segundosTotais + (input.nextInt()) * 60;

        // Ler segundos da musica 2
        System.out.print("Insira os segundos da música 2: ");
        segundosTotais = segundosTotais + input.nextInt();

        // Ler minutos musica 3
        System.out.print("Insira os minutos da música 3: ");
        segundosTotais = segundosTotais + (input.nextInt()) * 60;

        // Ler segundos da musica 3
        System.out.print("Insira os segundos da música 3: ");
        segundosTotais = segundosTotais + input.nextInt();

        // Ler minutos musica 4
        System.out.print("Insira os minutos da música 4: ");
        segundosTotais = segundosTotais + (input.nextInt()) * 60;

        // Ler segundos da musica 4
        System.out.print("Insira os segundos da música 4: ");
        segundosTotais = segundosTotais + input.nextInt();

        // Ler minutos musica 5
        System.out.print("Insira os minutos da música 5: ");
        segundosTotais = segundosTotais + (input.nextInt()) * 60;

        // Ler segundos da musica 5
        System.out.print("Insira os segundos da música 5: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.println("Segundos Totais do Album: " + segundosTotais);

        // 1h 4m 32s
        horas = segundosTotais/3600;
        minutos = (segundosTotais/60)-(horas*60);
        segundos = segundosTotais - (horas*3600) - (minutos*60);

        System.out.println("O Álbum tem: "+horas+"h "+minutos+"m "+ segundos+"s");


    }

}
