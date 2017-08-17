package algo.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class FixedArrayStackTest {

  @Test
  public void test1() throws Exception {
    FixedArrayStack<Integer> stack = new FixedArrayStack(3);
    assertTrue(stack.isEmpty());
    stack.push(1);
    stack.push(2);
    stack.push(3);
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