package algo.prime;

import algo.Stopwatch;

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
    for (int i = 3; count < n; i += 2) {
      if (PrimeTest.isPrime1(i))
        primes[count++] = i;
    }
  }
}
