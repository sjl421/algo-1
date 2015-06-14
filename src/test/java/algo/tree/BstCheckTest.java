package algo.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class BstCheckTest {

    @Test
    public void testIsBinarySearchTree() throws Exception {
        Node<Integer> tree = new Node<>(7,
                new Node(4,
                        new Node(1), new Node(6)),
                new Node(9)
        );
        assertTrue(BstCheck.isBinarySearchTree(tree));
    }
}