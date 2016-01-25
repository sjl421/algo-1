package careercup.other.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ConvertArray}
 *
 * Created by akhalikov on 24/01/16
 */
public class ConvertArrayTest {
  @Test
  public void testConvert() throws Exception {
    String[] a = {"a1", "a2", "a3", "b1", "b2", "b3", "c2", "c2", "c3"};
    String[] expected = {"a1", "b1", "c1", "a2", "b2", "c2", "a3", "b3", "c3"};

    String[] converted = ConvertArray.convert(a);
    for (int i = 0; i < converted.length; i++) {
      assertEquals(expected[i] + "!=" + converted[i], expected[i], converted[i]);
    }
  }
}