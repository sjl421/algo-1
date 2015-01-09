package timus.vol1.Factorials

import java.util.Scanner

/**
 * acm.timus.ru #1083
 * Created by artur on 09.01.15.
 */
object Solution2 {

  def main(args: Array[String]) {
    val in = new Scanner(System.in)
    val s = in.nextLine().split(" ")

    var n = s(0).toInt
    val k = s(1).length.toInt
    var fac = 1
    while (n > 0) {
      fac *= n
      n -= k
    }
    println(fac)
    in.close()
  }
}