package algo.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Breath-First Iterator
 *
 * @author Artur Khalikov
 */
class BreadthFirstIterator extends AbstractGraphIterator {

    private Queue<Vertex> queue;

    public BreadthFirstIterator(Graph graph, Vertex start) {
        super(graph, start);
        queue = new LinkedList();
        queue.add(start);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Vertex next() {
        current = queue.poll();
        for (Vertex v: graph.arcs(current)) {
            if (!isExplored(v)) {
                setExplored(v);
                queue.add(v);
            }
        }
        return current;
    }
}
