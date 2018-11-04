package org.zinaliev.puzzles.list;

public class ListNode {

  int val;

  ListNode next;

  ListNode(int x) {
    val = x;
  }

  ListNode(int x, ListNode next) {
    val = x;
    this.next = next;
  }

  @Override
  public String toString() {
    return "ListNode{" + "val=" + val +
        '}';
  }

  public int[] toArray(){
    return toArray(this);
  }

  public static ListNode of(int... items) {
    if (items == null || items.length == 0)
      return null;

    ListNode node = new ListNode(items[0]);
    ListNode result = node;

    for (int i = 1; i < items.length; i++) {
      node.next = new ListNode(items[i]);

      node = node.next;
    }

    return result;
  }

  public static ListNode fromArray(int[] items) {
    return of(items);
  }

  public static int[] toArray(ListNode a) {
    int length = 0;
    ListNode c = a;
    while (c != null) {
      length++;
      c = c.next;
    }

    int[] result = new int[length];
    int i = 0;
    while (a != null) {
      result[i] = a.val;
      i++;
      a = a.next;
    }

    return result;
  }

}
