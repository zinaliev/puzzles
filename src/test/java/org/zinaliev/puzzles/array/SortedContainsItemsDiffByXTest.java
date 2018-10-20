package org.zinaliev.puzzles.array;

import org.junit.Test;
import org.zinaliev.puzzles.util.ListHelpers;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SortedContainsItemsDiffByXTest {

  private final SortedContainsItemsDiffByX solution = new SortedContainsItemsDiffByX();

  private ArrayList<Integer> input;

  @Test
  public void test_1_123() {
    input = ListHelpers.asList(1, 2, 3);

    assertEquals(1, solution.diffPossible(input, 1));
  }

  @Test
  public void test_0_12234() {
    input = ListHelpers.asList(1, 2, 2, 3, 4);

    assertEquals(1, solution.diffPossible(input, 0));
  }


  @Test
  public void test_5_123469() {
    input = ListHelpers.asList(1, 2, 2, 3, 4, 6, 9);

    assertEquals(1, solution.diffPossible(input, 5));
  }

  @Test
  public void test_9_123469() {
    input = ListHelpers.asList(1, 2, 2, 3, 4, 6, 9);

    assertEquals(0, solution.diffPossible(input, 9));
  }


}