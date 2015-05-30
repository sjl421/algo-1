package algo.lists;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class SLinkedListTest {

    @Test
    public void testConstruct() throws Exception {
        SLinkedList<Integer> list = new SLinkedList<>(1, 2, 3);
        assertEquals(Integer.valueOf(1), list.getFirst());
    }

    @Test
    public void testAddFirst() throws Exception {
        SLinkedList<Integer> list = new SLinkedList<>(5, 6, 7);
        list.addFirst(1);
        assertEquals(Integer.valueOf(1), list.getFirst());
    }

    @Test
    public void testAdd() throws Exception {
        SLinkedList<Integer> list = new SLinkedList<>();
        list.add(1);
        assertEquals(Integer.valueOf(1), list.getFirst());
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(Integer.valueOf(1), list.getFirst());
        assertEquals(2, list.size());
    }

    @Test
    public void testSearch() throws Exception {
        SLinkedList<Integer> list = new SLinkedList<>(5, 12, 0, 1, 3, 9);
        assertEquals(Integer.valueOf(0), list.search(0));
        assertNull(list.search(100));
    }

    @Test
    public void testGetFirst() throws Exception {
        SLinkedList<Integer> list = new SLinkedList<>(5, 12, 0, 1, 3, 9);
        assertEquals(Integer.valueOf(5), list.getFirst());
    }

    @Test
    public void testGetLast() throws Exception {
        SLinkedList<Integer> list = new SLinkedList<>(5, 12, 0, 1, 3, 9);
    }

    @Test
    public void testSize() throws Exception {
        SLinkedList<Integer> list = new SLinkedList<>(5, 12, 0, 1, 3, 9);
        assertEquals(6, list.size());
        list.add(13);
        assertEquals(7, list.size());

        SLinkedList<Integer> list0 = new SLinkedList<>();
        assertEquals(0, list0.size());
    }

    @Test
    public void testRemoveFirst() throws Exception {
        SLinkedList<Integer> list = new SLinkedList<>(5, 12, 0, 1, 3, 9);
        list.removeFirst();
        assertEquals(Integer.valueOf(12), list.getFirst());
        assertNull(list.search(5));
        assertEquals(5, list.size());
    }
}