package algo.graphs.problems;

import algo.graphs.DiGraph;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;


/**
 * @author: Artur Khalikov
 */
public class SCCTest {

    private static final String DATA_DIR = "D:/work/study/algo/data/";
    private static final String[] TESTS = {"scc0", "scc1", "scc2"};
    private static final int[][] TEST_ANSWERS = {
            {3,3,3,0,0},
            {3,3,2,0,0},
            {3,3,1,1,0}
    };
    private static final String ASSIGNMENT = "scc.txt";

    @Test
    public void testSolve() throws Exception {
        for (String testName: TESTS) {
            String fileName = DATA_DIR + testName + ".txt";
            DiGraph graph = new DiGraph(new File(fileName));
            assertNotNull("graph is null", graph);
            graph.print();

            //SCC scc = new SCC(graph);
            //int[] expected = {3,3,3,0,0};
            //assertArrayEquals("Test: " + fileName, actual, expected);
        }
    }

    @Test
    public void testSolveAssignment() throws Exception {
        String fileName = DATA_DIR + ASSIGNMENT;
        DiGraph graph = new DiGraph(new File(fileName));
        assertNotNull("graph is null", graph);

        System.out.println("Test completed");

        //UGraph graph = new UGraph(matrix);
        //int[] actual = new SccProblem(graph).solve();
    }
}