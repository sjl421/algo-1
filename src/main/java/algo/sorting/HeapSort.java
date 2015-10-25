package algo.sorting;

/**
 * StaticHeap sort implementation
 *
 * StaticHeap sort is a comparison based sorting technique based on Binary StaticHeap data structure.
 * It is similar to {@link SelectionSort} where we first find the maximum (or minimum) element
 * and place the maximum element at the end (or begining).
 * We repeat the same process for remaining element.
 *
 * StaticHeap Sort Algorithm for sorting in increasing order:
 *
 *   1. Build a max heap from the input data.
 *
 *   2. At this point, the largest item is stored at the root of the heap.
 *      Replace it with the last item of the heap followed by reducing the size of heap by 1.
 *      Finally, heapify the root of tree.
 *
 *   3. Repeat above steps until size of heap is greater than 1.
 *
 * @link http://geeksquiz.com/heap-sort
 * @author ahalikov
 */
public class HeapSort {
    // todo: implement
}
