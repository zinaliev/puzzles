package org.zinaliev.puzzles.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntDigitsTest {

    private final ReverseIntDigits solution = new ReverseIntDigits();

    @Test
    public void test_0() {
        assertEquals(0, solution.reverse(0));
    }

    @Test
    public void test_5() {
        assertEquals(5, solution.reverse(5));
    }

    @Test
    public void test_111() {
        assertEquals(111, solution.reverse(111));
    }

    @Test
    public void test_123456() {
        assertEquals(654321, solution.reverse(123456));
    }

    @Test
    public void test_Minus5() {
        assertEquals(-5, solution.reverse(-5));
    }

    @Test
    public void test_Minus111() {
        assertEquals(-111, solution.reverse(-111));
    }

    @Test
    public void test_Minus123456() {
        assertEquals(-654321, solution.reverse(-123456));
    }

    @Test
    public void test_Minus1234567891() {
        assertEquals(-1987654321, solution.reverse(-1234567891));
    }

    @Test
    public void test_1534236469() {
        assertEquals(0, solution.reverse(1534236469));
    }
}