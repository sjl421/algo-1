package algo.tree;

import org.junit.Test;

/**
 * A test for {@link TreeTraversal}
 * @author ahalikov
 */
public class TreeTraversalTest {

    static final Node<Character> TEST_TREE = new Node<>('A',
            new Node<>('B',
                    new Node<>('D'),
                    new Node<>('E')),
            new Node<>('C',
                    new Node<>('F'),
                    new Node<>('G')));

    @Test
    public void testBreadthFirst() throws Exception {
        System.out.print("Level-Order: ");
        TreeTraversal.breadthFirst(TEST_TREE);
    }

    @Test
    public void testPreOrder() throws Exception {
        System.out.print("Pre-Order: ");
        TreeTraversal.preOrder(TEST_TREE);
        System.out.println();
    }

    @Test
    public void testInOrder() throws Exception {
        System.out.print("In-Order: ");
        TreeTraversal.inOrder(TEST_TREE);
        System.out.println();
    }

    @Test
    public void testPostOrder() throws Exception {
        System.out.print("Post-Order: ");
        TreeTraversal.postOrder(TEST_TREE);
        System.out.println();
    }
}