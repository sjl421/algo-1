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
    q.add("One");
    q.add("Two");
    q.add("Three");

    assert(q.size() == 3);
    assert(!q.isEmpty);

    assert("One".equals(q.remove()));
    assert(q.size() == 2);
  }

}
