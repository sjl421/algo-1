package algo.stack

import org.scalatest.FunSuite

/**
 * Test for {@link FixedSizeStack}
 *
 * Created by ahalikov on 28/04/15.
 */
class FixedSizeStackTest extends FunSuite {
  test("push and pop basic test") {
    val stack = new FixedSizeStack[String](2)
    stack.push("one")
    stack.push("two")
    assert(stack.isEmpty == false)
    assert(stack.size() == 2)

    assert(stack.push("three") == false)

    assert("two".equals(stack.pop()))
    assert(stack.size() == 1)

    assert("one".equals(stack.pop()))
    assert(stack.size() == 0)
    assert(stack.isEmpty)
  }
}
