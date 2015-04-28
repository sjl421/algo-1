package careercup;

import java.util.Arrays;

/**
 * Given an integer array, output all pairs that sum up to a specific value k.
 *
 */
class ArrayPairSum {

    /**
     * O (n log n) solution
     */
    public static void findPairs(int[] a, int k) {
        if (a == null || a.length < 2)
            return;
        Arrays.sort(a);
        int i = 0, j = a.length - 1;
        while (i < j) {
            int sum = a[i] + a[j];
            if (sum == k) {
                System.out.println(a[i] + ", " + a[j]);
                i++;
                j--;
            }
            else if (sum > k) j--;
            else i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("corner test 1");
        int[] arr = null;
        findPairs(arr, 10);

        System.out.println("corner test 2");
        arr = new int[]{1};
        findPairs(arr, 10);

        System.out.println("test 1");
        arr = new int[]{3, 8, 2, 5, 1, 4, 7, 6, 0};
        findPairs(arr, 5);

        System.out.println("test 2");
        arr = new int[]{2, 4, 6, 8, 10};
        findPairs(arr, 10);

        System.out.println("test 3");
        arr = new int[] {12, 15, 20, 22, 34, 36};
        findPairs(arr, 27);
    }
}