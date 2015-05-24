package careercup.chapter2;

import algo.lists.MyList;
import algo.lists.SingleLinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 *
 * @author ahalikov
 */
public class LinkedListDupesEvaporation {

    public static MyList<String> removeDupes(SingleLinkedList<String> list) {
        Map<String, Integer> counter = new HashMap<>();
        for (String item: list) {
            if (counter.get(item) == null)
                counter.put(item, 1);
            else {
                list.remove(item);
            }
        }
        return list;
    }
}
