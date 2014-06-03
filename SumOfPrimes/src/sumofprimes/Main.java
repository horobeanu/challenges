package sumofprimes;

/**
 * Write a program to determine the sum of the first 1000 (N) prime numbers. 
 * 
 * @author Daniel Horobeanu <horobeanu@yahoo.com>
 */
public class Main {
    public static int N = 1000;
    public static void main(String[] args) {
        int sum = 0;
        int nrOfPrimesFound = 0;
        for (int i=0;; i++) {
            if (Main.isPrime(i)) {
                sum = sum + i;
                nrOfPrimesFound++;
            }
            if (nrOfPrimesFound == N) {
                break;
            }
        }
        System.out.print(sum);
    }
    
    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }
}