package algo.graphs;

import java.util.*;

/**
 * DeptFirstSearch algorithm
 *
 * @author: Artur Khalikov
 */
class DepthFirstIterator extends AbstractGraphIterator {

    private Deque<Vertex> stack;

    public DepthFirstIterator(Graph graph, Vertex start) {
        super(graph, start);
        stack = new LinkedList();
        stack.add(start);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Vertex next() {
        current = stack.pop();
        for (Vertex v: graph.arcs(current)) {
            if (!isExplored(v)) {
                setExplored(v);
                stack.push(v);
            }
        }
        return current;
    }
}
