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

    List<Vertex> arcs(Vertex v);

    void addEdge(Vertex v, Vertex w);
}
