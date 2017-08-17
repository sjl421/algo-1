package algo.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedStackTest {
  @Test
  public void testPushPop() throws Exception {
    Stack<String> stack = new LinkedStack<>();
    assertTrue(stack.isEmpty());
    stack.push("bottom");
    stack.push("middle");
    stack.push("head");
    assertFalse(stack.isEmpty());
    assertEquals("head", stack.pop());
    assertEquals("middle", stack.pop());
    assertEquals("bottom", stack.pop());
    assertTrue(stack.isEmpty());
  }

  @Test
  public void testPeek() throws Exception {
    Stack<String> stack = new LinkedStack<>();
    assertTrue(stack.isEmpty());
    stack.push("bottom");
    stack.push("middle");
    stack.push("head");
    assertEquals("head", stack.peek());
    assertEquals("head", stack.peek());
    assertEquals("head", stack.pop());
    assertFalse(stack.isEmpty());
    assertEquals("middle", stack.pop());
    assertEquals("bottom", stack.pop());
    assertTrue(stack.isEmpty());
  }
}