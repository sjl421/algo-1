package algo.stack

import org.scalatest.FunSuite

/**
 * Test for {@link FixedSizeStack}
 *
 * @author akhalikov
 */
class FixedSizeStackTest extends FunSuite {
  test("push and pop basic test") {
    val stack = new ArrayStack[String](3)
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
