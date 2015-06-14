package algo.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link Tree}
 *
 * @author ahalikov
 */
public class TreeTest {

    @Test
    public void testSearch() throws Exception {
        Tree<Integer> tree = new Tree<>(12, 5, 9, 2, 17, 19, 18);
        assertEquals(7, tree.getSize());
        tree.insert(13);
        Tree.Entry item = tree.search(13);
        assertEquals(13, item.element);

        item = tree.search(5);
        assertEquals(5, item.element);

        item = tree.search(42);
        assertNull(item);
    }

    @Test
    public void testInsert() throws Exception {
        Tree<Integer> tree = new Tree<>();
        tree.insert(12, 5, 9, 2, 17, 19, 18);
        assertEquals(7, tree.getSize());
        tree.insert(13);
        assertEquals(8, tree.getSize());
    }

    @Test
    public void testHeight() throws Exception {
        Tree<Integer> tree = new Tree<>();
        assertEquals(-1, tree.height());

        tree.insert(12);
        assertEquals(0, tree.height());

        tree.insert(5, 9, 2, 17, 19, 18);
        assertEquals(3, tree.height());
    }
}