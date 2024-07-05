package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {


    /**
     * Método que imprime o conteudo de um ficheiro na consola
     * @param path Caminho para o ficheir
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNext()){
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        // imprimirFicheiro("FicheirosFicha07/exercicio_01.txt");
        // imprimirFicheiro("FicheirosFicha07/exercicio_01_Alternativa01.txt");
        imprimirFicheiro("FicheirosFicha07/exercicio_01_Alternativa02.txt");

    }
}
