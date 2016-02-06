package utils;

/**
 * Array utils
 *
 * Created by akhalikov on 06/02/16
 */
public class ArrayUtils {
  /**
   * Swap items in integer array
   */
  public static void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  /**
   * Generic swap of a[i] with a[j]
   */
  public static <T extends Comparable<? super T>>
  void swap(T[] a, int i, int j) {
    T buffer = a[i];
    a[i] = a[j];
    a[j] = buffer;
  }
}
