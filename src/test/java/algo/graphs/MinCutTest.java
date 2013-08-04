package algo.graphs;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Tests {@link algo.graphs.MinCut}
 *
 * @author Artur Khalikov
 */
public class MinCutTest {

    @Test
    public void test0() throws Exception {
        Graph graph = Graph.createFromFile("D:/work/study/algo/data/test0.txt");
        assertNotNull("input graph is null", graph.getArray());
        int actual = new MinCut(graph).findMinCut();
        int expected = 2;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void test1() throws Exception {
        Graph graph = Graph.createFromFile("D:/work/study/algo/data/test1.txt");
        assertNotNull("input graph is null", graph.getArray());
        int actual = new MinCut(graph).findMinCut();
        int expected = 2;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void test2() throws Exception {
        Graph graph = Graph.createFromFile("D:/work/study/algo/data/test2.txt");
        assertNotNull("input graph is null", graph.getArray());
        int actual = new MinCut(graph).findMinCut();
        int expected = 2;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void test3() throws Exception {
        Graph graph = Graph.createFromFile("D:/work/study/algo/data/test3.txt");
        assertNotNull("input graph is null", graph.getArray());
        int actual = new MinCut(graph).findMinCut();
        int expected = 1;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void test4() throws Exception {
        Graph graph = Graph.createFromFile("D:/work/study/algo/data/test4.txt");
        assertNotNull("input graph is null", graph.getArray());
        int actual = new MinCut(graph).findMinCut();
        int expected = 3;
        assertEquals("Min cut edges", expected, actual);
    }

    @Test
    public void testAssignment3() throws Exception {
        Graph graph = Graph.createFromFile("D:/work/study/algo/data/kargerMinCut.txt");
        assertNotNull("input graph is null", graph.getArray());
        int actual = new MinCut(graph).findMinCut();
        System.out.println("testAssignment3: " + actual);
        //int expected = 3;
        //assertEquals("Min cut edges", expected, actual);
    }
}
