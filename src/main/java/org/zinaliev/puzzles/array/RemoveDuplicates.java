package org.zinaliev.puzzles.array;

/**
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
