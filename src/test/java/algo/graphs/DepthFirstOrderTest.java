package algo.graphs;

import algo.graphs.problems.Top5SCC;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test {@link DepthFirstOrder}
 *
 * @author Artur Khalikov
 */
public class DepthFirstOrderTest {
    private static final String DATA_DIR = "D:/work/study/algo/data/";
    private static final String[] TESTS = {"scc0", "scc1", "scc2", "scc3", "scc4"};
    private static final int[][] EXPECTED_POST = {
            {4, 3, 5, 2, 8, 6, 9, 7, 1},
            {2, 3, 1, 8, 7, 6, 5, 4},
            {2, 3, 1, 5, 7, 8, 6, 4},
            {2, 5, 7, 8, 6, 4, 3, 1},
            {1, 4, 5, 2, 6, 3, 8, 11, 12, 10, 9, 7}
    };
    private static final int[][] EXPECTED_REVERSED_POST = {
            {1, 7, 9, 6, 8, 2, 5, 3, 4},
            {4, 5, 6, 7, 8, 1, 3, 2},
            {4, 6, 8, 7, 5, 1, 3, 2},
            {1, 3, 4, 6, 8, 7, 5, 2},
            {7, 9, 10, 12, 11, 8, 3, 6, 2, 5, 4, 1}
    };

    @Test
    public void test() throws Exception {
        for (int i=0; i < TESTS.length; i++) {
            String fileName = DATA_DIR + "scc" + i + ".txt";
            System.out.print("Testing: " + fileName);
            Graph graph = Top5SCC.readGraph(fileName);
            assertNotNull("graph is null", graph);

            Graph reverse = graph.reverse();
            DepthFirstOrder order = new DepthFirstOrder(reverse);
            assertTrue(equals(order.getPostOrder(), EXPECTED_POST[i]));
            assertTrue(equals(order.getReversePostOrder(), EXPECTED_REVERSED_POST[i]));
            System.out.println("...OK");
        }
    }

    private boolean equals(Iterable<Integer> iterable, int[] array) {
        int i = 0;
        for (int item: iterable) {
            if (item != array[i])
                return false;
            i++;
        }
        return true;
    }
}
