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
public class DiGraph {
    /**
     * Array of LinkedLists representing vertices and edges
     */
    private LinkedList<Integer>[] graph;

    /**
     * NUmber of vertices
     */
    private int vertices = 0;

    /**
     * Number of edges
     */
    private int edges = 0;

    /**
     * Creat empty directed graph
     * @param vertices
     */
    public DiGraph(int vertices) {
        this.vertices = vertices + 1;
        initGraph();
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
        try {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));

                // number of vertices
                String line = reader.readLine();
                vertices = Integer.parseInt(line) + 1;
                initGraph();

                // reading vertices
                while ((line = reader.readLine()) != null) {
                    String[] split = line.split(" ");
                    Integer tail = Integer.valueOf(split[0]);
                    Integer head = Integer.valueOf(split[1]);
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

    /**
     * Add the edge v -> w to the graph
     * @param v tail
     * @param w head
     */
    public void addEdge(Integer v, Integer w) {
        graph[v].add(w);
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
        for (int v = 1; v <= vertices; v++) {
            for (Integer w: arcs(v))
                reverse.addEdge(w, v);
        }
        return reverse;
    }

    /**
     * Return vertices adjacent (arcs) to the given vertex
     */
    public Iterable<Integer> arcs(int v) {
        if (v >= vertices || v < 0)
            throw new IllegalArgumentException("v is out of range [0, " + vertices + ")");
        return graph[v];
    }

    public void print() {
        for (int i = 1; i <= graph.length; i++) {
            LinkedList<Integer> edges = graph[i];
            System.out.print((i+1) + " ");
            for (Integer w: edges)
                System.out.print(w + " ");
            System.out.println();
        }
    }

    private void initGraph() {
        graph = new LinkedList[vertices];
        for (int i = 1; i <= vertices; i++)
            graph[i] = new LinkedList();
    }
}
