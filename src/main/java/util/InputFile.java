package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author: Artur Khalikov
 */
public class InputFile {

    private String fileName;
    private File file;

    public InputFile(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName);
    }

    public int linesNumber() {
        int length = 0;
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                while (reader.readLine() != null)
                    length++;
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return length;
    }

    public int[] getIntegerArray() {
        int linesNumber = linesNumber();
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
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return array;
    }

    public int[][] getAdjacentMatrix() {
        int n = linesNumber();
        int[][] matrix = new int[n][];
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                String line;
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    matrix[i++] = parseIntString(line);
                }
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return matrix;
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