import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionLogger {
    private static final String LOG_FILE = "exception_log.txt";

    public static void logException(Exception e) {
        String timestamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());

        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            pw.println("Дата/Время: " + timestamp);
            pw.println("Тип исключения: " + e.getClass().getSimpleName()); 
            pw.println("Сообщение: " + e.getMessage());
            
            pw.println("                                    \n");
            
        } catch (IOException ioException) {
            System.err.println("Ошибка: Не удалось записать в файл!");
            ioException.printStackTrace();
        }
    }
}