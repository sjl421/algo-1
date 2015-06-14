package algo.tree;

import org.junit.Test;

import static algo.tree.TreeTraversal.*;
import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class TreeTraversalTest {

    static final Node TEST_TREE = new Node('F',
            new Node('D',
                    new Node('B',
                            new Node('A'), new Node('C')),
                    new Node('E')),
            new Node('J',
                    new Node('G', null,
                            new Node('I', new Node('H'), null)),
                    new Node('K')));

    @Test
    public void testBreadthFirst() throws Exception {
        System.out.println("Level-Order traversal");
        TreeTraversal.breadthFirst(TEST_TREE);
    }

    @Test
    public void testPreOrder() throws Exception {
        System.out.println("Pre-Order traversal");
        TreeTraversal.preOrder(TEST_TREE);
    }
}