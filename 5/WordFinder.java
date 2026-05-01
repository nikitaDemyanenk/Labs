import java.util.regex.*;

public class WordFinder {
    public static void main(String[] args) {
        String text = "Apple anaconda banana Application apricot cherry";
        char targetLetter = 'a';
        
        String regex = "(?i)\\b" + targetLetter + "[a-z]*\\b";
        
        try {
            if (!Character.isLetter(targetLetter)) {
                throw new IllegalArgumentException("Целевой символ должен быть буквой.");
            }
            
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            
            System.out.println("Слова, начинающиеся на букву '" + targetLetter + "':");
            boolean found = false;
            
            while (matcher.find()) {
                System.out.println(matcher.group());
                found = true;
            }
            
            if (!found) {
                System.out.println("Слов не найдено.");
            }
            
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        }
    }
}