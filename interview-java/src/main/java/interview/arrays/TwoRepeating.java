package interview.arrays;

/**
 * Find two repeating numbers in array of n+2 elements,
 * with each element from 1 to n.
 */
class TwoRepeating {
  /**
   * Time complexity: O(n), space: O(1)
   */
  static void printRepeatingPair(int[] a, int n) {
    // sum of elements and product of elements
    int s = 0, p = 1;
    for (int val: a) {
      s += val;
      p *= val;
    }

    // sum of elements - arithmetic sum
    int ds = s - (1 + n) * n / 2;
    // product of elements / product(1..n)
    int dp = p / fact(n);

    // equations
    // x + y = ds, x*y = dp => x - y = sqrt ((x + y)^2 - 4xy ) = d
    int d = (int) Math.sqrt(ds * ds - 4*dp);

    // x = (ds + d)/2, y = (ds - d) / 2
    int x = (ds + d) / 2;
    int y = (ds - d) / 2;

    System.out.println(x + " " + y);
  }

  /**
   * Time complexity: O(n), space: O(n)
   */
  static void printRepeatingPair2(int[] a, int n) {
    boolean[] seen = new boolean[n+1];
    for (int num : a) {
      if (seen[num])
        System.out.print(num + " ");
      else
        seen[num] = true;
    }
  }

  static int fact(int n) {
    int i = 1, p = 1;
    while (i <= n) {
      p = p * i;
      i++;
    }
    return p;
  }
}
