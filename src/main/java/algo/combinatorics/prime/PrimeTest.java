package algo.combinatorics.prime;

/**
 * Prime number test
 *
 * @author Artur Khalikov
 */
public class PrimeTest {
  /**
   * Performance: O(n) regarding input n,
   * and O(n*2) regarding to bit length of n
   *
   * @param num
   * @return
   */
  public static boolean isPrime1(long num) {
    if (num % 2 == 0)
      return false;
    for (int i = 3; i <= num / 2; i += 2)
      if (num % i == 0)
        return false;
    return true;
  }

  /**
   * Mod 1: checking numbers up to sqrt(N)
   *
   * Performance: O(sqrt(n)) regarding input n,
   * and O(n*2) regarding to bit length of n
   *
   * @param num
   * @return
   */
  public static boolean isPrime2(long num) {
    for (int i = 2; i * i <= num; i++)
      if (num % i == 0)
        return false;
    return true;
  }
}
