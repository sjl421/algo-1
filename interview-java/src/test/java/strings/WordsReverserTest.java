package strings;

import com.google.common.collect.Lists;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static strings.WordsReverser.reverse;
import static strings.WordsReverser.reverse2;

public class WordsReverserTest {
  @Test
  public void testReverse() throws Exception {
    assertEquals("", reverse(""));
    assertEquals("loneliness", reverse("loneliness"));
    assertEquals("awesome! are Interviews",
      reverse("   Interviews are awesome!   "));
  }

  @Test
  public void testReverse2() throws Exception {
    assertEquals("", reverse2(""));
    assertEquals("   ", reverse2("   "));
    assertEquals("a", reverse2("   a"));
    assertEquals("loneliness", reverse2("loneliness"));
    assertEquals("awesome! are Interviews",
      reverse2("  Interviews are awesome!  "));
  }

  @Test
  public void testReverse3() throws Exception {
    char[] chars = "hello, world!".toCharArray();
    WordsReverser.reverse3(chars);
    Lists.newArrayList(chars).forEach(System.out::println);
    assertArrayEquals("world! hello,".toCharArray(), chars);
  }
}