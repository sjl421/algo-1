package algo.prime;

import java.util.Arrays;
import algo.Stopwatch;

/**
 * Sieve of Eratosthenes
 *
 * @author Artur Khalikov
 */
public class Eratosthenes {
    /**
     * Brut-force implementation
     *
     * Performance is O(log (log N))
     *
     * @param n
     * @return
     */
    public static boolean[] sieve1(int n) {
        boolean[] sieve = new boolean[n];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i*i < n; i++) {
            if (sieve[i])
                for (int j = i*i; j < n; j+=i)
                    sieve[j] = false;
        }
        return sieve;
    }

    /**
     * Implementation with improvements
     *
     * Performance is still O(log (log N))
     *
     * @param n
     * @return
     */
    public static boolean[] sieve2(int n) {
        boolean[] sieve = new boolean[n];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i*i < n; i++) {
            if (sieve[i])
                for (int j = i*i; j < n; j+=i)
                    sieve[j] = false;
        }
        return sieve;
    }

    /**
     * Sieve for [n, m) range
     * 1 <= m <= n <= 10^9, n-m <= 10^6
     * Based on sieve1
     *
     * @param n
     * @param m
     * @return
     */
    public static boolean[] sieveRange1(int n, int m) {
        int p = (int) Math.sqrt(n);
        boolean[] firstSieve = sieve1(p);


        boolean[] sieve = new boolean[n - m + 1];
        Arrays.fill(sieve, true);
        return sieve;
    }
}
