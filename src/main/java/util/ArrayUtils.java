package util;

import java.util.Random;

/**
 * @author: Artur Khalikov
 */
public class ArrayUtils {

    /**
     * Fisher–Yates array shuffle
     */
    public static void shuffle(int[] a) {
        Random r = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = r.nextInt(i);
            swap(a, j, i);
        }
    }

    public static void fillFrom(int[] a, int from) {
        for (int i = 0; i < a.length; i++)
            a[i] = from++;
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
