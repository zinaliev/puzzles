package org.zinaliev.puzzles.dynamic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    public void test_0() {
        assertEquals(0, solution.climbStairs(0));
    }

    @Test
    public void test_1() {
        assertEquals(1, solution.climbStairs(1));
    }

    @Test
    public void test_2() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    public void test_3() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    public void test_4() {
        assertEquals(5, solution.climbStairs(4));
    }

    @Test
    public void test_5() {
        assertEquals(8, solution.climbStairs(5));
    }

    @Test
    public void test_6() {
        assertEquals(13, solution.climbStairs(6));
    }
}