public class PrimeRecursion {
    static boolean isPrime(int n, int divisor) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        int number = 20;

        boolean isNumberPrime = isPrime(number, 2);
        if (isNumberPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
