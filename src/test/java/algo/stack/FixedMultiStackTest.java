package algo.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class FixedMultiStackTest {

  @Test
  public void test1() throws Exception {
    int numberOfStacks = 3;
    MultiStack<String> multiStack = new FixedMultiStack(10, numberOfStacks);
    for (int i = 1; i <= numberOfStacks; i++) {
      assertTrue(multiStack.isEmpty(i));
    }

    multiStack.push(1, "hello");
    multiStack.push(1, "dance");
    multiStack.push(1, "omg omg omg");
    assertFalse(multiStack.isEmpty(1));

    multiStack.push(2, "om");
    multiStack.push(2, "yoga");
    assertFalse(multiStack.isEmpty(2));

    multiStack.push(3, "climb");
    multiStack.push(3, "high");
    assertFalse(multiStack.isEmpty(3));

    assertEquals("omg omg omg", multiStack.pop(1));
    assertEquals("dance", multiStack.pop(1));
    assertEquals("hello", multiStack.pop(1));
    assertTrue(multiStack.isEmpty(1));
  }

  @Test(expected = RuntimeException.class)
  public void test2() throws Exception {
    MultiStack<String> multiStack = new FixedMultiStack(10, 2);
    multiStack.pop(1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void test3() throws Exception {
    MultiStack<String> multiStack = new FixedMultiStack(10, 2);
    multiStack.push(3, "test");
  }
}