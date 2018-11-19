package org.zinaliev.puzzles.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeTwoSortedArraysTest {

    private final MergeTwoSortedArrays solution = new MergeTwoSortedArrays();
    private int[] a;


    @Test
    public void test_012345() {
        a = new int[]{0, 2, 4, 0, 0, 0};
        solution.merge(a, 3, new int[]{1, 3, 5}, 3);

        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, a);
    }
}