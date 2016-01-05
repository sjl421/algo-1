package algo.stack

import org.scalatest.FunSuite

/**
 * Test for {@link FixedArrayStack}
 *
 * @author akhalikov
 */
class FixedArrayStackTest extends FunSuite {
  test("push and pop basic test") {
    val stack = new FixedArrayStack[String](3)
    stack.push("one")
    stack.push("two")
    assert("two".equals(stack.peek()))
    assert(stack.isEmpty == false)
    assert(stack.push("three") == true)
    assert("three".equals(stack.peek()))
    assert("three".equals(stack.pop()))
    assert("two".equals(stack.pop()))
    assert("one".equals(stack.pop()))
    assert(stack.isEmpty)
  }
}
