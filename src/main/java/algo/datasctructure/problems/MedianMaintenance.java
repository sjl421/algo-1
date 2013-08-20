package algo.datasctructure.problems;

import util.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * A Median maintenance problem
 * Assignment 6, question 2
 *
 * @author Artur Khalikov
 */
public class MedianMaintenance {

    private List<Integer> numbers;

    public MedianMaintenance(String fileName) {
        readNumbers(fileName);



        ArrayUtils.print(numbers);
    }

    private void readNumbers(String fileName) {
        try {
            BufferedReader reader = null;
            try {
                numbers = new ArrayList();
                reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    numbers.add(Integer.parseInt(line));
                }
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0)
            throw new IllegalArgumentException("Path to input file expected");

        MedianMaintenance mm = new MedianMaintenance(args[0]);
        assert mm.numbers != null: "Input array is null";
    }
}

/**
 * The goal of this problem is to implement the "Median Maintenance" algorithm (covered in the Week 5 lecture
 * on heap applications).
 *
 * The text file contains a list of the integers from 1 to 10000 in unsorted order; you should treat this as a
 * stream of numbers, arriving one by one. Letting xi denote the ith number of the file, the kth median mk
 * is defined as the median of the numbers x1,…,xk.
 * (So, if k is odd, then mk is ((k+1)/2)th smallest number among x1,…,xk; if k is even,
 * then mk is the (k/2)th smallest number among x1,…,xk.)
 *
 * In the box below you should type the sum of these 10000 medians, modulo 10000 (i.e., only the last 4 digits).
 * That is, you should compute (m1+m2+m3+⋯+m10000)mod10000.
 *
 * OPTIONAL EXERCISE: Compare the performance achieved by heap-based and search-tree-based implementations of the algorithm.
 */
