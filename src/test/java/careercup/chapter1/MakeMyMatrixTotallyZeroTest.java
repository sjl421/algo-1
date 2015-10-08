package careercup.chapter1;

import org.junit.Test;
import com.ahalikov.toolkit.utils.ArrayUtils;

/**
 * Test for {@link MakeMyMatrixTotallyZero}
 *
 * @author ahalikov
 */
public class MakeMyMatrixTotallyZeroTest {

    @Test
    public void testProcess1() throws Exception {
        int[][] m = {{1,2,3}, {5,0,4}, {1,2,3}};
        int[][] result = MakeMyMatrixTotallyZero.process(m);
        int[][] expect = {{1,0,3}, {0,0,0}, {1,0,3}};
        ArrayUtils.assertMatrixEquals(expect, result);
    }

    @Test
    public void testProcess2() throws Exception {
        int[][] m = {{1,2,3}, {5,0,4}, {1,2,0}};
        int[][] result = MakeMyMatrixTotallyZero.process(m);
        int[][] expect = {{1,0,0}, {0,0,0}, {0,0,0}};
        ArrayUtils.assertMatrixEquals(expect, result);
    }

    @Test
    public void testProcess3() throws Exception {
        int[][] m = {{0,2}, {4,0}};
        int[][] result = MakeMyMatrixTotallyZero.process(m);
        int[][] expect = {{0,0}, {0,0}};
        ArrayUtils.assertMatrixEquals(expect, result);
    }
}