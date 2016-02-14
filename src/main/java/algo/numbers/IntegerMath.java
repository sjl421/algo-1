package algo.numbers;

class IntegerMath {
  /**
   * Product of a and b
   * Runtime: O(b)
   */
  static int product(int a, int b) {
    int sum = 0;
    for (int i = 0; i < b; i++)
      sum += a;
    return sum;
  }

  /**
   * Basic power of a and b: a^b
   * Runtime: O(b), space complexity: O(b)
   */
  static int power(int a, int b) {
    if (b < 0)
      return Integer.MIN_VALUE; // error
    else if (b == 0)
      return 1; // base case
    else {
      return a * power(a, b - 1);
    }
  }

  /**
   * Calculates a % b
   * Runtime: O(1)
   */
  static int mod(int a, int b) {
    if (b < 0)
      b = -b;

    return a - (a / b) * b;
  }

  /**
   * Integer division
   * @param a is positive
   * @param b is positive
   *
   * Runtime: O(a/b)
   */
  static int div(int a, int b) {
    if (b == 0)
      throw new ArithmeticException("division by zero");
    int count = 0, sum = b;
    while (sum <= a) {
      sum += b;
      count++;
    }
    return count;
  }

  /**
   * Integer square root
   * @param n Integer number
   * @return x = sqrt(n), or -1 if there is no integer square root of n
   *
   * Runtime: O(log n)
   * Space: O(log n)
   */
  static int sqrt(int n) {
    return sqrtRec(n, 1, n);
  }

  private static int sqrtRec(int n, int min, int max) {
    if (max < min)
      return -1; // no square root

    int guess = (min + max) / 2;
    int guessPow = guess * guess;
    if (guessPow == n) // found, yay!
      return guess;

    else if (guessPow < n) // too small
      return sqrtRec(n, guess + 1, max);

    else // too big
      return sqrtRec(n, min, guess - 1);
  }
}