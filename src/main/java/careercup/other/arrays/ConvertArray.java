package careercup.other.arrays;

/**
 * Given an array:
 *
 *  [a1, a2, ..., aN, b1, b2, ..., bN, c1, c2, ..., cN]
 *
 * convert it to:
 *
 *  [a1, b1, c1, a2, b2, c2, ..., aN, bN, cN]
 *
 * Created by akhalikov on 24/01/16
 */
public class ConvertArray {
  /**
   * Brute-force solution that takes O(n) space
   * and does not change input array.
   */
  static String[] convert(String[] a, int n) {
    int len = a.length, k;
    String[] c = new String[len];
    for (int i = 0; i < n; i++) {
      k = 3*i;
      c[k] = a[i];
      c[k+1] = a[n+i];
      c[k+2] = a[2*n+i];
    }
    return c;
  }
}
