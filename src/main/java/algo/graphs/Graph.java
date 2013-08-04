package algo.graphs;

import util.ArrayUtils;
import util.InputFile;

/**
 * A Graph representation class
 *
 * @author: Artur Khalikov
 */
public class Graph {

    private int[][] array;

    public Graph(int[][] adjacencyMatrix) {
        this.array = adjacencyMatrix;
    }

    public static Graph createFromFile(String fileName) {
        int[][] graph = new InputFile(fileName).getAdjacentMatrix();
        return new Graph(graph);
    }

    public int[][] copyToArray() {
        return ArrayUtils.copyOf(array);
    }

    public int[][] getArray() {
        return array;
    }

    public int rowsNumber() {
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
}