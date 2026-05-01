import java.util.regex.*;

public class IpAddressValidator {
    public static void main(String[] args) {
        String[] ips = {"192.168.1.1", "255.255.255.0", "256.1.2.3", "10.0.0.999", "abc.def.ghi.jkl"};
        
        String octet = "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])";
        String regex = "^(?:" + octet + "\\.){3}" + octet + "$";
        
        try {
            Pattern pattern = Pattern.compile(regex);
            
            for (String ip : ips) {
                Matcher matcher = pattern.matcher(ip);
                if (matcher.matches()) {
                    System.out.println("IP " + ip + " - коректный ");
                } else {
                    System.out.println("IP " + ip + " - не коректный");
                }
            }
        } catch (PatternSyntaxException e) {
             System.err.println("Ошибка регулярного выражения: " + e.getMessage());
        }
    }
}