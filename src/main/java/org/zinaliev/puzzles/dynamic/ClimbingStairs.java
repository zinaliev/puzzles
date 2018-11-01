package org.zinaliev.puzzles.dynamic;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairs {

  public int climbStairs(int n) {
    if (n < 0)
      throw new IllegalArgumentException("n can not be less than zero");

    if (n < 3)
      return n;

    int[] cache = new int[]{1, 2};

    int i = 1;

    while (n >= 3) {
      i = (i + 1) % 2;

      cache[i] = cache[0] + cache[1];

      n--;
    }

    return cache[i];
  }

}
