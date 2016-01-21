package algo.sorting;

import com.ahalikov.toolkit.utils.ArrayUtils;

/**
 * HeapSort implementation
 *
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure.
 * It is similar to selection sort where we first find the maximum element and place
 * the maximum element at the end. We repeat the same process for remaining element.
 *
 * Heap Sort Algorithm for sorting in increasing order:
 *
 *  1. Build a max heap from the input data.
 *  2. At this point, the largest item is stored at the root of the heap.
 *  Replace it with the last item of the heap followed by reducing the size of heap by 1.
 *  Finally, heapify the root of tree.
 *  3. Repeat above steps until size of heap is greater than 1.
 *
 * @link http://geeksquiz.com/heap-sort
 */
public class HeapSort {

  static void sort(int[] arr) {
    final MaxHeap heap = new MaxHeap(arr, arr.length);
    while (heap.size > 1) {
      ArrayUtils.swap(heap.arr, 0, heap.size - 1);
      heap.size--;
      heap.maxHeapify(0);
    }
  }

  /**
   * Max heap data structure
   */
  public static class MaxHeap {
    private int[] arr;
    private int size;

    public MaxHeap(int[] arr, int size) {
      this.arr = arr;
      this.size = size;
      buildMaxHeap();
    }

    /**
     * The function to create a MaxHeap.
     * The function assumes that everything under given root is already heapified.
     * @param index
     */
    public void maxHeapify(int index) {
      if (arr == null)
        throw new NullPointerException("arr is null");
      if (arr.length == 0)
        return;

      int max = index;
      int left = index * 2 + 1;
      int right = index * 2 + 2;

      if (left < size && arr[left] > arr[index])
        index = left;
      if (right < size && arr[right] > arr[index])
        index = right;

      if (index != max) {
        ArrayUtils.swap(arr, max, index);
        maxHeapify(max);
      }
    }

    private void buildMaxHeap() {
      for (int i = (size - 2) / 2; i >= 0; i--)
        maxHeapify(i);
    }
  }
}
