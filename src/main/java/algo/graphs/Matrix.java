package algo.graphs;

/**
 * Simple Integer Matrix representation
 *
 * @author Artur Khalikov
 */
public class Matrix {

    private int[][] array;

    public Matrix() {
    }

    public Matrix(int[][] array) {
        this.array = array;
    }

    public int[] getRow(int rowIndex) {
        return array[rowIndex];
    }

    public int[] getCol(int columnIndex) {
        int m = array.length;
        int[] col = new int[m];
        for (int i = 0; i < m; i++)
            col[i] = array[i][columnIndex];
        return col;
    }

    public int get(int rowIndex, int columnIndex) {
        return array[rowIndex][columnIndex];
    }

    public int getRowsNumber() {
        return array.length;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                s += array[i][j] + ((j == array[i].length-1) ? "\n" : " ");
            }
        }
        return s;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }
}
