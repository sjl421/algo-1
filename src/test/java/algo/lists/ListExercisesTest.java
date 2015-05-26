package algo.lists;

import org.junit.Assert;
import org.junit.Test;
import static algo.lists.ListExercises.Node;

public class ListExercisesTest {

    @Test
    public void testReverse1() throws Exception {
        Node test = new Node(3, new Node(2, new Node(1, null)));
        Node res = ListExercises.reverse1(test);
        Assert.assertEquals(1, res.item);
        Assert.assertEquals(2, res.next.item);
        Assert.assertEquals(3, res.next.next.item);
        Assert.assertNull(res.next.next.next);
    }

    @Test
    public void testReverse2() throws Exception {
        Node test = new Node(3, new Node(2, new Node(1, null)));
        ListExercises.head = test;
        ListExercises.reverse2(test);

        Node res = ListExercises.head;
        Assert.assertEquals(1, res.item);
        Assert.assertEquals(2, res.next.item);
        Assert.assertEquals(3, res.next.next.item);
        Assert.assertNull(res.next.next.next);
    }
}