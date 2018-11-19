package org.zinaliev.puzzles.list;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDupesFromSortedListTest {

    private final RemoveDupesFromSortedList solution = new RemoveDupesFromSortedList();

    @Test
    public void test112233() {

        Assert.assertArrayEquals(new int[]{1, 2, 3},
                toArray(solution.deleteDuplicates(createList(1, 1, 2, 2, 3, 3)))
        );
    }

    @Test
    public void test55555() {

        Assert.assertArrayEquals(new int[]{5},
                toArray(solution.deleteDuplicates(createList(5, 5, 5, 5, 5)))
        );
    }

    @Test
    public void test1() {

        Assert.assertArrayEquals(new int[]{1},
                toArray(solution.deleteDuplicates(createList(1)))
        );
    }

    private RemoveDupesFromSortedList.ListNode createList(int... items) {
        RemoveDupesFromSortedList.ListNode head = new RemoveDupesFromSortedList.ListNode(items[0]);

        RemoveDupesFromSortedList.ListNode curNode = head;

        for (int i = 0; i < items.length - 1; i++) {
            curNode.val = items[i];
            curNode.next = new RemoveDupesFromSortedList.ListNode(items[i + 1]);

            curNode = curNode.next;
        }

        return head;
    }

    private int[] toArray(RemoveDupesFromSortedList.ListNode head) {
        int length = 0;

        RemoveDupesFromSortedList.ListNode node = head;
        while (node != null) {
            length++;

            node = node.next;
        }

        int index = 0;
        int[] result = new int[length];

        node = head;
        while (node != null) {
            result[index] = node.val;

            node = node.next;
            index++;
        }

        return result;
    }
}