package org.zinaliev.puzzles.design;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStack {

  private Node head = null;

  /**
   * initialize your data structure here.
   */
  public MinStack() {

  }

  public void push(int x) {
    int min = head != null ? head.min : Integer.MAX_VALUE;

    head = new Node(x, x < min ? x : min, head);
  }

  public void pop() {
    if (head == null)
      throw new IllegalStateException("Can not perform pop on an empty stack");

    head = head.next;
  }

  public int top() {
    if (head == null)
      throw new IllegalStateException("Can not get top item of an empty stack");

    return head.val;
  }

  public int getMin() {
    if (head == null)
      throw new IllegalStateException("Can not get min item of an empty stack");

    return head.min;
  }

  private static class Node {

    final int val;
    final int min;
    final Node next;

    private Node(int val, int min, Node next) {
      this.val = val;
      this.min = min;
      this.next = next;
    }
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
