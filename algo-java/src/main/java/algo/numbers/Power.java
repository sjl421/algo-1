package algo.numbers;

/**
 * pow(x, n)
 * Created by akhalikov on 03/03/16
 */
class Power {
  /**
   * Run-time complexity: O(n)
   * Space complexity: O(1)
   */
  static int pow(int x, int n) {
    if (n < 0)
      throw new IllegalArgumentException("n should be positive");
    if (n == 0)
      return 1;
    else if (n % 2 == 0)
      return pow(x, n/2) * pow(x, n/2);
    else
      return x * pow(x, n/2) * pow(x, n/2);
  }

  /**
   * Memoizing calculation of power reduces Run-time complexity to O(log n)
   */
  static int pow2(int x, int n) {
    if (n == 0)
      return 1;
    int temp = pow2(x, n/2);
    if (n % 2 == 0)
      return temp * temp;
    else
      return x * temp * temp;
  }

  static int pow3(int x, int n) {
    int res = 1;
    while (n > 0) {
      if (n % 2 == 1)
        res = res * x;

      n = n >> 1; // n = n/2
      if (n > 0)
        x = x*x;
    }
    return res;
  }
}
