public class Primes {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++)
            if (isPrime(n)==true)
                System.out.println(n);
        }
    public static boolean isPrime(int n) {

        if (n == 2 || n == 3)
            return true;

        else if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 3; i*i <= n; i += 1) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}