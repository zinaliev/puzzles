package org.zinaliev.puzzles.dynamic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductSubArrayTest {

    private final MaxProductSubArray solution = new MaxProductSubArray();

    @Test
    public void test_NullAndEmpty() {
        assertEquals(0, solution.maxProduct(null));
        assertEquals(0, solution.maxProduct(new int[0]));
    }

    @Test
    public void test_A() {
        assertEquals(6, solution.maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    public void test_B() {
        assertEquals(0, solution.maxProduct(new int[]{-2, 0, -4}));
    }

    @Test
    public void test_C() {
        assertEquals(120, solution.maxProduct(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    public void test_D() {
        assertEquals(120, solution.maxProduct(new int[]{-1, 2, 3, 4, 5}));
    }
}