package algo.queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link LinkedDequeue}
 *
 * @author akhalikov
 */
public class LinkedDequeueTest {

  @Test
  public void testAddFirst() throws Exception {
    Dequeue<String> dequeue = new LinkedDequeue();
    dequeue.addFirst("1");
    dequeue.addLast("100");
    assertEquals("1", dequeue.peekFirst());
    assertEquals("100", dequeue.peekLast());
    assertEquals(2, dequeue.size());
  }

  @Test
  public void testRemoveFirst() throws Exception {
    Dequeue<String> dequeue = new LinkedDequeue();
    dequeue.addFirst("2");
    dequeue.addFirst("1");
    dequeue.addLast("100");
    assertEquals(3, dequeue.size());
    assertEquals("1", dequeue.removeFirst());
    assertEquals(2, dequeue.size());
    assertEquals("2", dequeue.peekFirst());
  }
}
