package org.zinaliev.puzzles.array;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {
        if (nums == null)
            return;

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {

                nums[i] = nums[j];
                i++;
            }

            j++;

            // System.out.println(Arrays.toString(nums) + " i=" + i + "; j=" + j + "; zeros=" + zeros);
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
