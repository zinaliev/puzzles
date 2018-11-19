package org.zinaliev.puzzles.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorItemSearchTest {

    private final MajorItemSearch solution = new MajorItemSearch();


    @Test
    public void test_1212121() {
        assertEquals(1, solution.majorityElement(new int[]{1, 2, 1, 2, 1}));
    }

    @Test
    public void test_1112222() {
        assertEquals(2, solution.majorityElement(new int[]{1, 1, 1, 2, 2, 2, 2}));
    }
}