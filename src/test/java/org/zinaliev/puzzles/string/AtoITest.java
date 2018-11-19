package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtoITest {

    private final AtoI solution = new AtoI();

    @Test
    public void testNullAndEmpty() {
        assertEquals(0, solution.myAtoi(null));
        assertEquals(0, solution.myAtoi(""));
    }

    @Test
    public void testNegativeValueWithTrailingRubbish() {
        assertEquals(-123, solution.myAtoi("    -123rubbish"));
    }

    @Test
    public void testIntMaxVal() {
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("   " + Integer.MAX_VALUE + "rubbish"));
    }

    @Test
    public void testIntMaxValOverflow() {
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("   " + Integer.MAX_VALUE + "1rubbish"));
    }

    @Test
    public void testIntMinVal() {
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("   " + Integer.MIN_VALUE + "rubbish"));
    }

    @Test
    public void testIntMinValOverflow() {
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("   " + Integer.MIN_VALUE + "1rubbish"));
    }

    @Test
    public void testPositiveValueWithLeadingPlusAndTrailingRubbish() {
        assertEquals(123, solution.myAtoi("    +123rubbish"));
    }

    @Test
    public void testPositiveValueWithTrailingRubbish() {
        assertEquals(123, solution.myAtoi("    123rubbish"));
    }

    @Test
    public void testLeadingRubbish() {
        assertEquals(0, solution.myAtoi("    -rubbish"));
    }

}