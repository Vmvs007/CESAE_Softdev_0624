package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] comissoes = new double[12];
        double total = 0;

        // Ler comissões
        for (int i = 0; i < comissoes.length; i++) {
            System.out.print("Insira comissão[" + i + "]: ");
            comissoes[i] = input.nextDouble();
        }

        // Calcular o total
        for (int i = 0; i < comissoes.length; i++) {
            total = total + comissoes[i];
        }

        System.out.println("Total de Comissões: " + total);


    }
}
