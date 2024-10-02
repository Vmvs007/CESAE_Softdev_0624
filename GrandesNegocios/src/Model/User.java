package Model;

public class User {
    private String loginType;
    private String username;
    private String password;

    public User(String loginType, String username, String password) {
        this.loginType = loginType;
        this.username = username;
        this.password = password;
    }

    public String getLoginType() {
        return loginType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
