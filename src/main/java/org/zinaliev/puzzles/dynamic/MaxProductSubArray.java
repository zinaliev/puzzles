package org.zinaliev.puzzles.dynamic;

/**
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * <p>
 * Example 1:
 * <p>
 * Input: [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 * <p>
 * Input: [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
public class MaxProductSubArray {

  public int maxProduct(int[] nums) {

    if (nums == null || nums.length == 0)
      return 0;

    int res = nums[0];

    for (int i = 1, min = res, max = res; i < nums.length; i++) {

      if (nums[i] < 0) {
        int t = min;
        min = max;
        max = t;
      }

      min = Math.min(nums[i], min * nums[i]);
      max = Math.max(nums[i], max * nums[i]);

      res = Math.max(res, max);

      System.out.println("min: " + min + ", max: " + max + ", res: " + res);
    }

    return res;
  }
}
