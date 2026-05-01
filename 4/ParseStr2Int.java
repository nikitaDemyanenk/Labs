public class ParseStr2Int {
    public static void main(String[] args) {
        String input = "123456645"; 

        try {
            int result = parseString(input);
            System.out.println("Результат: " + result);
        } catch (CustomNumberFormatException e) {
            System.out.println("Произошла ошибка!" + e.getMessage());
            
            ExceptionLogger.logException(e);
        }
    }

    public static int parseString(String str) throws CustomNumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException(" Входная строка '" + str + "' не является числом.");
        }
    }
}