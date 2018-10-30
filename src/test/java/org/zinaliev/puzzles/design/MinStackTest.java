package org.zinaliev.puzzles.design;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackTest {

  private final MinStack stack = new MinStack();

  @Test(expected = IllegalStateException.class)
  public void testPop_Empty_ThrowsException() {
    stack.pop();
  }

  @Test(expected = IllegalStateException.class)
  public void testTop_Empty_ThrowsException() {
    stack.top();
  }

  @Test(expected = IllegalStateException.class)
  public void testGetMin_Empty_ThrowsException() {
    stack.getMin();
  }

  @Test
  public void testTop_NoPops_ReturnsLastPushed() {
    stack.push(1);
    assertEquals(1, stack.top());

    stack.push(2);
    assertEquals(2, stack.top());

    stack.push(3);
    assertEquals(3, stack.top());
  }

  @Test
  public void testTop_WithPops_ReturnsTop() {
    stack.push(1);
    stack.push(2);
    stack.push(3);

    assertEquals(3, stack.top());
    stack.pop();

    assertEquals(2, stack.top());
    stack.pop();

    assertEquals(1, stack.top());
  }

  @Test
  public void testMin_OnDecrementingValuesCollection() {
    stack.push(9);
    assertEquals(9, stack.getMin());

    stack.push(8);
    assertEquals(8, stack.getMin());

    stack.push(7);
    assertEquals(7, stack.getMin());

    stack.push(6);
    assertEquals(6, stack.getMin());
  }

  @Test
  public void testMin_OnIncrementingValuesCollection() {
    stack.push(6);
    assertEquals(6, stack.getMin());

    stack.push(7);
    assertEquals(6, stack.getMin());

    stack.push(8);
    assertEquals(6, stack.getMin());

    stack.push(9);
    assertEquals(6, stack.getMin());
  }
}