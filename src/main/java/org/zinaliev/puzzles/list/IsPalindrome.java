package org.zinaliev.puzzles.list;

public class IsPalindrome {

  public boolean isPalindrome(ListNode head) {
    // an empty list and a single node list case
    if(head == null || head.next == null)
      return true;

    ListNode slow = head;
    ListNode fast = slow.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // list size is odd
    if (fast == null) {
      slow = slow.next;
    }

    slow = ReverseLinkedList.iteratively(slow);

    while(head != null && slow != null){
      if(head.val != slow.val)
        return false;

      head = head.next;
      slow = slow.next;
    }

    return true;
  }
}
