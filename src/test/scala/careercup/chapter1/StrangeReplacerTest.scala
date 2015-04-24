package careercup.chapter1

import org.scalatest.FunSuite
import org.junit.Assert._

/**
 * Created by ahalikov on 24/04/15.
 */
class StrangeReplacerTest extends FunSuite {
  test("replace test") {
    assertEquals("", StrangeReplacer.replace(""))
    assertEquals("%20", StrangeReplacer.replace(" "))
  }
}
