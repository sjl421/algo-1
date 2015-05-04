package util;

public class MatrixUtils {
    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; i++) {
                if (j > 0)
                    System.out.print(' ');
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void print(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > 0)
                    System.out.print(' ');
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printSerialized(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
