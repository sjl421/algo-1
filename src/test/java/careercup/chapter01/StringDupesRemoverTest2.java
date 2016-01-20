package careercup.chapter01;

import org.junit.Test;
import com.ahalikov.toolkit.utils.ArrayUtils;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class StringDupesRemoverTest2 {

    @Test
    public void testRemoveDupes4() throws Exception {
        assertNull(StringDupesRemover.removeDupes4(null));

        char[] s = new char[0];
        assertEquals(s, StringDupesRemover.removeDupes4(s));

        char[] actual;
        actual = StringDupesRemover.removeDupes4("abba".toCharArray());
        ArrayUtils.print(actual);

        actual = StringDupesRemover.removeDupes4("adammadamme".toCharArray());
        ArrayUtils.print(actual);

        actual = StringDupesRemover.removeDupes4("abcabcabcu".toCharArray());
        ArrayUtils.print(actual);
    }
}