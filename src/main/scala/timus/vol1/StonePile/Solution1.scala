package timus.vol1.StonePile

import java.util.Scanner

/**
 * acm.timus.ru #1005
 * Created by artur on 09.01.15.
 */
object Solution1 {
  def main(args: Array[String]) {
    test()
    //solve()
  }

  def solve() {
    val in = new Scanner(System.in)
    val n = in.nextLine().toInt
    val weights = in.nextLine().split(" ").map(_.toInt).toArray
    println(minWeight(n, weights))
    in.close()
  }

  def minWeight(n:Int, weights:Array[Int]): Int = {
    0
  }

  def test() {
    // test 1
    assert(minWeight(5, Array(5, 8, 13, 27, 14)) == 3, "test 1")
  }
}
