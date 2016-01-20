package careercup.chapter01

import junit.framework.Assert.assertEquals
import org.scalatest.FunSuite

/**
 * Test for {@link StringDupesRemover}
 * Created by ahalikov on 24/04/15.
 */
class StringDupesRemoverTest extends FunSuite {

  test("removeDupes null test") {
    intercept[IllegalArgumentException] {
      StringDupesRemover.removeDupes(null)
    }
  }

  test("removeDupes basic tests") {
    assertEquals("", StringDupesRemover.removeDupes(""))
    assertEquals("a", StringDupesRemover.removeDupes("aa"))
    assertEquals("xyz", StringDupesRemover.removeDupes("xyz"))
    assertEquals("SabrCd", StringDupesRemover.removeDupes("SabraCaddabra"))
  }

  test("removeDupes2 null test") {
    intercept[IllegalArgumentException] {
      StringDupesRemover.removeDupes2(null)
    }
  }

  test("removeDupes2 basic tests") {
    assertEquals("Empty string", "", StringDupesRemover.removeDupes2(""))
    assertEquals("String without any duplicates", "xyze", StringDupesRemover.removeDupes2("xyze"))
    assertEquals("String: SabraCaddabra", "SabrCd", StringDupesRemover.removeDupes2("SabraCaddabra"))
    assertEquals("Continuous duplicates: aaaaabbbbbbcccccc", "abc", StringDupesRemover.removeDupes2("aaaaabbbbbbcccccc"))
  }

  test("removeDupes3 null tests") {
    intercept[IllegalArgumentException] {
      StringDupesRemover.removeDupes3(null)
    }
  }

  test("testRemoveDupes3 basic tests") {
    assertEquals("Empty string", "", StringDupesRemover.removeDupes3(""))
    assertEquals("String without any duplicates", "xyze", StringDupesRemover.removeDupes3("xyze"))
    assertEquals("String: SabraCaddabra", "SabrCd", StringDupesRemover.removeDupes3("SabraCaddabra"))
    assertEquals("Continuous duplicates: aaaaabbbbbbcccccc", "abc", StringDupesRemover.removeDupes3("aaaaabbbbbbcccccc"))
  }
}