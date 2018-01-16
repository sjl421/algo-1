package algo.numbers.prime;

import java.util.Arrays;

/**
 * Problem: prime numbers
 * Input: 0 <= m <= n <= 10^8
 * Output: prime numbers from segment (m, n)
 */
class Eratosthenes2 {
  private static int[] primes;

  static boolean[] sieve(int m, int n) {
    int n1 = (int) Math.sqrt(n);
    sieve1(n1);
    boolean[] sieve = new boolean[n - m + 1];
    Arrays.fill(sieve, true);
    for (int prime : primes) {
      int h = m % prime;
      int j = (h == 0) ? 0 : prime - h;
      for (; j <= n - m; j += prime)
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
    for (boolean aSieve : sieve) {
      if (aSieve) countPrimes++;
    }
    primes = new int[countPrimes];
    int k = 0;
    for (int i = 0; i <= n; i++) {
      if (sieve[i])
        primes[k++] = i;
    }
  }
}
