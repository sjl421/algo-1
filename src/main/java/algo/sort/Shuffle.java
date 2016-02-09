package algo.sort;

import utils.Util;

import java.util.Random;

/**
 * Shuffling
 *
 * Created by akhalikov on 10/02/16
 */
public class Shuffle {
  private static final Random RANDOM = new Random();

  /**
   * Shuffle an array of integers using Fisher–Yates algorithm
   */
  public static void shuffle(int[] a) {
    for (int i = a.length - 1; i > 0; i--) {
      int j = RANDOM.nextInt(i);
      Util.swap(a, j, i);
    }
  }

  /**
   * Shuffle an array of objects
   */
  public static <T> void shuffle(T[] a) {
    for (int i = a.length - 1; i > 0; i--) {
      int j = RANDOM.nextInt(i);
      Util.swap(a, j, i);
    }
  }
}
