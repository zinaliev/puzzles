package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastWordLengthTest {

    private final LastWordLength solution = new LastWordLength();


    @Test
    public void testEmptyString() {
        assertEquals(0, solution.lengthOfLastWord(""));
    }

    @Test
    public void testSpaceString() {
        assertEquals(0, solution.lengthOfLastWord("     "));
    }

    @Test
    public void testHelloWorld() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    public void testHelloWorldTrailingSpaces() {
        assertEquals(5, solution.lengthOfLastWord("Hello World     "));
    }
}