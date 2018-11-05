package org.zinaliev.puzzles.math;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MissingNumberTest {
  
  private final MissingNumber solution = new MissingNumber();

  @Test
  public void test_023456() {
    assertEquals(1, solution.missingNumber(new int[]{0, 2, 3, 4, 5, 6}));
  }

  @Test
  public void test_016354() {
    assertEquals(2, solution.missingNumber(new int[]{0, 1, 6, 3, 5, 4}));
  }
}