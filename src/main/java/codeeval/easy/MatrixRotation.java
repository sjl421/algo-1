package codeeval.easy;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * You are given a 2D N×N matrix. Each element of the matrix is a letter: from ‘a’ to ‘z’.
 * Your task is to rotate the matrix 90° clockwise:
 *
 *   a b c      g d a
 *   d e f  =>  h e b
 *   g h i      i f c
 *
 *  Algorithm O(n^2): transposition (in-place) + swap of columns
 *
 */
public class MatrixRotation {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new FileReader(args[0]));
        String line;
        while ((line = buffer.readLine()) != null) {
            char[][] matrix = transpose(line);
            int n = matrix.length;
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    if (j < n / 2)
                        matrix = swap(matrix, i, j, i, n - j - 1);
                    System.out.print(matrix[j][i] + " ");
                }
            }
            System.out.println();
        }
        buffer.close();
    }

    static char[][] transpose(String line) {
        String[] items = line.split(" ");
        int n = (int) Math.sqrt(items.length);
        char[][] trans = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[j][i] = items[j + n*i].charAt(0);
            }
        }
        return trans;
    }

    static char[][] swap(char[][] matrix, int x1, int y1, int x2, int y2) {
        char item = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = item;
        return matrix;
    }
}
