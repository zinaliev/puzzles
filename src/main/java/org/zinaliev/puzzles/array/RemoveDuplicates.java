package org.zinaliev.puzzles.array;

import java.util.ArrayList;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * <p>
 * Source - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727
 */
public class RemoveDuplicates {

  /**
   * The most beautiful solution
   */
  public int removeDupes(ArrayList<Integer> a) {

    if (a == null || a.isEmpty())
      return 0;

    int lastUniqueIndex = 0;

    for (int i : a) {
      if (a.get(lastUniqueIndex) != i) {
        lastUniqueIndex++;
        a.set(lastUniqueIndex, i);
      }
    }

    return lastUniqueIndex + 1;
  }

  /**
   * 1 - Returns number of distinct elements
   * 2 - Modifies original array thus it's first items are all distinct ones present
   */
  public int removeDuplicates(int[] nums) {
    int distinct = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {

        if (nums[i] != nums[j]) {
          nums[++distinct] = nums[j];
          i = j - 1;
          break;
        }
      }
    }

    return distinct + 1;
  }

  /**
   * Second solution
   */
  public int removeDuplicates(ArrayList<Integer> a) {

    if (a == null || a.size() == 0)
      return 0;

    int lastUnique = a.get(0);
    int lastUniqueIndex = 1;

    int i = 1;

    while (i < a.size()) {

      if (a.get(i) != lastUnique) {
        lastUnique = a.get(i);
        a.set(lastUniqueIndex, a.get(i));
        lastUniqueIndex++;
      }

      i++;
    }


    return lastUniqueIndex;
  }
}
