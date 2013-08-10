package algo.graphs;

import java.util.List;

/**
 * Graph interface
 *
 * @author Artur Khalikov
 */
public interface Graph {

    int size();

    Graph reverse();

    List<Integer> adj(int v);

    void addEdge(int v, int w);

    boolean hasVertex(int v);
}
