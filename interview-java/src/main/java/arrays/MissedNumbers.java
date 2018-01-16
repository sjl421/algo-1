package arrays;

/**
 * Problem 1:
 * Input: array of length = n-1, filled with numbers from 1 to n.
 * One number is missed. Find this number.
 *
 * Problem 2:
 * Input: array of length = n-2, filled with numbers from 1 to n.
 * Two numbers are missed. Find these numbers.
 *
 * @author ahalikov
 */
class MissedNumbers {
  static int find1(int[] arr, int n) {
    int arithmeticSum = (1 + n) * n / 2;
    int actualSum = 0;
    for (int a : arr) {
      actualSum += a;
    }
    return arithmeticSum - actualSum;
  }

  static int[] find2(int[] arr, int n) {
    int sum1 = (1 + n) * n / 2; // arithmetic sum
    int sum2 = (n + 1) * (2 * n + 1) * n / 6; // sum of squares

    int s1 = 0, s2 = 0;
    for (int a : arr) {
      s1 += a;
      s2 += a * a;
    }

    int t1 = sum1 - s1; // x + y
    int t2 = sum2 - s2; // x^2 + y^2

    int twoxy = t1 * t1 - t2;
    int xminusy = (int) Math.sqrt(t2 - twoxy);

    int[] res = new int[2];
    res[0] = (t1 + xminusy) / 2;
    res[1] = (t1 - xminusy) / 2;

    return res;
  }
}
