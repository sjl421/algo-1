package careercup.chapter2;

import org.junit.Test;

public class RemoveDupesTest {

    @Test
    public void testRemoveDupes() throws Exception {
        RemoveDupes test =
                new RemoveDupes("z", "b", "a", "d", "b", "a", "c");

        RemoveDupes result = test.removeDupes1();
        for (String s: result)
            System.out.print(s + ", ");
    }
}