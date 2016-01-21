package algo.sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Bucket sort is mainly useful when input is uniformly distributed over a range.
 * For example, consider the following problem.
 * Sort a large set of floating point numbers which are in range from 0.0 to 1.0
 * and are uniformly distributed across the range.
 * How do we sort the numbers in linear time ?
 *
 * Bucket sort algorithm:
 *
 * bucketSort(arr[], n)
 *
 *    1) Create n empty buckets (or lists).
 *    2) Do following for every array element arr[i].
 *       .......a) Insert arr[i] into bucket[n*array[i]]
 *    3) Sort individual buckets using insertion sort.
 *    4) Concatenate all sorted buckets.
 *
 * @link http://www.geeksforgeeks.org/bucket-sort-2
 */
public class BucketSort {
  /**
   * Bucket sort
   * Time complexity: O(n)
   * Space complexity: O(n)
   * @param arr
   */
  static void sort(float[] arr) {
    if (arr == null)
      throw new NullPointerException("arr is null");

    int n = arr.length;
    final ArrayList<Float>[] buckets = new ArrayList[n];
    for (int i = 0; i < n; i++) {
      int bi = (int) (n * arr[i]); // index in bucket
      if (buckets[bi] == null)
        buckets[bi] = new ArrayList();
      buckets[bi].add(arr[i]);
    }
    // sort each bucket
    for (int i = 0; i < n; i++) {
      if (buckets[i] != null)
        Collections.sort(buckets[i]);
    }
    // concatenate al buckets into array
    int index = 0;
    for (int i = 0; i < n; i++) {
      if (buckets[i] != null)
        for (int j = 0; j < buckets[i].size(); j++)
          arr[index++] = buckets[i].get(j);
    }
  }
}
