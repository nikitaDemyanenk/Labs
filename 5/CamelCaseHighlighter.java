import java.util.regex.*;

public class CamelCaseHighlighter {
    public static void main(String[] args) {
        String text = "helloWorld, thisIs a testString for regexEngine.";
        
        try {
            Pattern pattern = Pattern.compile("([a-z])([A-Z])");
            Matcher matcher = pattern.matcher(text);
            
            String result = matcher.replaceAll("!$1$2!");
            
            System.out.println("Исходный текст: " + text);
            System.out.println("Результат:      " + result);
        } catch (Exception e) {
            System.err.println("Ошибка обработки текста: " + e.getMessage());
        }
    }
}