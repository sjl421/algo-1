package careercup.chapter2;

import algo.lists.MyList;
import algo.lists.SingleLinkedList;
import org.junit.Test;

public class LinkedListDupesEvaporationTest {

    @Test
    public void testRemoveDupes() throws Exception {
        SingleLinkedList<String> test
                = new SingleLinkedList<>("z", "b", "a", "d", "b", "a", "c");
        MyList<String> result = LinkedListDupesEvaporation.removeDupes(test);
        for (String s: result)
            System.out.print(s + ", ");
    }
}