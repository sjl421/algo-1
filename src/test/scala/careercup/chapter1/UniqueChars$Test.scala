package careercup.chapter1

import org.scalatest.FunSuite

/**
 * Created by ahalikov on 12/04/15.
 */
class UniqueChars$Test extends FunSuite {
  test("Empty string should produce IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      UniqueChars.isUniqueChars("")
    }
  }

  test("Simple positive tests") {
    assert(UniqueChars.isUniqueChars("a") == true)
    assert(UniqueChars.isUniqueChars("abcdefg") == true)
  }

  test("Simple negative tests") {
    assert(UniqueChars.isUniqueChars("aa") == false)
    assert(UniqueChars.isUniqueChars("&&") == false)
    assert(UniqueChars.isUniqueChars("monstrous creature appeared from the sea %@-±)|L") == false)
  }
}
