package careercup.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class RotationCheckTest {

    @Test
    public void testIsRotation() throws Exception {
        assertFalse(RotationCheck.isRotation("ba", "cd"));
        assertFalse(RotationCheck.isRotation("hello", "nohello"));

        assertTrue(RotationCheck.isRotation("3412", "1234"));
        assertTrue(RotationCheck.isRotation("erbottlewat", "waterbottle"));
    }

    @Test
    public void testIsSubstring() throws Exception {
        assertFalse(RotationCheck.isSubstring("any", "hello java world"));
        assertTrue(RotationCheck.isSubstring("one", "no one knows"));
    }
}