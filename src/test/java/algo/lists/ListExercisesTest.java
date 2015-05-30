package algo.lists;

import org.junit.Assert;
import org.junit.Test;
import static algo.lists.ListExercises.Node;

public class ListExercisesTest {

    @Test
    public void testReverse1() throws Exception {
        Node test = new Node(3, new Node(2, new Node(1, null)));
        Node res = ListExercises.reverse1(test);
        Assert.assertEquals(1, res.data);
        Assert.assertEquals(2, res.next.data);
        Assert.assertEquals(3, res.next.next.data);
        Assert.assertNull(res.next.next.next);
    }

    @Test
    public void testReverse2() throws Exception {
        Node test = new Node(3, new Node(2, new Node(1, null)));
        Node res = ListExercises.reverse2(test, null);
        Assert.assertEquals(1, res.data);
        Assert.assertEquals(2, res.next.data);
        Assert.assertEquals(3, res.next.next.data);
        Assert.assertNull(res.next.next.next);
    }

    @Test
    public void testMergeLists() throws Exception {
        Node list1 = new Node(1, new Node(3, new Node(5, new Node(6, null))));
        Node list2 = new Node(2, new Node(4, new Node(7, null)));

        //Node res = ListExercises.mergeLists(list1, list2);
    }

    @Test
    public void tesGetNode1() {
        Node list = new Node(1, new Node(2, new Node(3,
                new Node(4, new Node(5, new Node(6, null))))));
        Assert.assertEquals(4, ListExercises.getNode1(list, 3));
    }

    @Test
    public void tesGetNode2() {
        Node list = new Node(1, new Node(2, new Node(3,
                new Node(4, new Node(5, new Node(6, null))))));
        Assert.assertEquals(6, ListExercises.getNode2(list, 0));
        Assert.assertEquals(4, ListExercises.getNode2(list, 2));
        Assert.assertEquals(1, ListExercises.getNode2(list, 5));
    }
}