package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    public void testNullInput() {
        assertEquals("", solution.longestCommonPrefix(null));
    }

    @Test
    public void testEmptyInput() {
        assertEquals("", solution.longestCommonPrefix(new String[0]));
    }

    @Test
    public void testNotOverlapInput() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"abc", "def"}));
    }


    @Test
    public void testOverlapInput() {
        assertEquals("abc", solution.longestCommonPrefix(new String[]{"abcz", "abcdef", "abcdefgh"}));
    }
}