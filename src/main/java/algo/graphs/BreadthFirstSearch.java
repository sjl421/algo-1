package algo.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Breath-First Iterator
 *
 * @author Artur Khalikov
 */
class BreadthFirstSearch extends AbstractGraphSearch {

    private Queue<Vertex> queue;

    public BreadthFirstSearch(Graph graph, Vertex start) {
        super(graph);
        queue = new LinkedList();
        search(start);
    }

    public Iterable<Vertex> getResult() {
        return queue;
    }

    private void search(Vertex start) {
        setExplored(start);
        queue.add(start);
        while (!queue.isEmpty()) {
            Vertex v = queue.remove();
            for (Vertex w: graph.arcs(v)) {
                if (!isExplored(w)) {
                    setExplored(w);
                    queue.add(w);
                }
            }
        }
    }
}
