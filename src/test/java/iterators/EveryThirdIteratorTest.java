package iterators;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Test for {@link EveryThirdIterator}
 *
 * @author ahalikov
 */
public class EveryThirdIteratorTest {
  @Test
  public void testNext() throws Exception {
    EveryThirdIterator itr = new EveryThirdIterator(getIterator(10));
    Assert.assertEquals(2, (int) itr.next());
    Assert.assertEquals(5, (int) itr.next());
    Assert.assertEquals(8, (int) itr.next());
  }

  @Test(expected = NoSuchElementException.class)
  public void testNext2() throws Exception {
    EveryThirdIterator itr = new EveryThirdIterator(getIterator(0));
    itr.next();
  }

  Iterator getIterator(int size) {
    List<Integer> numbers = new ArrayList();
    for (int i = 0; i <= size; i++)
      numbers.add(i);
    return numbers.iterator();
  }
}