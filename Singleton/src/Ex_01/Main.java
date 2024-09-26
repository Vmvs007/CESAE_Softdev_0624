package Ex_01;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DatabaseConnection dbConnection = DatabaseConnection.getInstance("mySQL:8000");

        dbConnection.connect();

        sleep(3000);

        dbConnection.disconnect();

        // ___________________________________
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance("mySQL:3600");

        dbConnection2.connect();

        sleep(3000);

        dbConnection2.disconnect();


    }
}
