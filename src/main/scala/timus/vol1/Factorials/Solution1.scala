package timus.vol1.Factorials

import java.util.Scanner

/**
 * acm.timus.ru #1083 
 * Created by Artur on 02-Jan-15.
 */
object Solution1 {
  def main(args: Array[String]) {
    test()
    //solve()
  }

  def solve() {
    val in = new Scanner(System.in)
    val s = in.nextLine().split(" ")
    println(fac(s(0).toInt, s(1).length.toInt))
    in.close()
  }

  // first wrong attempt
  def fac_wrong(n:Int, k:Int):Int = {
    var res = n
    for (i <- Range(1, n/k)) {
      res *= n - i*k
    }
    res
  }

  // second attempt, working
  def fac(n:Int, k:Int):Int = {
    var res = 1
    var n1 = n
    while (n1 > 0) {
      res *= n1
      n1 -= k
    }
    res
  }
  
  def test() {
    assert(fac(1, 1) == 1, "(1,1) should be 1")
    assert(fac(1, 20) == 1, "(1,10) should be 1")
    assert(fac(10, 9) == 10, "(10,19) should be 10")
    assert(fac(5, 3) == 10, "(5,3) should be 10")
    assert(fac(3, 1) == 6, "(3,1) should be 6")
    assert(fac(9, 2) == 945, "(9,2) should be 945")
    assert(fac(10, 1) == 3628800, "(10,1) should be 3628800")
  }
}