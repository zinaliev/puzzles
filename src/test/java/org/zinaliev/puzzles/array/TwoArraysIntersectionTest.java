package org.zinaliev.puzzles.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoArraysIntersectionTest {

  private final TwoArraysIntersection solution = new TwoArraysIntersection();

  @Test
  public void test_Empty_Empty() {

    assertArrayEquals(new int[0], solution.intersect(new int[0], new int[0]));
  }

  @Test
  public void test_Null_Null() {
    assertArrayEquals(new int[0], solution.intersect(new int[0], new int[0]));
  }

  @Test
  public void test_12345_23456789() {

    assertArrayEquals(new int[]{2, 3, 4, 5},
        solution.intersect(new int[]{1, 2, 3, 4, 5},
            new int[]{2, 3, 4, 5, 6, 7, 8, 9}
        )
    );
  }
}