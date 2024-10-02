package Tools;

import Model.Sale;
import Model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvUsersReader {

    public static ArrayList<User> readCsvFileToUsersArray(String filePath) throws FileNotFoundException {

        // Instanciar o ArrayList de Utilizadores
        ArrayList<User> usersArray = new ArrayList<>();

        // Abrir o ficheiro e criar o Scanner
        File usersFile = new File(filePath);
        Scanner usersScanner = new Scanner(usersFile);

        // Avançar o cabeçalho à frente
        usersScanner.nextLine();

        // Ciclo vai correr para cada linha (utilizador) do ficheiro
        while (usersScanner.hasNextLine()) {
            // Capturar a linha atual
            String linhaAtual = usersScanner.nextLine();

            // Dividir a linha atual para um array de Strings
            String[] linhaDividida = linhaAtual.split(";");

            // Criar variáveis locais para cada parâmetro de um utilizador
            String loginType = linhaDividida[0];
            String username = linhaDividida[1];
            String password = linhaDividida[2];

            // Criamos o utilizador atual
            User userAtual = new User(loginType,username,password);

            // Adicionamos o utilizador atual ao ArrayList
            usersArray.add(userAtual);
        }

        // Depois de terminar o ciclo, e termos o ArrayList com todos os utilizador, retornamos o mesmo
        return usersArray;
    }
}
