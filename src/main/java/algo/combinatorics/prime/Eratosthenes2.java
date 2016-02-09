package algo.combinatorics.prime;

import java.util.Arrays;

/**
 * Problem: prime numbers
 * Input: 0 <= m <= n <= 10^8
 * Output: prime numbers from segment (m, n)
 *
 * @author Artur Khalikov
 */
public class Eratosthenes2 {
  private static int[] primes;

  public static boolean[] sieve(int m, int n) {
    int n1 = (int) Math.sqrt(n);
    sieve1(n1);
    boolean[] sieve = new boolean[n - m + 1];
    Arrays.fill(sieve, true);
    for (int i = 0; i < primes.length; i++) {
      int h = m % primes[i];
      int j = (h == 0) ? 0 : primes[i] - h;
      for (; j <= n - m; j += primes[i])
        sieve[j] = false;
    }
    return sieve;
  }

  private static void sieve1(int n) {
    boolean[] sieve = new boolean[n + 1];
    Arrays.fill(sieve, true);
    sieve[0] = false;
    sieve[1] = false;
    for (int i = 2; i * i <= n; i++) {
      if (sieve[i])
        for (int j = i * i; j <= n; j += i)
          sieve[j] = false;
    }
    int countPrimes = 0;
    for (int i = 0; i < sieve.length; i++)
      if (sieve[i]) countPrimes++;

    primes = new int[countPrimes];
    int k = 0;
    for (int i = 0; i <= n; i++) {
      if (sieve[i])
        primes[k++] = i;
    }
  }
}
