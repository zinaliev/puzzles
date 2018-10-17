package org.zinaliev.puzzles.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

  private final GreatestCommonDivisor solution = new GreatestCommonDivisor();

  @Test
  public void test_0_1() {
    assertEquals(1, solution.gcd(0, 1));
  }

  @Test
  public void test_1_0() {
    assertEquals(1, solution.gcd(1, 0));
  }

  @Test
  public void test_350_168() {
    assertEquals(14, solution.gcd(350, 168));
  }

  @Test
  public void test_350_178() {
    assertEquals(2, solution.gcd(350, 178));
  }
}