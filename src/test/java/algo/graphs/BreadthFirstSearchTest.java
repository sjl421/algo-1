package algo.graphs;

import org.junit.Before;
import org.junit.Test;

/**
 * Test {@link BreadthFirstSearch}
 *
 * @author Artur Khalikov
 */
public class BreadthFirstSearchTest {

    private DiGraph dg1;

    @Before
    public void setUp() throws Exception {
        dg1 = new DiGraph(4);
        dg1.addEdge(1, 2);
        dg1.addEdge(2, 3);
        dg1.addEdge(2, 4);
        dg1.addEdge(3, 1);
        dg1.addEdge(3, 4);
    }

    @Test
    public void testNext() throws Exception {
        System.out.println("Test starting from 1");
        print(dg1.breathFirstSearch(new Vertex(1)));

        System.out.println("Test starting from 2");
        print(dg1.breathFirstSearch(new Vertex(2)));

        System.out.println("Test starting from 3");
        print(dg1.breathFirstSearch(new Vertex(3)));

        System.out.println("Test starting from 4");
        print(dg1.breathFirstSearch(new Vertex(4)));
    }

    private void print(Iterable<Vertex> vertices) {
        for (Vertex v: vertices)
            System.out.println(v);
    }
}
