package org.zinaliev.puzzles.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Original task:
 * <p>
 * Following code tries to figure out if a number is prime ( Wiki )
 * However, it has a bug in it.
 * Please correct the bug and then submit the code.
 */
public class PrimeNumbers {

  /**
   * Returns number of primes **before** given n
   * <p>
   * Cache - boolean array of length = n, representing composites/primes numbers
   * <p>
   * This one is fast but requires O(n) extra memory
   */
  public int countPrimesCA(int n) {
    if (n < 3)
      return 0;

    int count = 0;
    boolean[] composites = new boolean[n];

    for (int i = 2; i < n; i++) {

      if (composites[i])
        continue;

      count++;
      System.out.println(i);

      for (int j = i; j < n; j += i) {
        composites[j] = true;
      }
    }

    return count;
  }

  /**
   * Get a list of all prime numbers going before n
   */
  public List<Integer> listPrimes(int n) {
    List<Integer> result = new ArrayList<>();

    boolean[] composites = new boolean[n];
    for (int i = 2; i < n; i++) {

      if (composites[i])
        continue;

      result.add(i);

      for (int j = i; j < n; j += i)
        composites[j] = true;
    }

    return result;
  }


  /**
   * Verifies whether the given number is prime or not
   */
  public boolean isPrime(int a) {

    if (a < 2)
      return false;

    int upperLimit = (int) Math.sqrt(a);

    for (int i = 2; i <= upperLimit; i++) {

      if (i < a && a % i == 0)
        return false;
    }

    return true;
  }
}
