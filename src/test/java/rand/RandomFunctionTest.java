package rand;

import org.junit.Test;

/**
 * Test for {@link RandomFunction}
 *
 * Created by akhalikov on 23.09.2015.
 */
public class RandomFunctionTest {

  static final int COUNT_TESTS = 1_000_000;

  @Test
  public void testFrand() throws Exception {
    System.out.println("testFrand");
    double[] res = new double[2];
    for (int i = 0; i < COUNT_TESTS; i++) {
      int k = RandomFunction.frand();
      res[k]++;
    }
    System.out.println("0=" + res[0] / COUNT_TESTS * 100);
    System.out.println("1=" + res[1] / COUNT_TESTS * 100);
  }

  @Test
  public void testFrand4() throws Exception {
    System.out.println("testFrand4");
    double[] res = new double[4];
    for (int i = 0; i < COUNT_TESTS; i++) {
      int k = RandomFunction.frand4();
      res[k]++;
    }
    System.out.println("0=" + res[0] / COUNT_TESTS * 100);
    System.out.println("1=" + res[1] / COUNT_TESTS * 100);
    System.out.println("2=" + res[2] / COUNT_TESTS * 100);
    System.out.println("3=" + res[3] / COUNT_TESTS * 100);
  }

  @Test
  public void testFrand3() throws Exception {
    System.out.println("testFrand3");
    double[] res = new double[3];
    for (int i = 0; i < COUNT_TESTS; i++) {
      int k = RandomFunction.frand3();
      res[k]++;
    }
    System.out.println("0=" + res[0] / COUNT_TESTS * 100);
    System.out.println("1=" + res[1] / COUNT_TESTS * 100);
    System.out.println("2=" + res[2] / COUNT_TESTS * 100);
  }
}
