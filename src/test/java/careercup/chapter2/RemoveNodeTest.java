package careercup.chapter2;

import careercup.chapter2.RemoveNode.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class RemoveNodeTest {

    @Test
    public void testRemoveNodeEmptyList() throws Exception {
        assertFalse(RemoveNode.removeNode(null));
    }

    @Test
    public void testRemoveNode1() throws Exception {
        Node p1 = new Node(1, null);
        Node p2 = new Node(2, null);
        Node p3 = new Node(3, null);
        Node p4 = new Node(4, null);
        Node p5 = new Node(5, null);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        RemoveNode.removeNode(p3);
        assertEquals(4, p3.data);
        assertEquals(p5, p3.next);
    }
}