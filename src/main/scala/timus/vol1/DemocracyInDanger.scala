package timus.vol1

import java.util.Scanner

/**
 * acm.timus.ru #1025
 * Created by Artur on 02-Jan-15.
 */
object DemocracyInDanger {
  def main(args: Array[String]) {
    test()
    /*
    val in = new Scanner(System.in)
    val k:Byte = in.nextByte()
    val voters = in.nextLine().split(" ").map(_.toShort)
    minVoters(k, voters)
    in.close() */
  }
  
  def minVoters(k:Int, voters:Array[Short]):Int = {
    0    
  }
  
  def test() = {
    // 1
    assert(minVoters(1, Array[Short](1)) == 1, "(1, [1]) should be 1")
    // 2
    assert(minVoters(1, Array[Short](9999)) == 5000, "(1, [9,999]) should be 5,000")
    // 3
    assert(minVoters(3, Array[Short](5, 7, 5)) == 6, "(3, [5,7,5]) should be 6")
  }
}
