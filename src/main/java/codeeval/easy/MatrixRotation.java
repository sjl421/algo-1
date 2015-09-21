package codeeval.easy;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * You are given a 2D N×N matrix. Each element of the matrix is a letter: from 'a' to 'z'.
 * Your task is to rotate the matrix 90' clockwise:
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
            char[][] matrix = rotate(line);
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j > 0)
                        System.out.print(" ");
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
        buffer.close();
    }

    static char[][] rotate(String line) {
        String[] items = line.split(" ");
        int n = (int) Math.sqrt(items.length);
        char[][] trans = new char[n][n];
        for (int i = 0; i < n; i++) {
            int x = n - i - 1;
            for (int j = 0; j < n; j++) {
                trans[j][x] = items[j + n*i].charAt(0);
            }
        }
        return trans;
    }
}
