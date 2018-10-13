package org.zinaliev.puzzles.array;

/**
 * Source - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
 */
public class RotateArray {

  public void rotate(int[] nums, int k) {
    k = k % nums.length;

    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  public void reverse(int[] nums, int i, int j) {
    while (i < j) {
      nums[j] = nums[j] ^ nums[i];
      nums[i] = nums[j] ^ nums[i];
      nums[j] = nums[j] ^ nums[i];

      i++;
      j--;
    }
  }
}
