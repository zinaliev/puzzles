package org.zinaliev.puzzles.bits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {

    private final ReverseBits solution = new ReverseBits();

    @Test
    public void test_1() {
        assertEquals(2147483648L, solution.reverse(1L));
    }

    @Test
    public void test_5() {
        assertEquals(2684354560L, solution.reverse(5L));
    }

    @Test
    public void test_111593685() {
        assertEquals(2870175072L, solution.reverse(111593685L));
    }

    @Test
    public void test_4294967295() {
        assertEquals(4294967295L, solution.reverse(4294967295L));
    }
}