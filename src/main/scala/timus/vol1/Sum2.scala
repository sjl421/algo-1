package timus.vol1

import java.util.Scanner

/**
 * acm.timus.ru #1002
 * Created by Artur on 02-Jan-15.
 */
object Sum2 {
  def main(args: Array[String]) {
    //test()
    val in = new Scanner(System.in)
    println(sum(in.nextInt()))
    in.close()
  }
  
  def sum(n:Int):Long = {
    if (n == 0) {
      1      
    } else {
      val x:Int = math.abs(n)
      if (n > 0) ((x+1)*x)/2 else -1*(((x+1)*x)/2)+1
    }
  }
  
  def test() = {
    assert(sum(0) == 1, "when N=0 sum should be 1")
    assert(sum(1) == 1, "when N=1 sum should be 1")
    assert(sum(3) == 6, "when N=3 sum should be 6")
    assert(sum(-3) == -5, "when N=-3 sum should be -5")
    assert(sum(9999) == 49995000, "when N=9,999 sum should be 49995000")
    assert(sum(10000) == 50005000, "when N=10,000 sum should be 50005000")
    assert(sum(-10000) == -50004999, "when N=-10000 sum should be -50004999")
    println("so far so good")
  }
}
