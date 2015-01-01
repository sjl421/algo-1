package timus.vol1

import java.util.Scanner

/**
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
