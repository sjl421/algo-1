package careercup.chapter2;

import careercup.chapter2.RemoveNode.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class RemoveNodeTest {

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
        assertTrue(p2 == p1.next);
        assertTrue(p4 == p2.next);
        assertTrue(p5 == p4.next);
    }
}