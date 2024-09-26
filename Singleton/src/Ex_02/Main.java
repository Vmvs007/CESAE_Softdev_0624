package Ex_02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getInstance("appLog.txt");
        logger.log("Log 1: Variável x definida para 20");
        logger.log("Log 2: Objeto “porsche” da Classe Car criado com sucesso");

        Logger myLogger = Logger.getInstance("programa_log.txt");
        logger.log("Log 3: Objeto “mercedes” da Classe Car criado com sucesso");
        myLogger.log("Log 4: Método corrida invocado entre porsche e mercedes ");
        myLogger.log("Log 5: Vencedor da corrida é porsche");
    }
}
