package algo.graphs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * A representation of directed graph
 *
 * @author: Artur Khalikov
 */
public class DiGraph implements Graph {
    /**
     * Map of LinkedLists representing vertices and edges
     */
    private TreeMap<Vertex, LinkedList<Vertex>> graph;

    /**
     * Number of vertices
     */
    private int vertices = 0;

    /**
     * Number of edges
     */
    private int edges = 0;

    /**
     * Create empty directed graph
     * @param numberOfVertices
     */
    public DiGraph(int numberOfVertices) {
        this.vertices = numberOfVertices;
        initMap();
    }

    /**
     * Create directed graph from file
     *
     * Example input:
     *
     * 3
     * 1 4
     * 2 8
     * 3 6
     *
     * @param file Input file
     */
    public DiGraph(File file) {
        readFromFile(file);
    }

    /**
     * Add the edge v -> w to the graph
     * @param v tail
     * @param w head
     */
    public void addEdge(Vertex v, Vertex w) {
        graph.get(v).add(w);
        edges++;
    }

    /**
     * Add the edge v -> w to the graph
     * @param v tail
     * @param w head
     */
    public void addEdge(int v, Vertex w) {
        graph.get(new Vertex(v)).add(w);
        edges++;
    }

    /**
     * Add the edge v -> w to the graph
     * @param v tail
     * @param w head
     */
    public void addEdge(int v, int w) {
        graph.get(new Vertex(v)).add(new Vertex(w));
        edges++;
    }

    /**
     * Return number of vertices of the graph
     */
    public int size() {
        return vertices;
    }

    /**
     * Return the reverse if the graph
     */
    public DiGraph reverse() {
        DiGraph reverse = new DiGraph(vertices);
        for (Vertex v: graph.keySet()) {
            for (Vertex w: arcs(v))
                reverse.addEdge(w, v);
        }
        return reverse;
    }

    /**
     * Return vertices adjacent (arcs) to the given vertex
     */
    @Override
    public List<Vertex> arcs(Vertex v) {
        if (!graph.containsKey(v))
            throw new IllegalArgumentException("v is not in Graph");
        return graph.get(v);
    }

    public Iterable<Vertex> breathFirstSearch(Vertex start) {
        return new BreadthFirstSearch(this, start).getResult();
    }

    public Iterator<Vertex> depthFirstSearch(Vertex start) {
        //return new DepthFirstSearch(this, start).getResult();
        return null;
    }

    public Vertex getLastVertex() {
        return graph.lastKey();
    }

    public void print() {
        for (Vertex v: graph.keySet()) {
            List<Vertex> edges = graph.get(v);
            System.out.print(v + " ");
            for (Vertex w: edges)
                System.out.print(w + " ");
            System.out.println();
        }
    }

    private void initMap() {
        graph = new TreeMap();
        for (int i = 0; i < vertices; i++) {
            Vertex v = new Vertex(i + 1);
            graph.put(v, new LinkedList());
        }
    }

    private void readFromFile(File file) {
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));

                // number of vertices
                String line = reader.readLine();
                vertices = Integer.parseInt(line);
                initMap();

                // reading vertices
                while ((line = reader.readLine()) != null) {
                    String[] split = line.split(" ");
                    Vertex tail = Vertex.valueOf(split[0]);
                    Vertex head = Vertex.valueOf(split[1]);
                    addEdge(tail, head);
                }
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
