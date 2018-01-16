package rand;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static rand.PercentageSplit.split;

public class PercentageSplitTest {

  @Test
  public void testSplit() throws Exception {
    FlipCounter counter;
    double delta = 0.1;

    counter = play(100);
    System.out.println(counter);
    assertEquals(100, counter.eaglesPercentage(), 0);
    assertEquals(0, counter.tailsPercentage(), 0);

    counter = play(99);
    System.out.println(counter);
    assertEquals(99, counter.eaglesPercentage(), delta);
    assertEquals(1, counter.tailsPercentage(), delta);

    counter = play(0);
    System.out.println(counter);
    assertEquals(0, counter.eaglesPercentage(), 0);
    assertEquals(100, counter.tailsPercentage(), 0);

    counter = play(50);
    System.out.println(counter);
    assertEquals(50, counter.eaglesPercentage(), delta);
    assertEquals(50, counter.tailsPercentage(), delta);

    counter = play(1);
    System.out.println(counter);
    assertEquals(1, counter.eaglesPercentage(), delta);
    assertEquals(99, counter.tailsPercentage(), delta);

    counter = play(25);
    System.out.println(counter);
    assertEquals(25, counter.eaglesPercentage(), delta);
    assertEquals(75, counter.tailsPercentage(), delta);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNegative() throws Exception {
    play(-200);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGreaterThan100() throws Exception {
    play(200);
  }

  private static FlipCounter play(int percentage) {
    int numberOfTests = 10_000_000;
    FlipCounter counter = new FlipCounter(numberOfTests);

    for (int i = 0; i < numberOfTests; i++) {
      boolean result = split(percentage);
      counter.setFlip(result);
    }
    return counter;
  }

  static class FlipCounter {
    double eagles;
    double tails;
    int seed;

    FlipCounter(int seed) {
      this.seed = seed;
    }

    void setFlip(boolean value) {
      if (value) {
        eagles++;
      } else {
        tails++;
      }
    }

    double eaglesPercentage() {
      return eagles / seed * 100;
    }

    double tailsPercentage() {
      return tails / seed * 100;
    }

    @Override
    public String toString() {
      return "flips{" +
          "eagles=" + eagles +
          ", tails=" + tails +
          '}';
    }
  }
}