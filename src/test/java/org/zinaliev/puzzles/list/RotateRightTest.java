package org.zinaliev.puzzles.list;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RotateRightTest {

  private final RotateRight solution = new RotateRight();

  @Test
  public void test_12345_2() {
    assertArrayEquals(new int[] {3, 4, 5, 1, 2}, solution.rotateRight(ListNode.of(1, 2, 3, 4, 5), 2).toArray());
  }

  @Test
  public void test_12345_12() {
    assertArrayEquals(new int[] {3, 4, 5, 1, 2}, solution.rotateRight(ListNode.of(1, 2, 3, 4, 5), 12).toArray());
  }

  @Test
  public void test_12345_5() {
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, solution.rotateRight(ListNode.of(1, 2, 3, 4, 5), 5).toArray());
  }
}