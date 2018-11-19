package org.zinaliev.puzzles.list;

public class RotateRight {

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null)
      return null;

    ListNode headCopy = head;
    int len = 1;

    while (head.next != null) {
      head = head.next;
      len++;
    }

    head.next = headCopy;

    k = k % len;

    while (k > 0) {
      head = head.next;
      k--;
    }

    ListNode result = head.next;
    head.next = null;

    return result;
  }

}