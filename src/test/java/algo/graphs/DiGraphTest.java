package algo.graphs;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author: Artur Khalikov
 */
public class DiGraphTest {

    @Test
    public void testReverse() throws Exception {
        DiGraph graph = new DiGraph(4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        System.out.println("------ Graph ------");
        graph.print();

        DiGraph reverse = graph.reverse();
        System.out.println("------ Reversed graph ------");
        reverse.print();
    }
}
