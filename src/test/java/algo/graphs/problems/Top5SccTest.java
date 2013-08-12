package algo.graphs.problems;

import algo.graphs.DiGraph;
import algo.graphs.Graph;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;


/**
 * @author: Artur Khalikov
 */
public class Top5SccTest {

    private static final String DATA_DIR = "D:/work/study/algo/data/";
    private static final String[] TESTS = {"scc0", "scc1", "scc2", "scc3", "scc4"};
    private static final int[][] EXPECTED = {
            {3,3,3,0,0},
            {3,3,2,0,0},
            {3,3,1,1,0},
            {7,1,0,0,0},
            {6,3,2,1,0}
    };
    private static final String ASSIGNMENT = "scc.txt";

    @Test
    public void test() throws Exception {
        for (int i=0; i < TESTS.length; i++) {
            String fileName = DATA_DIR + "scc" + i + ".txt";
            System.out.print("Testing: " + fileName);
            Graph graph = Top5Scc.readGraph(fileName);
            assertNotNull("graph is null", graph);

            Top5Scc scc = new Top5Scc(graph);
            int[] actual = scc.getTop5SccSizes();
            assertArrayEquals(EXPECTED[i], actual);
            System.out.println("...OK");
        }
    }

    @Test
    public void testSolveAssignment() throws Exception {
        String fileName = DATA_DIR + ASSIGNMENT;
        Graph graph = Top5Scc.readGraph(fileName);
        assertNotNull("graph is null", graph);

        Top5Scc scc = new Top5Scc(graph);
        for (int s: scc.getTop5SccSizes())
            System.out.println(s + " ");
    }
}