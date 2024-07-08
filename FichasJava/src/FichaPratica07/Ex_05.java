package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {

    public static int somarNumerosFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        int soma = 0;

        while (scannerFicheiro.hasNextInt()){
            soma+=scannerFicheiro.nextInt();
        }

        return soma;


    }


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Soma do Ficheiro: "+ somarNumerosFicheiro("FicheirosFicha07/exercicio_05_31.txt"));

    }
}
