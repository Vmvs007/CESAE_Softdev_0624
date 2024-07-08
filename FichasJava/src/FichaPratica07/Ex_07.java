package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {

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
