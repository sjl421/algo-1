package algo.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TopViewTest {
  /**
   * Expected: 1 5 3 4 7
   */
  @Test
  public void testPrintTopView1() throws Exception {
    System.out.println();
    System.out.println("testPrintTopView1");
    System.out.println("expecting: 1 5 3 2 7");
    TopView.printTopView1(TreeExamples.tree1());
  }

  @Test
  public void testPrintTopView1a() throws Exception {
    System.out.println();
    System.out.println("testPrintTopView1a");
    System.out.println("expecting: 2 1 3 6");
    TopView.printTopView1(TreeExamples.tree2());
  }

  /**
   * Expected: 3 5 2 1 7
   */
  @Test
  public void testPrintTopView2() throws Exception {
    System.out.println();
    System.out.println("testPrintTopView2");
    System.out.println("expecting: 3 5 2 1 7");
    TopView.printTopView2(TreeExamples.tree1());
  }

  /**
   * Expected: 3 5 2 1 7
   */
  @Test
  public void testPrintTopView2a() throws Exception {
    System.out.println();
    System.out.println("testPrintTopView2a");
    System.out.println("expecting: 1 2 3 6");
    TopView.printTopView2(TreeExamples.tree2());
  }
}