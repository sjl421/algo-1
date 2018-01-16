package strings;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;

public class WordDistanceFinderTest {
  @Test
  public void testDistance() throws Exception {
    WordDistanceFinder finder = new WordDistanceFinder(asList("the", "quick", "brown", "fox", "quick"));

    assertEquals(3, finder.distance("fox", "the"));
    assertEquals(1, finder.distance("quick", "fox"));
  }
}