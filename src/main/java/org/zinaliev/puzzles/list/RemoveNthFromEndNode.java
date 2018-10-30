package org.zinaliev.puzzles.list;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p>
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * <p>
 * Note:
 * * If n is greater than the size of the list, remove the first node of the list.
 * <p>
 * Try doing it using constant additional space.
 */
public class RemoveNthFromEndNode {

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null)
      return null;

    ListNode start = new ListNode(0);
    start.next = head;

    ListNode slow = start;
    ListNode fast = start;

    while (--n >= 0) {
      if (fast.next == null)
        break;

      fast = fast.next;
    }

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    if (slow.next != null)
      slow.next = slow.next.next;

    return start.next;
  }

  /*
  a) 1, n = 0
  b) 1, n = 1
  c) 1 -> 2 -> 3, n = 3
  d) 1 -> 2 -> 3, n = 4
   */
}
