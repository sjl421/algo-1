package careercup.chapter2;

import algo.lists.MyList;
import algo.lists.SingleLinkedList;
import org.junit.Test;

public class NoDupesSingleLinkedListTest {

    @Test
    public void testRemoveDupes() throws Exception {
        NoDupesSingleLinkedList test =
                new NoDupesSingleLinkedList("z", "b", "a", "d", "b", "a", "c");

        NoDupesSingleLinkedList result = test.removeDupes1();
        for (String s: result)
            System.out.print(s + ", ");
    }
}