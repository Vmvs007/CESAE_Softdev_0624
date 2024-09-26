package Ex_01;


public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionString;

    private DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DatabaseConnection getInstance(String connectionString){
        if(instance==null){
            instance = new DatabaseConnection(connectionString);
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database Connection Successful: " + this.connectionString);
    }

    public void disconnect() {
        System.out.println("Database Connection Turned Off: " + this.connectionString);
    }
}
