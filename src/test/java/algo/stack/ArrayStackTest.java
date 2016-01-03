package algo.stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author akhalikov
 */
public class ArrayStackTest {

  @Test
  public void testMain() throws Exception {
    ArrayStack<Integer> stack = new ArrayStack(3);
    assertTrue(stack.isEmpty());
    assertTrue(stack.push(1));
    assertTrue(stack.push(2));
    assertTrue(stack.push(3));
    assertFalse(stack.isEmpty());
    assertEquals(3, (int) stack.pop());
    assertEquals(2, (int) stack.pop());
    assertEquals(1, stack.size());
    assertFalse(stack.isEmpty());
    assertEquals(1, (int) stack.peek());
    assertEquals(1, (int) stack.pop());
    assertTrue(stack.isEmpty());
  }
}