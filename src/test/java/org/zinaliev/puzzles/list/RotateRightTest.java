package org.zinaliev.puzzles.list;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateRightTest {

    private final RotateRight solution = new RotateRight();

    @Test
    public void test_12345_2() {
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, solution.rotateRight(ListNode.of(1, 2, 3, 4, 5), 2).toArray());
    }

    @Test
    public void test_12345_12() {
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, solution.rotateRight(ListNode.of(1, 2, 3, 4, 5), 12).toArray());
    }

    @Test
    public void test_12345_5() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solution.rotateRight(ListNode.of(1, 2, 3, 4, 5), 5).toArray());
    }
}