package org.zinaliev.puzzles.bits;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example :
 * <p>
 * Input : [1 2 2 3 1]
 * Output : 3
 */
public class FindNonDuplicatingItem {

  // DO NOT MODIFY THE LIST
  public int singleNumber(final int... a) {

    int result = 0;

    for (Integer i : a) {
      result = result ^ i;
    }

    return result;
  }
}
