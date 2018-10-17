package org.zinaliev.puzzles.bits;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CountOneBitsTest {

  private final CountOneBits solution = new CountOneBits();

  @Test
  public void test1() {
    assertEquals(1, solution.numSetBits(1));
  }

  @Test
  public void test0() {
    assertEquals(0, solution.numSetBits(0));
  }

  @Test
  public void test1024() {
    assertEquals(1, solution.numSetBits(1));
  }

  @Test
  public void test1023() {
    assertEquals(10, solution.numSetBits(1023));
  }

  @Test
  public void test2147483647() {
    assertEquals(31, solution.numSetBits(2147483647));
  }

  @Test
  public void test2147483648() {
    assertEquals(1, solution.numSetBits(2147483648L));
  }
}