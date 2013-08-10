package algo.graphs;

import java.util.*;

/**
 * DeptFirstSearch algorithm
 *
 * @author: Artur Khalikov
 */
class DepthFirstSearch {

    private Graph graph;
    private int start;
    private boolean explored[];
    private Map<Integer, Integer> edgeTo;

    public DepthFirstSearch(Graph graph, int start) {
        this.graph = graph;
        this.start = start;
        explored = new boolean[graph.size()];
        edgeTo = new TreeMap();
        search(start);
    }

    public Iterable<Integer> pathTo(int v) {
        if (!graph.hasVertex(v)) return null;
        if (!hasPathTo(v)) return null;
        Deque<Integer> path = new LinkedList();
        for (int x = v; x != start; x = edgeTo.get(x))
            path.push(x);
        path.push(start);
        return path;
    }

    public boolean hasPathTo(int v) {
        return explored[v-1];
    }

    /**
     * DFS recoursive routine
     * @param v Vertex
     */
    private void search(int v) {
        explored[v-1] = true;
        for (Integer w: graph.adj(v)) {
            if (!explored[w-1]) {
                edgeTo.put(w, v);
                search(w);
            }
        }
    }
}
