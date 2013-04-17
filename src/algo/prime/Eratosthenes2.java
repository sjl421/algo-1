package algo.prime;

import java.util.Arrays;

/**
 * Problem: prime numbers
 * Input: 0 <= m <= n <= 10^8
 * Output: prime numbers from segment (m, n)
 *
 * @author Artur Khalikov
 */
public class Eratosthenes2 {

    public static boolean[] sieve(int m, int n) {
        boolean[] sieve = new boolean[n - m + 1];
        Arrays.fill(sieve, true);

        return sieve;
    }
}
