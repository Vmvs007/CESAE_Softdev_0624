package FichaPratica07;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {

    public static double valorTotalVendido(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        double totalVendido = 0;

        String linha = scannerFicheiro.nextLine();

        while (scannerFicheiro.hasNextLine()) {

            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(",");

            totalVendido += Double.parseDouble(linhaDividida[2]) * Double.parseDouble(linhaDividida[3]);

        }

        return totalVendido;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Total Vendido: " + valorTotalVendido("FicheirosFicha07/exercicio_08.csv") + " €");
    }
}
