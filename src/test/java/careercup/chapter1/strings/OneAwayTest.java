package careercup.chapter1.strings;

import org.junit.Test;
import org.scalautils.One;

import static org.junit.Assert.*;

/**
 * @author akhalikov
 */
public class OneAwayTest {
  @Test
  public void testIsOneAway() throws Exception {
    assertTrue(OneAway.isOneAway("pale", "bale"));
    assertTrue(OneAway.isOneAway("pales", "pale"));
    assertTrue(OneAway.isOneAway("pale", "ple"));

    assertFalse(OneAway.isOneAway("pale", "paaaale"));
    assertFalse(OneAway.isOneAway("bake", "pale"));
    assertFalse(OneAway.isOneAway("omega", "meg"));
  }
}