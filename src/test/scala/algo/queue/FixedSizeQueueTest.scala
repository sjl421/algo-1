package algo.queue

import org.scalatest.FunSuite

/**
 * Test for {@link FixedSizeQueue}
 *
 * Created by ahalikov on 29/04/15.
 */
class FixedSizeQueueTest extends FunSuite {

  test("basic test") {

    val q:FixedSizeQueue[String] = new FixedSizeQueue[String](3);
    q.enqueue("One");
    q.enqueue("Two");
    q.enqueue("Three");

    assert(q.size() == 3);
    assert(!q.isEmpty);

    assert("One".equals(q.dequeue()));
    assert(q.size() == 2);
  }

}
