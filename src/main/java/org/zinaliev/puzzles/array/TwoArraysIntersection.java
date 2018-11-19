package org.zinaliev.puzzles.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 * <p>
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * <p>
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class TwoArraysIntersection {

    /**
     * In theory this method should be less efficient than {@link #intersectCaching(int[], int[])}
     * but on leetcode tests it makes 2 vs 6 millis correspondingly
     */
    public int[] intersectSorting(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return new int[0];

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i1 = 0;
        int i2 = 0;
        int i = 0;

        while (i1 < nums1.length && i2 < nums2.length) {

            int a1 = nums1[i1];
            int a2 = nums2[i2];

            if (a1 == a2) {
                nums1[i++] = a1;

                i1++;
                i2++;
            } else if (a1 < a2) {
                while (i1 < nums1.length && nums1[i1] < a2) {
                    i1++;
                }
            } else { // a1 > a2
                while (i2 < nums2.length && nums2[i2] < a1) {
                    i2++;
                }
            }
        }

        return Arrays.copyOf(nums1, i);
    }

    public int[] intersectCaching(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return new int[0];

        int[] small = nums1.length < nums2.length ? nums1 : nums2;
        int[] big = nums1.length < nums2.length ? nums2 : nums1;

        Map<Integer, Integer> smallMap = new HashMap<>();
        for (int i : small) {
            Integer count = smallMap.putIfAbsent(i, 1);

            if (count != null) {
                smallMap.put(i, count + 1);
            }
        }

        int j = 0;
        for (int i = 0; i < big.length; i++) {
            Integer count = smallMap.get(big[i]);

            if (count != null && count > 0) {

                small[j] = big[i];
                j++;

                smallMap.put(big[i], count - 1);
            }
        }

        return Arrays.copyOf(small, j);
    }


}
