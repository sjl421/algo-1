package algo.lists;

import algo.lists.DLinkedListExercises.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class DLinkedListExercisesTest {

    @Test
    public void testSortedInsert() throws Exception {
        // Empty list
        Node head = DLinkedListExercises.sortedInsert(null, 2);
        assertNull(head.prev);
        assertNull(head.next);
        assertEquals(2, head.data);

        // 1-element list
        Node p1 = new Node(3);
        head = DLinkedListExercises.sortedInsert(p1, 2);
        assertEquals(2, head.data);
        assertEquals(3, head.next.data);

        // 3-element list: null <- 2 <-> 4 <-> 6 -> null
        p1 = new Node(2);
        Node p2 = new Node(4, p1, null);
        Node p3 = new Node(6, p2, null);
        p1.next = p2;
        p2.next = p3;

        head = DLinkedListExercises.sortedInsert(p1, 5);
        assertNull(head.prev);
        assertEquals(2, head.data);
        assertEquals(4, head.next.data);
        assertEquals(5, head.next.next.data);
        assertEquals(6, head.next.next.next.data);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void testReverse() throws Exception {
        // Empty list
        Node head = DLinkedListExercises.reverse(null);
        assertNull(head);

        // 1-element list
        head = DLinkedListExercises.reverse(new Node(3));
        assertEquals(3, head.data);

        // 3-element list: null <- 2 <-> 4 <-> 6 -> null
        Node p1 = new Node(2);
        Node p2 = new Node(4, p1, null);
        Node p3 = new Node(6, p2, null);
        p1.next = p2;
        p2.next = p3;
        head = DLinkedListExercises.reverse(p1);
        assertNull(head.prev);
        assertEquals(6, head.data);
        assertEquals(4, head.next.data);
        assertEquals(2, head.next.next.data);
        assertNull(head.next.next.next);
    }
}