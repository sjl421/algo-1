package careercup.chapter2;

import algo.lists.SingleLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class SingleLinkedListChallengesTest {

    @Test
    public void testRemoveNthLast() throws Exception {
        SingleLinkedList<Integer> list = new SingleLinkedList<>(5, 12, 0, 1, 3, 9);
        assertEquals(6, list.size());
    }
}