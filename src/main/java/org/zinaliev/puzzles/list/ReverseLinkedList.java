package org.zinaliev.puzzles.list;

public class ReverseLinkedList {

    public static ListNode recursively(ListNode a) {

        if (a == null)
            return null;

        return reverseRec(null, a);
    }

    private static ListNode reverseRec(ListNode a, ListNode b) {

        if (b == null)
            return a;

        ListNode c = b.next;

        b.next = a;

        return reverseRec(b, c);
    }

    public static ListNode iteratively(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tmp = curr.next;

            curr.next = prev;
            prev = curr;

            curr = tmp;
        }

        return prev;
    }

}
