package algo.numbers.prime;

import utils.Stopwatch;

import java.util.concurrent.atomic.AtomicLongArray;

/**
 * First N primes
 *
 * Performance: polynomial O(n^3) regarding to bit length of n
 *
 * Execution time:
 * N=10,000     : 2.22 sec
 * N=100,000    : 293 sec
 * N=1,000,000  : hours
 */
public class FirstNPrimes {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    Stopwatch.start();
    findPrimes(n);
    Stopwatch.stop(n);
  }

  private static void findPrimes(int n) {
    AtomicLongArray primes = new AtomicLongArray(new long[n]);
    primes.set(0, 2);
    if (n == 1)
      return;
    int count = 1;
    for (int i = 3; count < n; i += 2) {
      if (PrimeTest.isPrime1(i)) {
        primes.set(count++, i);
      }
    }
  }
}
