package algo.graphs;

import java.util.Iterator;

/**
 * Abstract graph iterator class
 *
 * @author Artur Khalikov
 */
public abstract class AbstractGraphIterator implements Iterator<Vertex> {

    protected Graph graph;
    protected Vertex current;
    protected boolean explored[];

    protected AbstractGraphIterator(Graph graph, Vertex start) {
        this.graph = graph;
        explored = new boolean[graph.size()];
        setExplored(start);
    }

    protected void setExplored(Vertex v) {
        explored[v.id()-1] = true;
    }

    protected boolean isExplored(Vertex v) {
        return explored[v.id()-1] == true;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
