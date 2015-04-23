package algo;

import org.junit.Test;
import util.ArrayUtils;

import static org.junit.Assert.*;

public class MergeArraysTest {

    @Test
    public void testMerge() throws Exception {
        int[] arr1 = {1, 4, 5, 8};
        int[] arr2 = {2, 3, 6, 7};
        int[] res = MergeArrays.merge(arr1, arr2);
        ArrayUtils.print(res);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, res);

        arr1 = new int[] {1, 4, 5, 8};
        arr2 = new int[] {2, 3};
        res = MergeArrays.merge(arr1, arr2);
        ArrayUtils.print(res);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 8}, res);
    }
}