package org.zinaliev.puzzles.math;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class IsPrimeNumberTest {

  @Test
  public void testComplex() {
    IsPrimeNumber solution = new IsPrimeNumber();

    assertFalse(solution.isPrime(4));
    assertFalse(solution.isPrime(38));
    assertFalse(solution.isPrime(1024));
    assertFalse(solution.isPrime(1));
    assertFalse(solution.isPrime(-1));
    assertFalse(solution.isPrime(0));

    assertTrue(solution.isPrime(2));
    assertTrue(solution.isPrime(3));
    assertTrue(solution.isPrime(7));
    assertTrue(solution.isPrime(137));
  }
}