package algo.sort;

import util.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Algorithms: Design and Analysis, Part I
 * Programming Question-1
 *
 * @author: Artur Khalikov
 */
public class Inversions {

    private static int[] aux;
    private static long inversions;

    public static long count(int[] a) {
        if (a.length < 2)
            return 0;

        aux = new int[a.length];
        inversions = 0;
        count(a, 0, a.length);
        return inversions;
    }

    private static void count(int[] a, int lo, int hi) {
        if (hi - lo <= 1)
            return;
        int mid = lo + (hi - lo) / 2;
        count(a, lo, mid);
        count(a, mid, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid;
        save(a, lo, hi);
        for (int k = lo; k < hi; k++) {
            if (i >= mid)
                a[k] = aux[j++];
            else if (j >= hi)
                a[k] = aux[i++];
            else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
                inversions += mid - i;
            }
            else
                a[k] = aux[i++];
        }
    }

    private static void save(int[] a, int lo, int hi) {
        for (int i = lo; i < hi; i++)
            aux[i] = a[i];
    }

    public static void main(String[] args) throws Exception {
        File f = new File("/home/artur/work/study/algo/data/IntegerArray.txt");
        int[] a = FileUtils.getIntArrayFromFile(f);
        assert a.length != 0: "array is empty";
        System.out.println("Input array lenght=" + a.length);
        System.out.println("Inversions: " + count(a));
    }
}
