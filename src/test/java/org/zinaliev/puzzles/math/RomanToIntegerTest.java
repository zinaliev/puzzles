package org.zinaliev.puzzles.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    private final RomanToInteger solution = new RomanToInteger();

    @Test
    public void test_III() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void test_IV() {
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    public void test_IX() {
        assertEquals(9, solution.romanToInt("IX"));
    }

    @Test
    public void test_XL() {
        assertEquals(40, solution.romanToInt("XL"));
    }

    @Test
    public void test_XC() {
        assertEquals(90, solution.romanToInt("XC"));
    }

    @Test
    public void test_CD() {
        assertEquals(400, solution.romanToInt("CD"));
    }

    @Test
    public void test_CM() {
        assertEquals(900, solution.romanToInt("CM"));
    }

    @Test
    public void test_MDCLXVI() {
        assertEquals(1666, solution.romanToInt("MDCLXVI"));
    }

    @Test
    public void test_MCMXCIV() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}