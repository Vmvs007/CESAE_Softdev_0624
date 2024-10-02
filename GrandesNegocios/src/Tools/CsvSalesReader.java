package Tools;

import Model.Sale;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvSalesReader {

    public static ArrayList<Sale> readCsvFileToSalesArray(String filePath) throws FileNotFoundException {

        // Instanciar o ArrayList de Vendas
        ArrayList<Sale> salesArray = new ArrayList<>();

        // Abrir o ficheiro e criar o Scanner
        File salesFiles = new File(filePath);
        Scanner salesScanner = new Scanner(salesFiles);

        // Avançar o cabeçalho à frente
        salesScanner.nextLine();

        // Ciclo vai correr para cada linha (venda) do ficheiro
        while (salesScanner.hasNextLine()) {
            // Capturar a linha atual
            String linhaAtual = salesScanner.nextLine();

            // Dividir a linha atual para um array de Strings
            String[] linhaDividida = linhaAtual.split(",");

            // Criar variáveis locais para cada parâmetro de uma venda
            String productType = linhaDividida[0];
            String productName = linhaDividida[1];
            double quantity = Double.parseDouble(linhaDividida[2]);
            double price = Double.parseDouble(linhaDividida[3]);

            // Criamos a venda atual
            Sale saleAtual = new Sale(productType, productName, quantity, price);

            // Adicionamos a venda atual ao ArrayList
            salesArray.add(saleAtual);
        }

        // Depois de terminar o ciclo, e termos o ArrayList com todas a vendas, retornamos o mesmo
        return salesArray;
    }
}
