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

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++)
            copy[i] = array[i];
        return copy;
    }

    public static int[][] copyOf(int[][] array) {
        int[][] copy = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            copy[i] = new int[array[i].length];
            for (int j = 0; j < array[i].length; j++)
                copy[i][j] = array[i][j];
        }
        return copy;
    }
}
