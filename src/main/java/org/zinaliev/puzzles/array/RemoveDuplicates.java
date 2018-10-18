package org.zinaliev.puzzles.array;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Given nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 *
 * Source - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727
 */
public class RemoveDuplicates {

  /**
   * 1 - Returns number of distinct elements
   * 2 - Modifies original array thus it's first items are all distinct ones present
   */
  public int removeDuplicates(int[] nums) {
    int distinct = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      for(int j = i + 1; j < nums.length; j++) {

        if(nums[i] != nums[j]) {
          nums[++distinct] = nums[j];
          i = j - 1;
          break;
        }
      }
    }

    return distinct + 1;
  }
}
