package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FuncoesFicheiros {


    /**
     * Método que imprime o conteudo de um ficheiro na consola
     * @param path Caminho para o ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNext()){
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }
    }

    public static int contarLinhasFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        int numeroLinhas = 0;

        while (scannerFicheiro.hasNextLine()){
            numeroLinhas++;
            scannerFicheiro.nextLine();
        }

        return numeroLinhas;
    }


    public static int contarPalavrasFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        int numeroPalavras=0;

        while (scannerFicheiro.hasNext()){
            numeroPalavras++;
            scannerFicheiro.next();
        }

        return numeroPalavras;
    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Numero Linhas: "+contarLinhasFicheiro("FicheirosFicha07/exercicio_07.txt"));
        System.out.println("Numero Palavras: "+contarPalavrasFicheiro("FicheirosFicha07/exercicio_07.txt"));
    }

}
