package algo.graphs;

/**
 * A graph Vertex representation
 *
 * @author Artur Khalikov
 */
public class Vertex implements Comparable<Vertex> {

    private int id;

    public Vertex(int id) {
        this.id = id;
    }

    public static Vertex valueOf(String s) {
         return new Vertex(Integer.parseInt(s));
    }

    @Override
    public int compareTo(Vertex o) {
        return id - o.id();
    }

    @Override
    public String toString() {
        return "" + id;
    }

    public int id() {
        return id;
    }

    public void id(int id) {
        this.id = id;
    }
}
