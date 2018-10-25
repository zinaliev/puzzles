package org.zinaliev.puzzles.math.longarithm;

import org.junit.Test;
import org.zinaliev.puzzles.util.ListHelpers;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlusOneTest {

  private final PlusOne solution = new PlusOne();
  private ArrayList<Integer> result;

  @Test
  public void test_0123() {
    result = solution.plusOne(ListHelpers.asList(0, 1, 2, 3));

    assertEquals(Integer.valueOf(1), result.get(0));
    assertEquals(Integer.valueOf(2), result.get(1));
    assertEquals(Integer.valueOf(4), result.get(2));
  }

  @Test
  public void test_000123() {
    result = solution.plusOne(ListHelpers.asList(0, 0, 0, 1, 2, 3));

    assertEquals(Integer.valueOf(1), result.get(0));
    assertEquals(Integer.valueOf(2), result.get(1));
    assertEquals(Integer.valueOf(4), result.get(2));
  }

  @Test
  public void test_000999() {
    result = solution.plusOne(ListHelpers.asList(0, 0, 0, 9, 9, 9));

    assertEquals(Integer.valueOf(1), result.get(0));
    assertEquals(Integer.valueOf(0), result.get(1));
    assertEquals(Integer.valueOf(0), result.get(2));
    assertEquals(Integer.valueOf(0), result.get(3));
  }
}