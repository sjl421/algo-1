package misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class EvenIteratorTest {

    @Test
    public void testEvenIterator() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        final int size = 13000;
        for (int i = 0; i < size; i++) numbers.add(i);
        EvenIterator itr = new EvenIterator(numbers.iterator());
        int count = 0;
        while (itr.hasNext()) {
            int n = itr.next();
            Assert.assertTrue(n + " even check", n % 2 == 0);
            count++;
        }
        Assert.assertEquals("Iterator size check", size / 2, count);
    }
}