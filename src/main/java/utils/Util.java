package utils;

import java.util.Random;

public class Util {
  static final Random RANDOM = new Random();

  private static int[] range(int start, int end) {
    int[] result = new int[end - start];
    for (int i = 0; i < result.length; i++)
      result[i] = start++;
    return result;
  }

  public static int[] range(int max) {
    return range(0, max);
  }

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
  public static <T> void swap(T[] a, int i, int j) {
    T buffer = a[i];
    a[i] = a[j];
    a[j] = buffer;
  }

  private static int[] randomInts(int n) {
    return randomInts(Integer.MAX_VALUE);
  }

  public static int[] randomInts(int n, int max) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = RANDOM.nextInt(max);
    return arr;
  }

  private static Integer[] randomIntegers(int n) {
    return randomIntegers(Integer.MAX_VALUE);
  }

  public static Integer[] randomIntegers(int n, int max) {
    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++)
      arr[i] = RANDOM.nextInt(max);
    return arr;
  }

  /**
   * Finds index of minimum element in an array of integers
   * starting from {@code fromIndex}
   */
  public static int min(int[] arr, int fromIndex) {
    validateArray(arr);
    if (fromIndex < 0 || fromIndex >= arr.length)
      throw new IllegalArgumentException("fromIndex is out of bounds");

    int minIndex = fromIndex;
    for (int i = fromIndex+1; i < arr.length; i++)
      if (arr[i] < arr[minIndex])
        minIndex = i;
    return minIndex;
  }

  /**
   * Finds index of minimum element in an array of integers
   */
  public static int min(int[] arr) {
    return min(arr, 0);
  }

  /**
   * Finds index of minimum element in array of objects
   */
  public static <T extends Comparable<? super T>> int min(T[] a) {
    return min(a, 0);
  }

  /**
   * Finds minimum element in array of objects from a given index
   */
  public static <T extends Comparable<? super T>>
  int min(T[] arr, int fromIndex) {
    validateArray(arr);
    if (fromIndex < 0 || fromIndex >= arr.length)
      throw new IllegalArgumentException("k parameter is out of bounds");

    int minIndex = fromIndex;
    for (int i = fromIndex + 1; i < arr.length; i++) {
      if (arr[minIndex].compareTo(arr[i]) > 0)
        minIndex = i;
    }
    return minIndex;
  }

  public static int max(int[] arr, int fromIndex) {
    validateArray(arr);
    if (fromIndex < 0 || fromIndex >= arr.length)
      throw new IllegalArgumentException("fromIndex is out of bounds");

    int maxIndex = arr[0];
    for (int i = 1; i < arr.length; i++)
      if (arr[i] > arr[maxIndex])
        maxIndex = i;
    return maxIndex;
  }

  public static int max(int[] arr) {
    return max(arr, 0);
  }

  private static void validateArray(int[] arr) {
    if (arr == null)
      throw new NullPointerException("arr is null");
    if (arr.length == 0)
      throw new NullPointerException("arr is empty");
  }

  private static <T extends Comparable<? super T>>
  void validateArray(T[] arr) {
    if (arr == null)
      throw new NullPointerException("arr is null");
    if (arr.length == 0)
      throw new NullPointerException("arr is empty");
  }

  public static void print(int[][] matrix) {
    for (int[] aMatrix : matrix) {
      for (int anAMatrix : aMatrix) {
        System.out.print(anAMatrix + " ");
      }
      System.out.println();
    }
  }

  public static void print(int[] array) {
    for (int item : array) {
      System.out.print(item + " ");
    }
    System.out.println();
  }

  public static void print(Object[] array) {
    for (Object o : array) {
      System.out.print(o != null ? o.toString() + " " : "null ");
    }
    System.out.println();
  }

  public static int max(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }
}
