package algo.graphs;

import util.ArrayUtils;

/**
 * A representation of an undirected graph
 *
 * @author: Artur Khalikov
 */
public class UGraph {

    private int[][] array;

    public UGraph(int[][] array) {
        this.array = array;
    }

    /**
     * Return underlying array
     * @return
     */
    public int[][] getArray() {
        return array;
    }

    /**
     * Return copy of underlying array
     * @return array
     */
    public int[][] copyToArray() {
        return ArrayUtils.copyOf(array);
    }

    /**
     * Return number of vertices of the graph
     * @return array
     */
    public int verticesNumber() {
        return array.length;
    }

    /**
     * Returns new Graph object representing reversed directed graph
     * @return
     */
    public UGraph reverse() {

        return null;
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