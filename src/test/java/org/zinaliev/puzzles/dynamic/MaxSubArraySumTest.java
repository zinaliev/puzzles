package org.zinaliev.puzzles.dynamic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubArraySumTest {

    private final MaxSubArraySum solution = new MaxSubArraySum();

    @Test
    public void testFromLC() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}