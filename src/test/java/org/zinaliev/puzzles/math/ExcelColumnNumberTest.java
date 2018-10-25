package org.zinaliev.puzzles.math;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ExcelColumnNumberTest {

  private final ExcelColumnNumber solution = new ExcelColumnNumber();

  @Test
  public void test_A() {
    assertEquals(1, solution.titleToNumber("A"));
  }

  @Test
  public void test_Z() {
    assertEquals(26, solution.titleToNumber("Z"));
  }

  @Test
  public void test_AA() {
    assertEquals(27, solution.titleToNumber("AA"));
  }

  @Test
  public void test_ZA() {
    assertEquals(677, solution.titleToNumber("ZA"));
  }
}