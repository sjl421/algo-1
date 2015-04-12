package careercup.chapter1

import com.google.common.base.Strings
import org.scalatest.FunSuite

/**
 * Implement an algorithm to determine if a string has all unique characters.
 *
 * Created by ahalikov on 12/04/15.
 */
object UniqueChars extends FunSuite {
  def isUniqueChars(str:String): Boolean = {
    if (Strings.isNullOrEmpty(str))
      throw new IllegalArgumentException("str is null or empty")
    val chars = new Array[Boolean](256);
    for (i <- 0 until str.length) {
      val n:Int = str.charAt(i)
      if (chars(n))
        return false;
      else
        chars(n) = true;
    }
    true
  }

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
