package org.zinaliev.puzzles.list;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * <p>
 * Source - CodeLab (FB)
 */
public class RemoveDupesFromSortedList {

    public ListNode deleteDuplicates(ListNode a) {
        if (a == null || a.next == null)
            return a;

        ListNode curNode = a;
        ListNode nextNode;

        while (curNode.next != null) {

            nextNode = curNode.next;

            if (curNode.val == nextNode.val) {
                curNode.next = nextNode.next;
            } else {
                curNode = nextNode;
            }
        }

        return a;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
