package Ex_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;
    private String filePath;

    private Logger(String filePath) {
        this.filePath = filePath;
    }

    public static Logger getInstance(String filePath){
        if(instance==null){
            instance = new Logger(filePath);
        }
        return instance;
    }

    public void log(String logMsg) throws IOException {
        FileWriter fw = new FileWriter(new File(this.filePath),true);


        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define the format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time
        String formattedNow = now.format(formatter);

        fw.append(formattedNow+":\t"+logMsg+"\n");
        fw.flush();
    }
}
