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

  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums1 == null || nums2 == null)
      return new int[0];

    int[] big = nums1.length > nums2.length ? nums1 : nums2;
    int[] small = nums1.length > nums2.length ? nums2 : nums1;

    Map<Integer, Integer> bigMap = new HashMap<>();
    for (int i : big) {
      Integer count = bigMap.putIfAbsent(i, 1);

      if (count != null) {
        bigMap.put(i, count + 1);
      }
    }

    int j = 0;
    for (int i = 0; i < small.length; i++) {
      Integer count = bigMap.get(small[i]);

      if (count != null && count > 0) {

        big[j] = small[i];
        j++;

        bigMap.put(small[i], count - 1);
      }
    }

    return Arrays.copyOf(big, j);
  }

}
