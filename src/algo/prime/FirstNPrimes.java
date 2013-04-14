package algo.prime;

/**
 * First N primes
 *
 * Performance: polynomial O(n^3) regarding to bit length of n
 *
 * Execution time:
 * N=10,000     : 2.22 sec
 * N=100,000    : 293 sec
 * N=1,000,000  : hours
 *
 * @author Artur Khalikov
 */
public class FirstNPrimes {

    private final static double NANO_FACTOR = 1000.0 * 1000 * 1000;

    private static long primes[];
    private static int count;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        long start = System.nanoTime();
        findPrimes(n);

        long end = System.nanoTime();
        double time = (end - start)/NANO_FACTOR;
        System.out.println("N=" + n);
        System.out.println("Execution time: " + time);

        /*if (n <= 100) {
            for (long p: primes)
                System.out.println(p);
        }*/
    }

    public static void findPrimes(int n) {
        primes = new long[n];
        primes[0] = 2;
        if (n == 1)
            return;

        count = 1;
        for (int i = 3; count < n; i+=2) {
            if (PrimeTest.isPrime1(i))
                primes[count++] = i;
        }
    }
}
