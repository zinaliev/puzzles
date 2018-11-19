package org.zinaliev.puzzles.list;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists solution = new MergeTwoSortedLists();
    int[] first = null;
    int[] second = null;

    @Test
    public void testFirstNull() {
        second = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals(second, solution.mergeTwoLists(null, ListNode.fromArray(second)).toArray());
    }

    @Test
    public void testSecondNull() {
        first = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals(first, solution.mergeTwoLists(ListNode.fromArray(first), null).toArray());
    }

    @Test
    public void testBothNull() {
        assertNull(solution.mergeTwoLists(null, null));
    }

    @Test
    public void testNoOverlapLists() {
        first = new int[]{1, 2, 3};
        second = new int[]{4, 5, 6};

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},
                solution.mergeTwoLists(ListNode.fromArray(first), ListNode.fromArray(second)).toArray()
        );
    }

    @Test
    public void testOverlapLists() {
        first = new int[]{1, 2, 3, 4, 7, 8};
        second = new int[]{4, 5, 6, 9};

        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9},
                solution.mergeTwoLists(ListNode.fromArray(first), ListNode.fromArray(second)).toArray()
        );
    }


}