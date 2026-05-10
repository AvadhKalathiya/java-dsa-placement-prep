public class PrimeCheckOptimal {

    public static boolean isPrime(int n) {

        // Edge cases
        if (n <= 1) {
            return false;
        }

        // Check divisors till sqrt(n)
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 29;

        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}