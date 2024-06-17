package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, movimento, saldoAposMovimento;

        // Ler saldo
        System.out.print("Insira o saldo: ");
        saldo = input.nextDouble();

        // Ler movimento
        System.out.print("Valor a movimentar: ");
        movimento = input.nextDouble();

        // Calcular o saldo apos o movimento
        saldoAposMovimento = saldo + movimento;

        // Avaliar se o movimento é valido
        if (saldoAposMovimento >= 0) { // Movimento válido

            // Atualizar o saldo
            saldo = saldoAposMovimento;

        } else { // Movimento inválido

            System.out.println("Operação Inválida! Saldo insuficiente.");
        }

        System.out.println("Saldo Atual: " + saldo);

    }
}
