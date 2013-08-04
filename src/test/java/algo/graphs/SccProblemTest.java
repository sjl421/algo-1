package algo.graphs;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * @author: Artur Khalikov
 */
public class SccProblemTest {
    @Test
    public void testFindScc0() throws Exception {
        Graph graph = Graph.createFromFile("/work/study/algo/data/scc0.txt");
        assertNotNull("input graph is null", graph.getArray());
        graph.print();
    }
}
