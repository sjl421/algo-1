package algo.lists;

import org.junit.Assert;
import org.junit.Test;
import static algo.lists.SLinkedListExercises.Node;

public class SLinkedListExercisesTest {

    @Test
    public void testReverse1() throws Exception {
        Node test = new Node(3, new Node(2, new Node(1, null)));
        Node res = SLinkedListExercises.reverse1(test);
        Assert.assertEquals(1, res.data);
        Assert.assertEquals(2, res.next.data);
        Assert.assertEquals(3, res.next.next.data);
        Assert.assertNull(res.next.next.next);
    }

    @Test
    public void testReverse2() throws Exception {
        Node test = new Node(3, new Node(2, new Node(1, null)));
        Node res = SLinkedListExercises.reverse2(test, null);
        Assert.assertEquals(1, res.data);
        Assert.assertEquals(2, res.next.data);
        Assert.assertEquals(3, res.next.next.data);
        Assert.assertNull(res.next.next.next);
    }

    @Test
    public void testMergeLists() throws Exception {
        Node list1 = new Node(1, new Node(3, new Node(5, new Node(6, null))));
        Node list2 = new Node(2, new Node(4, new Node(7, null)));
        //Node res = SLinkedListExercises.mergeLists(list1, list2);
    }

    @Test
    public void tesGetNode1() {
        Node list = new Node(1, new Node(2, new Node(3,
                new Node(4, new Node(5, new Node(6, null))))));
        Assert.assertEquals(4, SLinkedListExercises.getNode1(list, 3));
    }

    @Test
    public void tesGetNode2() {
        Node list = new Node(1, new Node(2, new Node(3,
                new Node(4, new Node(5, new Node(6, null))))));
        Assert.assertEquals(6, SLinkedListExercises.getNode2(list, 0));
        Assert.assertEquals(4, SLinkedListExercises.getNode2(list, 2));
        Assert.assertEquals(1, SLinkedListExercises.getNode2(list, 5));
    }

    @Test
    public void testRemoveDuplicates() throws Exception {
        Node list = new Node(1, new Node(2, new Node(3,
                new Node(3, new Node(3, new Node(6, null))))));
        Node res = SLinkedListExercises.removeDuplicates(list);
        Assert.assertEquals(1, res.data);
        Assert.assertEquals(2, res.next.data);
        Assert.assertEquals(3, res.next.next.data);
        Assert.assertEquals(6, res.next.next.next.data);
    }

    @Test
    public void testHasCycle() throws Exception {
        Assert.assertFalse("null list", SLinkedListExercises.hasCycle(null));
        Assert.assertFalse("1 node", SLinkedListExercises.hasCycle(new Node(1, null)));

        // Head node cycle
        Node head = new Node(1, null);
        head.next = head;
        Assert.assertTrue("head cycle", SLinkedListExercises.hasCycle(head));

        // 3-element list, no cycle
        head = new Node(1, new Node(2, new Node(3, null)));
        Assert.assertFalse("3-element list no cycle", SLinkedListExercises.hasCycle(head));

        // 3-element list cycle
        head = new Node(1, new Node(2, new Node(3, null)));
        head.next.next.next = head.next;
        Assert.assertTrue("3-element list cycle", SLinkedListExercises.hasCycle(head));

        // 6-element list with cycle
        head = new Node(1, new Node(2, new Node(3, null)));
        Node p4 = new Node(4, null);
        Node p5 = new Node(5, null);
        Node p6 = new Node(6, null);
        head.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p4; // cycle
        Assert.assertTrue("6-element list with cycle", SLinkedListExercises.hasCycle(head));
    }
}