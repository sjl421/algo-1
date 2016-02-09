package algo;

/**
 * Iterative binary search of an integer array
 */
public class BinarySearch {

  public static int search(int[] arr, int key) {
    return search(arr, key, 0, arr.length);
  }

  public static int search(int[] arr, int key, int fromIndex, int toIndex) {
    if (arr.length == 0)
      return -1; // empty array

    if (key < arr[fromIndex] || key > arr[toIndex - 1])
      return -1; // not found

    int lo = fromIndex;
    int hi = toIndex;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      int midVal = arr[mid];
      if (key < midVal)
        hi = mid - 1;
      else if (key > midVal)
        lo = mid + 1;
      else
        return mid;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(search(a, 1));
  }
}
