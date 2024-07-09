package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex_01.imprimirFicheiro;
import static FichaPratica07.Ex_07.contarLinhasFicheiro;

public class Ex_09 {

    /**
     * Método que lê um ficheiro .csv para uma matriz
     *
     * @param path Caminho para o ficheiro
     * @return Matriz de Strings com o conteudo do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
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

    /**
     * Método que apresenta o copyright
     */
    public static void copyright() {
        System.out.println("\uD83D\uDCBB\uD83D\uDCBB\uD83D\uDCBB Desenvolvido por: Vitor Santos \uD83D\uDCBB\uD83D\uDCBB\uD83D\uDCBB");
    }

    public static void imprimirMusicasGenero(String genero, String[][] matrizCompleta) throws FileNotFoundException {
        System.out.println("***** Músicas de " + genero + " *****");
        for (int linha = 0; linha < matrizCompleta.length; linha++) {
            if (matrizCompleta[linha][2].equalsIgnoreCase(genero)) {
                System.out.print("Nome da Música: " + matrizCompleta[linha][0]);
                System.out.print("\t| Artista: " + matrizCompleta[linha][1]);
                System.out.print("\t| Duração: " + matrizCompleta[linha][3] + "\n");
            }
        }
    }

    public static void imprimirMusicasArtista(String artista, String[][] matrizCompleta) throws FileNotFoundException {
        System.out.println("***** Músicas de " + artista + " *****");
        for (int linha = 0; linha < matrizCompleta.length; linha++) {
            if (matrizCompleta[linha][1].equalsIgnoreCase(artista)) {
                System.out.print("Nome da Música: " + matrizCompleta[linha][0]);
                System.out.print("\t| Género: " + matrizCompleta[linha][2]);
                System.out.print("\t| Duração: " + matrizCompleta[linha][3] + "\n");
            }
        }
    }

    public static void musicaMaisLonga(String[][] matrizCompleta) {

        String artistaMaisLongo = "", musicaMaisLonga = "", generoMaisLongo = "";
        int minutosMusicaMaisLonga = 0, segundosMusicaMaisLonga = 0;

        for (int linha = 0; linha < matrizCompleta.length; linha++) {

            String[] duracaoDividida = matrizCompleta[linha][3].split(":");

            int minutosAtuais = Integer.parseInt(duracaoDividida[0]);
            int segundosAtuais = Integer.parseInt(duracaoDividida[1]);

            if (minutosAtuais > minutosMusicaMaisLonga) { // Estamos perante a musica maior
                musicaMaisLonga = matrizCompleta[linha][0];
                artistaMaisLongo = matrizCompleta[linha][1];
                generoMaisLongo = matrizCompleta[linha][2];
                minutosMusicaMaisLonga = minutosAtuais;
                segundosMusicaMaisLonga = segundosAtuais;
            }

            if (minutosAtuais == minutosMusicaMaisLonga) {
                if (segundosAtuais >= segundosMusicaMaisLonga) { // Estamos perante a musica maior
                    musicaMaisLonga = matrizCompleta[linha][0];
                    artistaMaisLongo = matrizCompleta[linha][1];
                    generoMaisLongo = matrizCompleta[linha][2];
                    minutosMusicaMaisLonga = minutosAtuais;
                    segundosMusicaMaisLonga = segundosAtuais;
                }
            }


        }

        System.out.println("***** Música Mais Longa *****");
        System.out.println("Nome da Música: " + musicaMaisLonga);
        System.out.println("Artista: " + artistaMaisLongo);
        System.out.println("Género: " + generoMaisLongo);
        System.out.println("Duração: " + minutosMusicaMaisLonga + "m " + segundosMusicaMaisLonga + "s");
    }

    public static void musicasAcimaDeDuracao(String[][] matrizCompleta, int minutosPretendidos, int segundosPretendidos) {
        for (int linha = 0; linha < matrizCompleta.length; linha++) {

            String[] duracaoDividida = matrizCompleta[linha][3].split(":");

            int minutosAtuais = Integer.parseInt(duracaoDividida[0]);
            int segundosAtuais = Integer.parseInt(duracaoDividida[1]);

            if (minutosAtuais > minutosPretendidos) { // Estamos perante a musica maior
                // Imprimir a musica
                System.out.print("Nome da Música: " + matrizCompleta[linha][0]);
                System.out.print("\t| Artista: " + matrizCompleta[linha][1]);
                System.out.print("\t| Género: " + matrizCompleta[linha][2]);
                System.out.print("\t| Duração: " + matrizCompleta[linha][3] + "\n");
            }

            if (minutosAtuais == minutosPretendidos) {
                if (segundosAtuais >= segundosPretendidos) { // Estamos perante a musica maior
                    // Imprimir a musica
                    System.out.print("Nome da Música: " + matrizCompleta[linha][0]);
                    System.out.print("\t| Artista: " + matrizCompleta[linha][1]);
                    System.out.print("\t| Género: " + matrizCompleta[linha][2]);
                    System.out.print("\t| Duração: " + matrizCompleta[linha][3] + "\n");
                }
            }

        }
    }


    public static void menu() throws FileNotFoundException {
        imprimirFicheiro("FicheirosFicha07/ASCII_Musica");

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        String[][] matrizCompleta = lerCsvParaMatriz("FicheirosFicha07/exercicio_09.csv");

        do {
            imprimirFicheiro("FicheirosFicha07/ASCII_Menu_Musicas");
            System.out.println("1. Pesquisar por músicas de um determinado género.");
            System.out.println("2. Pesquisar músicas de um determinado artista.");
            System.out.println("3. Pesquisar música com maior duração.");
            System.out.println("4. Pesquisar músicas com duração acima de um valor especificado.");
            System.out.println("5. Número de músicas no ficheiro.");
            System.out.println("6. Sair");
            System.out.print("\nSelecione a sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Pesquisar por músicas de um determinado género
                    imprimirFicheiro("FicheirosFicha07/ASCII_Menu_MusicasGenero");
                    System.out.print("Qual o género a pesquisar: ");
                    input.nextLine(); // Limpeza de buffer
                    String generoEscolhido = input.nextLine();
                    imprimirMusicasGenero(generoEscolhido, matrizCompleta);

                    break;

                case 2: // Pesquisar músicas de um determinado artista
                    System.out.println("***** Pesquisar por músicas de um determinado artista *****");
                    System.out.print("Qual o artista a pesquisar: ");
                    input.nextLine(); // Limpeza de buffer
                    String artistaEscolhido = input.nextLine();
                    imprimirMusicasArtista(artistaEscolhido, matrizCompleta);

                    break;

                case 3:  // Pesquisar música com maior duração
                    musicaMaisLonga(matrizCompleta);
                    break;

                case 4:  // Pesquisar músicas com duração acima de um valor especificado
                    System.out.println("***** Pesquisar músicas com duração acima de um valor especificado *****");

                    System.out.print("Minutos: ");
                    int minutos = input.nextInt();

                    System.out.print("Segundos: ");
                    int segundos = input.nextInt();

                    musicasAcimaDeDuracao(matrizCompleta, minutos, segundos);
                    break;

                case 5:  // Número de músicas no ficheiro
                    System.out.println("***** Numero de Músicas no Ficheiro *****");
                    System.out.println(matrizCompleta.length);
                    break;

                case 6:  // Sair
                    System.out.println("Obrigado!!!");
                    break;

                default:
                    System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");
                    break;

            }


        } while (opcao != 6);
    }

    public static void main(String[] args) throws FileNotFoundException {
        menu();
        copyright();

    }


}
