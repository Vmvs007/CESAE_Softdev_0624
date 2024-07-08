package FichaPratica07;

import java.io.*;

public class Ex_02 {

    public static void criarFicheiroTextoPrintWriter(String path, String mensagem) throws FileNotFoundException {

        PrintWriter maquinaEscrever = new PrintWriter(new File(path));

        maquinaEscrever.println(mensagem);

        maquinaEscrever.close();

    }

    public static void criarFicheiroTextoFileWriter(String path, String mensagem) throws IOException {

        FileWriter maquinaEscrever = new FileWriter(new File(path),true);

        maquinaEscrever.append("\n"+mensagem);

        maquinaEscrever.close();

    }

    public static void main(String[] args) throws IOException {

        criarFicheiroTextoFileWriter("FicheirosFicha07/exercicio_02.txt","Olá! Está tudo bem :D");
        criarFicheiroTextoFileWriter("FicheirosFicha07/exercicio_02.txt","Vitor :D");

        // criarFicheiroTexto("FicheirosFicha07/teste.txt","Olá! Está tudo bem :D");

    }
}
