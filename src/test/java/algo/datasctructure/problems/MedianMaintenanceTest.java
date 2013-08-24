package algo.datasctructure.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Test {@link MedianMaintenance}
 *
 * @author Artur Khalikov
 */
public class MedianMaintenanceTest {
    private static final String DATA_DIR = "D:/work/study/algo/data/";
    private static final String[] TESTS = {"Median1", "Median2"};
    private static final long[] EXPECTED = {23, 54};

    @Test
    public void test() throws Exception {
        for (int i = 0; i < TESTS.length; i++) {
            String fileName = DATA_DIR + TESTS[i] + ".txt";
            long actual = new MedianMaintenance(fileName).getSum();
            assertEquals(EXPECTED[i], actual);
        }
    }
}
