package misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class EveryThirdIteratorTest {

    @Test
    public void testNext() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        final int size = 10;
        for (int i = 0; i < size; i++) numbers.add(i);
        EveryThirdIterator itr = new EveryThirdIterator(numbers.iterator());
        Assert.assertEquals(2, (int) itr.next());
        Assert.assertEquals(5, (int) itr.next());
        Assert.assertEquals(8, (int) itr.next());
        Assert.assertNull(itr.next());
    }
}