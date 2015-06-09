package careercup.chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class MinStackTest {

    @Test
    public void testPop() throws Exception {
        MinStack<Integer> stack = new MinStack();
        stack.push(2);
        stack.push(3);
        stack.push(154);
        assertEquals(Integer.valueOf(154), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    public void testMin() throws Exception {
        MinStack<Integer> stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(154);
        assertEquals(3, stack.size());
        assertEquals(Integer.valueOf(2), stack.min());
        stack.push(-6);
        assertEquals(Integer.valueOf(-6), stack.min());
    }
}