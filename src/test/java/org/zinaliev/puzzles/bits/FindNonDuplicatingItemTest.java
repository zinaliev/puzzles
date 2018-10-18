package org.zinaliev.puzzles.bits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindNonDuplicatingItemTest {

  private final FindNonDuplicatingItem solution = new FindNonDuplicatingItem();

  @Test
  public void testOnSingleItemArray() {

    assertEquals(1, solution.singleNumber(1));
  }

  @Test
  public void testOnArrayWithX2Dupes() {

    assertEquals(1, solution.singleNumber(2, 1, 2, 4, 6, 6, 4));
  }

  @Test
  public void testOnArrayWithX4Dupes() {

    assertEquals(1, solution.singleNumber(4, 1, 4, 4, 6, 6, 4));
  }
}