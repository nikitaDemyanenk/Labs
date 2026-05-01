import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        String[] passwords = {"weakpass", "Valid1Pass", "NoDigitHere", "short1A", "TooLongPasswordWithDigit1"};
        
        String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
        
        try {
            Pattern pattern = Pattern.compile(regex);
            
            for (String password : passwords) {
                Matcher matcher = pattern.matcher(password);
                boolean isValid = matcher.matches();
                System.out.println("Пароль " + password +  " " + isValid);
            }
        } catch (PatternSyntaxException e) {
            System.err.println("Ошибка компиляции шаблона: " + e.getDescription());
        }
    }
}