package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FirstUniqueCharIndexTest {

  private final FirstUniqueCharIndex solution = new FirstUniqueCharIndex();

  @Test
  public void testNull() {
    assertEquals(-1, solution.firstUniqueChar(null));
    assertEquals(-1, solution.firstUniqueChar_(null));
  }

  @Test
  public void testEmpty() {
    assertEquals(-1, solution.firstUniqueChar(""));
    assertEquals(-1, solution.firstUniqueChar_(""));
  }

  @Test
  public void testNoUniqueCharString() {
    assertEquals(-1, solution.firstUniqueChar("abcabcdefdef"));
    assertEquals(-1, solution.firstUniqueChar_("abcabcdefdef"));
  }

  @Test
  public void testContainingUniqueCharString() {
    assertEquals(4, solution.firstUniqueChar("abcdedcba"));
    assertEquals(4, solution.firstUniqueChar_("abcdedcba"));
  }

}