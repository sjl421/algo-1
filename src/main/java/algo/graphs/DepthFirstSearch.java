package algo.graphs;

import java.util.*;

/**
 * DeptFirstSearch algorithm
 *
 * @author: Artur Khalikov
 */
class DepthFirstSearch extends AbstractGraphSearch {

    private Deque<Vertex> stack;

    public DepthFirstSearch(Graph graph, Vertex start) {
        super(graph);
        stack = new LinkedList();
        stack.add(start);
    }

    public Vertex next() {
        Vertex current = stack.pop();
        for (Vertex v: graph.arcs(current)) {
            if (!isExplored(v)) {
                setExplored(v);
                stack.push(v);
            }
        }
        return current;
    }
}
