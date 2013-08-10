package algo.graphs;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Test {@link BreadthFirstSearch}
 *
 * @author Artur Khalikov
 */
public class BreadthFirstSearchTest {

    @Test
    public void test1() throws Exception {
        System.out.println("Test graph 1");
        DiGraph g = new DiGraph(4);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 1);
        g.addEdge(3, 4);
        
        System.out.println("Test starting from 1");
        BreadthFirstSearch bfs = new BreadthFirstSearch(g, 1);
        Iterable<Integer> path0 = bfs.pathTo(6);
        assertNull(path0);

        Iterable<Integer> path4 = bfs.pathTo(4);
        assertNotNull(path4);
        print(path4);

        Iterable<Integer> path3 = bfs.pathTo(3);
        assertNotNull(path3);
        print(path3);

        Iterable<Integer> path2 = bfs.pathTo(2);
        assertNotNull(path2);
        print(path2);
    }

    @Test
    public void test2() throws Exception {
        System.out.println("Test graph 2");
        DiGraph g = new DiGraph(6);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 6);
        g.addEdge(3, 4);
        g.addEdge(3, 5);

        BreadthFirstSearch bfs = new BreadthFirstSearch(g, 1);
        print(bfs.pathTo(5));
        print(bfs.pathTo(4));
        print(bfs.pathTo(6));
    }

    private void print(Iterable<Integer> vertices) {
        for (Integer v: vertices)
            System.out.print(v + " ");
        System.out.println();
    }
}
