package org.zinaliev.puzzles.array;


import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class FindSumIndexes {

  public int[] twoSum(int[] nums, int target) {
    if (nums == null || nums.length < 2)
      return null;

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int paired = target - nums[i];

      if (map.containsKey(paired)) {
        return new int[]{map.get(paired), i};
      } else {
        map.put(nums[i], i);
      }
    }

    return null;
  }
}
