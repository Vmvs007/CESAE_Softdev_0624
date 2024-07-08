package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex_07.contarLinhasFicheiro;

public class Ex_09 {

    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException {

        String[][] matrizCompleta = new String[contarLinhasFicheiro(path) - 1][4];

        Scanner scannerFicheiro = new Scanner(new File(path));

        String linha = scannerFicheiro.nextLine();

        int contadorLinhaMatriz = 0;

        while (scannerFicheiro.hasNextLine()) {
            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(",");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }

            contadorLinhaMatriz++;

        }

        return matrizCompleta;
    }


    public static void imprimirMusicasGenero(String genero, String[][] matrizCompleta) throws FileNotFoundException {
    }

    public static void imprimirMusicasArtista(String artista, String[][] matrizCompleta) throws FileNotFoundException {
    }

    
    public static void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        String[][] matrizCompleta = lerCsvParaMatriz("FicheirosFicha07/exercicio_09.csv");

        do {
            System.out.println("\n***** Programa das Músicas *****");
            System.out.println("1. Pesquisar por músicas de um determinado género.");
            System.out.println("2. Pesquisar músicas de um determinado artista.");
            System.out.println("3. Pesquisar música com maior duração.");
            System.out.println("4. Pesquisar músicas com duração acima de um valor especificado.");
            System.out.println("5. Número de músicas no ficheiro.");
            System.out.println("6. Sair");
            System.out.println("\nSelecione a sua opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1: // Pesquisar por músicas de um determinado género
                    break;

                case 2: // Pesquisar músicas de um determinado artista
                    break;

                case 3:  // Pesquisar música com maior duração
                    break;

                case 4:  // Pesquisar músicas com duração acima de um valor especificado
                    break;

                case 5:  // Número de músicas no ficheiro
                    break;

                case 6:  // Sair
                    break;

                default:
                    System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");
                    break;

            }


        } while (opcao != 6);
    }

    public static void main(String[] args) throws FileNotFoundException {
        menu();
    }


}
