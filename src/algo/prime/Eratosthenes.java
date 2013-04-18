package algo.prime;

import java.util.Arrays;
import algo.Stopwatch;

/**
 * Sieve of Eratosthenes
 * 
 * Problem: prime numbers
 * Input: n <= 10^8
 * Output: prime numbers from 0 to n
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
    public static boolean[] sieve(int n) {
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
}
