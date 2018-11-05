package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ValidParenthesesTest {
  private final ValidParentheses solution = new ValidParentheses();


  @Test
  public void test_Empty() {
    assertTrue(solution.isValid(""));
  }

  @Test
  public void test_OneClosing() {
    assertFalse(solution.isValid("]"));
  }

  @Test
  public void test_Invalid() {
    assertFalse(solution.isValid("[]{}(){([)])}"));
  }

  @Test
  public void test_Valid() {
    assertTrue(solution.isValid("[]{}(){([])}"));
  }
}