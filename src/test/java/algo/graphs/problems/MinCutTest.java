package algo.graphs.problems;

import algo.graphs.UGraph;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import util.InputFile;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Tests {@link MinCut}
 *
 * @author Artur Khalikov
 */
public class MinCutTest {

    private static final String DATA_DIR = "D:/work/study/algo/data/";
    private static final ImmutableMap<String, Integer> TESTS = ImmutableMap.of(
            "test0", 2,
            "test1", 2,
            "test2", 2,
            "test3", 1,
            "test4", 3);

    private static final String MIN_CUT_INPUT = "kargerMinCut.txt";

    @Test
    public void testSolve() throws Exception {
        System.out.println("Basic tests");

        for (Map.Entry<String, Integer> test: TESTS.entrySet()) {
            String fileName = DATA_DIR + test.getKey() + ".txt";
            System.out.println("Testing " + fileName);

            int[][] matrix = new InputFile(fileName).getAdjacentMatrix();
            assertNotNull("input array  is null", matrix);

            UGraph graph = new UGraph(matrix);
            int actual = new MinCut(graph).solve();
            int expected = test.getValue();
            assertEquals("Min cut edges", expected, actual);
        }
    }

    @Test
    public void testSolveAssignment() throws Exception {
        int[][] matrix = new InputFile(DATA_DIR + MIN_CUT_INPUT).getAdjacentMatrix();
        assertNotNull("input array is null", matrix);

        UGraph graph = new UGraph(matrix);
        int actual = new MinCut(graph).solve();
        System.out.println("testAssignment: " + actual);
    }
}
