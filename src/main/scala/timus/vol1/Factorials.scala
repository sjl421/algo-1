package timus.vol1

import java.util.Scanner

/**
 * acm.timus.ru #1083 
 * Created by Artur on 02-Jan-15.
 */
object Factorials {
  def main(args: Array[String]) {
    //test()
    val in = new Scanner(System.in)
    val s = in.nextLine().split(" ")
    println(solve(s(0).toByte, s(1).length.toByte))
    in.close()
  }
  
  def solve(n:Byte, k:Byte):Int = {
    println(n, k)
    0
  }
  
  def test() = {
    assert(solve(9.toByte, 2.toByte) == 945, "(9,2) should be 945")
  }
}
