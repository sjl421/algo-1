package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * Utility class for getting input data from file
 * @author: Artur Khalikov
 */
public class InputFile {

    private String fileName;
    private File file;

    public InputFile(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName);
    }

    /**
     * Return plain array of integer primitives from the given file
     * @return array of ints
     */
    public int[] getIntegerArray() {
        int linesNumber = getLinesNumber();
        int[] array = new int[linesNumber];
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                String line;
                int i= 0;
                while ((line = reader.readLine()) != null) {
                    array[i++] = Integer.parseInt(line);
                }
                return array;
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Return arcs matrix representing undirected graph
     *
     * TODO: analyze running time of this implementation
     * TODO: optimize data structure and reading algorithm
     *
     * Example:
     * 1 2 4
     * 2 1 3 4
     * 3 2 4
     * 4 1 2 3
     * @return
     */
    public int[][] getAdjacentMatrix() {
        int n = getLinesNumber();
        int[][] matrix = new int[n][];
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                String line;
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    matrix[i] = parseIntString(line);
                    i++;
                }
                return matrix;
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Counts number of lines by reading them
     * @return
     */
    private int getLinesNumber() {
        int length = 0;
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                while (reader.readLine() != null) {
                    length++;
                }
                return length;
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private int[] parseIntString(String s) {
        int n = countInts(s);
        Scanner scanner = new Scanner(s);
        int[] a = new int[n];
        int i = 0;
        while (scanner.hasNextInt())
            a[i++] = scanner.nextInt();
        scanner.close();
        return a;
    }

    private int countInts(String s) {
        Scanner scanner = new Scanner(s);
        int count = 0;
        while (scanner.hasNextInt()) {
            scanner.nextInt();
            count++;
        }
        scanner.close();
        return count;
    }
}