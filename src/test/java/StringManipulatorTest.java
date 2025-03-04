import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void testConcatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HelloWorld", sm.concatenate("Hello", "World"));
        assertEquals("123abc", sm.concatenate("123", "abc"));
        assertEquals("", sm.concatenate("", ""));
    }

    @Test
    void testFindLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(5, sm.findLength("Hello"));
        assertEquals(0, sm.findLength(""));
        assertEquals(11, sm.findLength("Hello World"));
    }

    @Test
    void testConvertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HELLO", sm.convertToUpperCase("hello"));
        assertEquals("123ABC", sm.convertToUpperCase("123abc"));
        assertEquals("", sm.convertToUpperCase(""));
    }

    @Test
    void testConvertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("hello", sm.convertToLowerCase("HELLO"));
        assertEquals("123abc", sm.convertToLowerCase("123ABC"));
        assertEquals("", sm.convertToLowerCase(""));
    }

    @Test
    void testContainsSubstring() {
        StringManipulator sm = new StringManipulator();
        assertTrue(sm.containsSubstring("Hello World", "World"));
        assertFalse(sm.containsSubstring("Hello World", "world"));
        assertTrue(sm.containsSubstring("123abc", "23a"));
        assertFalse(sm.containsSubstring("", "abc"));
    }

}