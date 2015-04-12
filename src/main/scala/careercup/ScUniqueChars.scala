package careercup

/**
 * Implement an algorithm to determine if a string has all unique characters.
 *
 * Created by ahalikov on 12/04/15.
 */
object ScUniqueChars {
  def isUniqueChars(s:String): Boolean = {
    val chars = new Array[Boolean](256);
    for (i <- 0 until s.length) {
      val n:Int = s.charAt(i)
      if (chars(n))
        return false;
      else
        chars(n) = true;
    }
    true
  }

  def main (args: Array[String]) {
    test()
  }

  def test() = {
    assert(isUniqueChars("a") == true)
    assert(isUniqueChars("aa") == false)
    assert(isUniqueChars("abcdefg") == true)
    assert(isUniqueChars("monstrous creature appeared from the sea %@-±)|L") == false)
  }
}
