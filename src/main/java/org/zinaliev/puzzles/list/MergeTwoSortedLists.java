package org.zinaliev.puzzles.list;

public class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode zero = new ListNode(Integer.MIN_VALUE);
    ListNode cur = zero;

    while(l1 != null && l2 != null){

      if(l1.val <= l2.val){
        cur.next = l1;
        l1 = l1.next;
      } else {
        cur.next = l2;
        l2 = l2.next;
      }

      cur = cur.next;
    }

    if(l1 == null){
      cur.next = l2;
    }

    if(l2 == null){
      cur.next = l1;
    }

    return zero.next;
  }
}
