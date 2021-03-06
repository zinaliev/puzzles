package org.zinaliev.puzzles.math;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 * <p>
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {


    public int missingNumber(int[] nums) { //sum
        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {

            result = result ^ i ^ nums[i];
        }

        return result;
    }
}
