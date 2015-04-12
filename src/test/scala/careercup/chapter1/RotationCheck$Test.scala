package careercup.chapter1

import org.scalatest.FunSuite

/**
 * Created by ahalikov on 12/04/15.
 */
class RotationCheck$Test extends FunSuite {
  test("Positive tests") {
    assert(RotationCheck.isRotation("waterbottle", "erbottlewat") == true)
  }
}
