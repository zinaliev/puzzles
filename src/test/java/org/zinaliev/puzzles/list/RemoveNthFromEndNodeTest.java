package org.zinaliev.puzzles.list;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.zinaliev.puzzles.list.ListNode.of;
import static org.zinaliev.puzzles.list.ListNode.toArray;
import static org.zinaliev.puzzles.list.RemoveNthFromEndNode.removeNthFromEnd;

public class RemoveNthFromEndNodeTest {

  @Test
  public void test_123456789_3() {
    assertArrayEquals(
        new int[]{1, 2, 3, 4, 5, 6, 8, 9},
        toArray(removeNthFromEnd(of(1, 2, 3, 4, 5, 6, 7, 8, 9), 3))
    );
  }

  @Test
  public void test_123456789_1() {
    assertArrayEquals(
        new int[]{1, 2, 3, 4, 5, 6, 7, 8},
        toArray(removeNthFromEnd(of(1, 2, 3, 4, 5, 6, 7, 8, 9), 1))
    );
  }

  @Test
  public void test_123456789_9() {
    assertArrayEquals(
        new int[]{2, 3, 4, 5, 6, 7, 8, 9},
        toArray(removeNthFromEnd(of(1, 2, 3, 4, 5, 6, 7, 8, 9), 9))
    );
  }

  @Test
  public void test_123456789_0() {
    assertArrayEquals(
        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
        toArray(removeNthFromEnd(of(1, 2, 3, 4, 5, 6, 7, 8, 9), 0))
    );
  }

  @Test
  public void test_123_4() {
    assertArrayEquals(
        new int[]{2, 3},
        toArray(removeNthFromEnd(of(1, 2, 3), 4))
    );
  }

  @Test
  public void test_1_1() {
    assertArrayEquals(
        new int[0],
        toArray(removeNthFromEnd(of(1), 1))
    );
  }
}