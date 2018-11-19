package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReverseStringTest {

    private final ReverseString solution = new ReverseString();

    @Test
    public void testNull() {
        assertNull(solution.reverseString(null));
    }

    @Test
    public void testEmpty() {
        assertEquals("", solution.reverseString(""));
    }

    @Test
    public void test_ValidString() {
        assertEquals("54321", solution.reverseString("12345"));
    }
}