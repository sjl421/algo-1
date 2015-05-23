package util;

import org.junit.Assert;

import java.util.List;
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

    public static int[] add(int[] array, int newElement) {
        int[] copy = new int[array.length + 1];
        int i;
        for (i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        copy[i] = newElement;
        return copy;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(long[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }

    public static void print(List list) {
        for (Object o: list)
            System.out.println(o.toString() + " ");
        System.out.println("");
    }

    public static void assertMatrixEquals(int[][] expected, int[][] actual) {
        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], actual[i]);
        }
    }
}
