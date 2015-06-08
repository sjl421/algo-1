package careercup.chapter2;

import careercup.chapter2.RemoveDupes.Node;
import static junit.framework.Assert.*;
import org.junit.Test;

public class RemoveDupesTest {

    @Test
    public void testRemoveDupesEmptyList() throws Exception {
        assertNull(RemoveDupes.removeDupes(null));

        Node list = new Node(1, null);
        assertEquals(list, RemoveDupes.removeDupes(list));
    }

    @Test
    public void testRemoveDupes() throws Exception {
        Node list = new Node(6, new Node(5, new Node(3,
                new Node(2, new Node(4, new Node(1, new Node(2, null)))))));

        Node result = RemoveDupes.removeDupes(list);
        assertEquals(6, result.data);
        Node p = result.next;
        assertEquals(5, p.data);

        p = p.next;
        assertEquals(3, p.data);

        p = p.next;
        assertEquals(2, p.data);

        p = p.next;
        assertEquals(4, p.data);

        p = p.next;
        assertEquals(1, p.data);

        p = p .next;
        assertNull(p);
    }
}