package algo.graphs;

import util.InputFile;

/**
 * Week 3: Programming assignment
 *
 * @author: Artur Khalikov
 */
public class MinCutProblem {

    public static void main(String[] args) {
        if (args.length == 0)
            throw new IllegalArgumentException("Input file name expected");
        int[][] graph = new InputFile(args[0]).getAdjacentMatrix();
        for (int i = 0; i < graph[0].length; i++) {
            System.out.println(graph[0][i]);
        }
        //assert (graph.length != 0 && graph[0].length != 0): "array is empty";
    }
}
