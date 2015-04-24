package algo;

/**
 * Partitioning of an array around some pivot element
 *
 * Created by ahalikov on 24/04/15.
 */
public class ArrayPartitioner {

    /**
     * Partitioning around first element
     * @param array
     * @return
     */
    public static int[] partition1(int[] array) {
        if (array == null)
            throw new IllegalArgumentException("array is null");
        if (array.length < 2)
            return array;
        int i = 1;
        int pivot = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] < pivot)
                array = swap(array, j, i++);
        }
        array = swap(array, 0, i-1);
        return array;
    }

    private static int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
