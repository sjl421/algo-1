package algo.graphs.problems;

import org.junit.Test;
import util.InputFile;

import static junit.framework.Assert.assertEquals;

/**
 * Tests {@link TwoSum}
 *
 * @author Artur Khalikov
 */
public class TwoSumTest {
    private static final String DATA_DIR = "D:/work/study/algo/data/";
    private static final String[] TESTS = {"2sum1", "2sum2"};
    private static final int[] EXPECTED = {3, 5};

    @Test
    public void test() throws Exception {
        for (int i = 0; i < TESTS.length; i++) {
            String fileName = DATA_DIR + TESTS[i] + ".txt";
            int actual = new TwoSum(fileName).getTargetNumber();
            assertEquals(EXPECTED[i], actual);
        }
    }
}
