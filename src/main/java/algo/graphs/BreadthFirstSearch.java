package algo.graphs;

import java.util.*;

/**
 * Breath-First Iterator
 *
 * @author Artur Khalikov
 */
class BreadthFirstSearch {

    private Graph graph;
    private boolean explored[];
    private Map<Integer, Integer> edgeTo;
    private int start;

    public BreadthFirstSearch(Graph graph, int start) {
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
     * BFS routine
     * @param start
     */
    private void search(int start) {
        Queue<Integer> queue = new LinkedList();
        explored[start-1] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            Integer v = queue.remove();
            for (Integer w: graph.adj(v)) {
                if (!explored[w-1]) {
                    explored[w-1] = true;
                    edgeTo.put(w, v);
                    queue.add(w);
                }
            }
        }
    }
}
