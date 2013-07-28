package algo.graphs;

import util.InputFile;

/**
 * Week 3: Programming assignment
 *
 * @author: Artur Khalikov
 */
public class MinCutProblem {

    public static void main(String[] args) {
        int[][] graph = new InputFile("/home/artur/work/study/algo/data/kargerMinCut.txt")
                .getAdjacentMatrix();
        for (int i = 0; i < graph[0].length; i++) {
            System.out.println(graph[0][i]);
        }
        //assert (graph.length != 0 && graph[0].length != 0): "array is empty";
    }
}
