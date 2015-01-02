package timus.vol1

import java.util.Scanner

/**
 * acm.timus.ru #1000
 * Created by Artur on 01-Jan-15.
 */
object Sum {
  def main(args: Array[String]):
  Unit = {
    val in = new Scanner(System.in)
    println(in.nextInt() + in.nextInt())
    in.close()
  }
}
