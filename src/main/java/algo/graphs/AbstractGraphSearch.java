package algo.graphs;

import java.util.Iterator;

/**
 * Abstract graph iterator class
 *
 * @author Artur Khalikov
 */
public abstract class AbstractGraphSearch {

    protected Graph graph;
    protected boolean explored[];

    protected AbstractGraphSearch(Graph graph) {
        this.graph = graph;
        explored = new boolean[graph.size()];
    }

    protected void setExplored(Vertex v) {
        explored[v.id()-1] = true;
    }

    protected boolean isExplored(Vertex v) {
        return explored[v.id()-1] == true;
    }
}
