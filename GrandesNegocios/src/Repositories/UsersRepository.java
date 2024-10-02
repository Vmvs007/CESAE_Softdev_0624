package Repositories;

import Model.User;
import Tools.CsvUsersReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {
    private ArrayList<User> usersArray;

    public UsersRepository() throws FileNotFoundException {
        this.usersArray = CsvUsersReader.readCsvFileToUsersArray("Files/login_grandesNegocios.csv");
    }

    public ArrayList<User> getUsersArray() {
        return usersArray;
    }
}
