package algo.graphs;

import org.junit.Test;

import static junit.framework.Assert.assertNull;

/**
 * Test {@link DepthFirstSearch}
 *
 * @author Artur Khalikov
 */
public class DepthFirstSearchTest {

    @Test
    public void test1() throws Exception {
        Graph g = new DiGraph(4);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 1);
        g.addEdge(3, 4);

        System.out.println("Test starting from 1");
        DepthFirstSearch bfs = new DepthFirstSearch(g, 1);
        Iterable<Integer> path0 = bfs.pathTo(6);
        assertNull(path0);

        Iterable<Integer> path4 = bfs.pathTo(4);
        print(path4);
    }

    private void print(Iterable<Integer> vertices) {
        for (Integer v: vertices)
            System.out.print(v + " ");
        System.out.println();
    }
}
