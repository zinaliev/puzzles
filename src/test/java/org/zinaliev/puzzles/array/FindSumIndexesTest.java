package org.zinaliev.puzzles.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class FindSumIndexesTest {

    private final FindSumIndexes solution = new FindSumIndexes();

    @Test
    public void testTwoSum_PairExists_ReturnsValidIndexes() {
        assertArrayEquals(new int[]{3, 5}, solution.twoSum(new int[]{0, 1, 2, 3, 4, 7}, 10));
    }

    @Test
    public void testTwoSum_PairNotExists_ReturnsNull() {
        assertNull(solution.twoSum(new int[]{0, 1, 2, 3, 4, 7}, 12));
    }

    @Test
    public void testTwoSum_EmptyInput_ReturnsNull() {
        assertNull(solution.twoSum(new int[0], 12));
    }
}