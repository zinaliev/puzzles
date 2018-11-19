package org.zinaliev.puzzles.dynamic;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaxSubArraySum {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxEver = Integer.MIN_VALUE;
        int maxCurr = 0;

        for (int n : nums) {
            maxCurr = Math.max(maxCurr + n, n);
            maxEver = Math.max(maxCurr, maxEver);
        }

        return maxEver;
    }
}
