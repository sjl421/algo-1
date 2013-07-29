package algo.graphs;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Tests {@link Graph}
 *
 * @author Artur Khalikov
 */
public class GraphTest {

    @Test
    public void test0() throws Exception {
        Graph g = Graph.createFromFile("D:/work/study/algo/data/test0.txt");
        assertNotNull("min cut is null", g.get());
        int actual = g.findMinCut();
        int expected = 2;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void test1() throws Exception {
        Graph g = Graph.createFromFile("D:/work/study/algo/data/test1.txt");
        assertNotNull("min cut is null", g.get());
        int actual = g.findMinCut();
        int expected = 2;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void test2() throws Exception {
        Graph g = Graph.createFromFile("D:/work/study/algo/data/test2.txt");
        assertNotNull("min cut is null", g.get());
        int actual = g.findMinCut();
        int expected = 2;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void test3() throws Exception {
        Graph g = Graph.createFromFile("D:/work/study/algo/data/test3.txt");
        assertNotNull("min cut is null", g.get());
        int actual = g.findMinCut();
        int expected = 1;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void test4() throws Exception {
        Graph g = Graph.createFromFile("D:/work/study/algo/data/test4.txt");
        assertNotNull("min cut is null", g.get());
        int actual = g.findMinCut();
        int expected = 3;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void testAssignment3() throws Exception {
        Graph g = Graph.createFromFile("D:/work/study/algo/data/kargerMinCut.txt");
        assertNotNull("min cut is null", g.get());
        int actual = g.findMinCut();
        System.out.println("testAssignment3: " + actual);
        //int expected = 3;
        //assertEquals("Min cut edges", expected, actual);
    }
}
