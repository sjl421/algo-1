package algo.prime;

import algo.Stopwatch;

/**
 * First primes for a given N
 * Using PrimeTest.isPrime2 function
 *
 * Performance: polynomial O(n^3) regarding to bit length of n
 *
 * Execution time:
 * N=10,000     : 0.16 sec
 * N=100,000    : 1.84 sec
 * N=1,000,000  : 60 sec.
 *
 * @author Artur Khalikov
 */
public class FirstNPrimes2 {

    private static long primes[];
    private static int count;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        Stopwatch.start();
        findPrimes(n);

        Stopwatch.stop(n);
    }

    public static void findPrimes(int n) {
        primes = new long[n];
        primes[0] = 2;
        if (n == 1)
            return;

        count = 1;
        for (int i = 3; count < n; i++) {
            if (PrimeTest.isPrime2(i))
                primes[count++] = i;
        }
    }
}
