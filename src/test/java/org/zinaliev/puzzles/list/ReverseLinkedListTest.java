package org.zinaliev.puzzles.list;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.zinaliev.puzzles.list.ListNode.fromArray;
import static org.zinaliev.puzzles.list.ListNode.toArray;

public class ReverseLinkedListTest {

    private int[] items;

    @Test
    public void testRecursively_1() {
        items = new int[]{1};

        assertArrayEquals(items, toArray(ReverseLinkedList.recursively(fromArray(items))));
    }

    @Test
    public void testRecursively_1_2_3() {
        items = new int[]{1, 2, 3};

        assertArrayEquals(new int[]{3, 2, 1}, toArray(ReverseLinkedList.recursively(fromArray(items))));
    }

    @Test
    public void testRecursively_1_2_3_4_5() {
        items = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(ReverseLinkedList.recursively(fromArray(items))));
    }

    @Test
    public void testIteratively_1() {
        items = new int[]{1};

        assertArrayEquals(items, toArray(ReverseLinkedList.iteratively(fromArray(items))));
    }

    @Test
    public void testIteratively_1_2_3() {
        items = new int[]{1, 2, 3};

        assertArrayEquals(new int[]{3, 2, 1}, toArray(ReverseLinkedList.iteratively(fromArray(items))));
    }

    @Test
    public void testIteratively_1_2_3_4_5() {
        items = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(ReverseLinkedList.iteratively(fromArray(items))));
    }
}