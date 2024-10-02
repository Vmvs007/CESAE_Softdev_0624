package Controllers;

import Model.User;
import Repositories.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {

    private UsersRepository usersRepository;

    public LoginController() throws FileNotFoundException {
        this.usersRepository= new UsersRepository();
    }

    /**
     * Método que valida o Login
     * @param usernameInput
     * @param passwordInput
     * @return 0 - Inválido | 1 - ADMIN | 2 - FUNCIONARIO
     */
    public int validateLogin(String usernameInput, String passwordInput){

        for(User userAtual : usersRepository.getUsersArray()){
            if(usernameInput.equals(userAtual.getUsername()) && passwordInput.equals(userAtual.getPassword())){

                if(userAtual.getLoginType().equals("ADMIN")){
                    return 1;
                }

                if(userAtual.getLoginType().equals("FUNC")){
                    return 2;
                }

            }
        }

        return 0;

    }
}
