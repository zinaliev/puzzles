package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LastWordLengthTest {

  private final LastWordLength solution = new LastWordLength();


  @Test
  public void testEmptyString() {
    assertEquals(0, solution.lengthOfLastWord(""));
  }

  @Test
  public void testSpaceString() {
    assertEquals(0, solution.lengthOfLastWord("     "));
  }

  @Test
  public void testHelloWorld() {
    assertEquals(5, solution.lengthOfLastWord("Hello World"));
  }

  @Test
  public void testHelloWorldTrailingSpaces() {
    assertEquals(5, solution.lengthOfLastWord("Hello World     "));
  }
}