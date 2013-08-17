package algo.graphs.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

/**
 * A Two-Sum problem
 * Assignment 6, question 1
 * This is a straightforward quick implementation using HashSet collection provided by JDK
 *
 * Using hash-table:
 * TODO: implement your own HashTable data structure
 * TODO: use domain knowledge to optimize hash function
 * TODO: implement optional challenge
 *
 * Using binary tree:
 * TODO: try implementing
 *
 * @author Artur Khalikov
 */
public class TwoSum {
    /**
     * Target Min = -10,000
     */
    public static final int TARGET_MIN = -10 * 1000;

    /**
     * Target Max = 10,000
     */
    public static final int TARGET_MAX = 10 * 1000;

    /**
     * Input numbers
     */
    private Set<Long> numbers;

    /**
     * Number of target values in the [TARGET_MIN, TARGET_MAX] interval
     */
    private int targetNumber = 0;

    public TwoSum(String fileName) {
        readNumbers(fileName);
        for (long t = TARGET_MIN; t <= TARGET_MAX; t++) {
            for (Long x: numbers) {
                Long y = t - x;
                if (!y.equals(x) && numbers.contains(y)) {
                    targetNumber++;
                    break;
                }
            }
            System.out.println(t + ": " + targetNumber);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0)
            throw new IllegalArgumentException("Path to input file expected");

        TwoSum theProblem = new TwoSum(args[0]);
        assert theProblem.numbers != null: "Input array is null";

        System.out.println(theProblem.targetNumber);
    }

    private void readNumbers(String fileName) {
        try {
            BufferedReader reader = null;
            try {
                numbers = new HashSet();
                reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    numbers.add(Long.parseLong(line));
                }
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getTargetNumber() {
        return targetNumber;
    }
}

/**
 * The goal of this problem is to implement a variant of the 2-SUM algorithm
 * (covered in the Week 6 lecture on hash table applications).
 * The file contains 1 million integers, both positive and negative (there might be some repetitions!).
 * This is your array of integers, with the ith row of the file specifying the ith entry of the array.
 *
 * Your task is to compute the number of target values t in the interval [-10000,10000] (inclusive) such that there are
 * distinct numbers x,y in the input file that satisfy x+y=t. (NOTE: ensuring distinctness requires a one-line addition
 * to the algorithm from lecture.)
 *
 * Write your numeric answer (an integer between 0 and 20001) in the space provided.
 *
 * OPTIONAL CHALLENGE: If this problem is too easy for you, try implementing your own hash table for it. For example,
 * you could compare performance under the chaining and open addressing approaches to resolving collisions.
 */
