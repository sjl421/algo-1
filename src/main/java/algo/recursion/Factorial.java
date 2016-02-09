package algo.recursion;

class Factorial {
  public static final int MAX_FACTORIAL = 20;

  /**
   * Calculates factorial for positive number less than 21
   *
   * Time / space complexity: O(n)
   */
  public static long calculate(int n) {
    if (n > MAX_FACTORIAL)
      throw new IllegalArgumentException("Can't calc factorial > 20");

    if (n < 0)
      throw new IllegalArgumentException("Expected only positive numbers");

    return calculateRec(n);
  }

  private static long calculateRec(int n) {
    // base case
    if (n <= 1)
      return 1;
    else
      return n * calculateRec(n - 1);
  }
}
