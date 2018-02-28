package interview.queue;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaxIntQueueTest {
  @Test
  public void testEnqueue() throws Exception {
    MaxIntQueue queue = new MaxIntQueue();
    queue.enqueue(1);
    queue.enqueue(2);

    assertEquals(1, queue.dequeue());
    assertEquals(2, queue.dequeue());
    assertTrue(queue.isEmpty());
  }

  @Test
  public void testMax() throws Exception {
    MaxIntQueue queue = new MaxIntQueue();

    int expectedMax = 8;
    queue.enqueue(0);
    queue.enqueue(expectedMax);
    queue.enqueue(5);
    queue.enqueue(-8);
    queue.enqueue(2);

    assertEquals(expectedMax, queue.max());
  }

  @Test
  public void testDequeueChangesMax() throws Exception {
    MaxIntQueue queue = new MaxIntQueue();

    int max = 3;
    queue.enqueue(max);
    queue.enqueue(0);
    queue.enqueue(2);

    queue.dequeue();

    assertEquals(2, queue.max());
  }
}