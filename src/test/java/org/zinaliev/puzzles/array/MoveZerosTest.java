package org.zinaliev.puzzles.array;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class MoveZerosTest {

  private final MoveZeros solution = new MoveZeros();

  @Test
  public void testNull() {
    int[] a = null;
    solution.moveZeroes(a);
    assertNull(a);
  }

  @Test
  public void testEmpty() {
    int[] a = new int[0];
    solution.moveZeroes(a);
    assertArrayEquals(new int[0], a);
  }

  @Test
  public void testWithoutZeros() {
    int[] a = new int[]{1, 2, 3};
    solution.moveZeroes(a);
    assertArrayEquals(new int[]{1, 2, 3}, a);
  }

  @Test
  public void testComplex() {
    int[] a = new int[]{0, 0, 1, 2, 0, 3, 0};
    solution.moveZeroes(a);
    assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0, 0}, a);
  }
}