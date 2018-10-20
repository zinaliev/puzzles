package org.zinaliev.puzzles.math;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactorialTrailingZerosTest {

  private final FactorialTrailingZeros solution = new FactorialTrailingZeros();

  @Test
  public void test_5() {
    assertEquals(1, solution.trailingZeroes(5));
  }

  @Test
  public void test_100() {
    assertEquals(24, solution.trailingZeroes(100));
  }

  @Test
  public void test_4617() {
    assertEquals(1151, solution.trailingZeroes(4617));
  }
}