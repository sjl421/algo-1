package algo.sort;

import static utils.Util.swap;

/**
 * Bubble sort review
 * https://en.wikipedia.org/wiki/Bubble_sort
 * https://www.youtube.com/watch?v=Jdtq5uKz-w4
 */
class BubbleSort {
  /**
   * Optimized bubble sort
   */
  static void sort(int[] a) {
    if (a == null) {
      throw new NullPointerException("array is null");
    }
    int n = a.length;
    do {
      int newN = 0;
      for (int i = 1; i < n; i++) {
        if (a[i - 1] > a[i]) {
          swap(a, i - 1, i);
          newN = i;
        }
      }
      n = newN;
    } while (n > 0);
  }

  static <T extends Comparable<? super T>> void sort(T[] a) {
    if (a == null)
      throw new NullPointerException("array is null");
    int n = a.length;
    do {
      int newN = 0;
      for (int i = 1; i < n; i++) {
        if (a[i - 1].compareTo(a[i]) > 0) {
          swap(a, i - 1, i);
          newN = i;
        }
      }
      n = newN;
    } while (n > 0);
  }

  /**
   * Basic O(n^2) implementation of bubble sort
   */
  static void sort1(int[] a) {
    if (a == null) {
      throw new NullPointerException("array is null");
    }
    int passes = 0;
    int comparisons = 0;
    boolean swapped;

    do {
      swapped = false;
      for (int i = 1; i < a.length; i++) {
        if (a[i - 1] > a[i]) {
          swap(a, i - 1, i);
          swapped = true;
        }
        comparisons += i;
      }
      passes++;
    } while (swapped);

    System.out.println("Bubble sort1");
    System.out.println("input N=" + a.length);
    System.out.println("passes=" + passes);
    System.out.println("comparisons=" + comparisons);
  }

  /**
   * Optimized inner loop to avoid looking at last n-1 items
   */
  static void sort2(int[] a) {
    if (a == null) {
      throw new NullPointerException("array is null");
    }
    int passes = 0;
    int comparisons = 0;

    boolean swapped;
    int n = a.length;
    do {
      swapped = false;
      for (int i = 1; i < n; i++) {
        if (a[i - 1] > a[i]) {
          swap(a, i - 1, i);
          swapped = true;
        }
        comparisons += i;
      }
      n -= 1;
      passes++;
    } while (swapped);

    System.out.println("Bubble sort2");
    System.out.println("input N=" + a.length);
    System.out.println("passes=" + passes);
    System.out.println("comparisons=" + comparisons);
  }
}
