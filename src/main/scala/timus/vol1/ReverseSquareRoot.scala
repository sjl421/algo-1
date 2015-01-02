package timus.vol1

import scala.io.{BufferedSource, Source}

/**
 * acm.timus.ru #1001
 * Created by Artur on 01-Jan-15.
 */
object ReverseSquareRoot {
  def main(args: Array[String]) {
    test()
    //solve(Source.stdin)
  }
  
  def solve(source: BufferedSource) = {
      val longs = source.getLines()
        .flatMap(
          _.split(" ").filter(!_.isEmpty).map(_.toLong))
        .toArray
      println(longs.reverse.map(t => math.sqrt(t)).mkString("\n"))
  }
  
  def test() = {
    solve(Source.fromFile("data/timus/vol1/1001-1.txt"))
  }
}