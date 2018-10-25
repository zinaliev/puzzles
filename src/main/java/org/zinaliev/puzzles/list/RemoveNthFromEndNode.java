package org.zinaliev.puzzles.list;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Note:
 * * If n is greater than the size of the list, remove the first node of the list.
 *
 * Try doing it using constant additional space.
 */
public class RemoveNthFromEndNode {

  public ListNode removeNthFromEnd(ListNode a, int b) {
    int len = 0;
    ListNode cur = a;

    while (cur != null) {
      len++;
      cur = cur.next;
    }

    int k = b >= len ? 0 : len - b;

    if (k == 0)
      return a.next;

    ListNode prev = a;
    cur = prev.next;

    int i = 1;
    while (i < k) {

      prev = cur;
      cur = cur.next;
      i++;
    }

    prev.next = cur.next;

    return a;
  }

  class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
