package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num=0, count0_25=0, count26_50=0, count51_75=0, count76_100=0;

        while (num >= 0) {
            System.out.print("Insira um numero: ");
            num = input.nextInt();

            if(num>=0 && num <=25){
                count0_25++;
            }

            if(num>=26 && num <=50){
                count26_50++;
            }

            if(num>=51 && num <= 75){
                count51_75++;
            }

            if(num>=76 && num <=100){
                count76_100++;
            }


        }

        System.out.println("[00,25]: "+count0_25);
        System.out.println("[26,50]: "+count26_50);
        System.out.println("[51,75]: "+count51_75);
        System.out.println("[76,100]: "+count76_100);


    }
}
