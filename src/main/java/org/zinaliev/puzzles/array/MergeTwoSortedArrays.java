package org.zinaliev.puzzles.array;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */
public class MergeTwoSortedArrays {

    public void merge(int[] a, int m, int[] b, int n) {
        if (a == null || b == null || a.length < m + n)
            return;

        int aTail = m - 1;
        int bTail = n - 1;
        int cTail = m + n - 1;

        while (aTail >= 0 && bTail >= 0) {

            if (a[aTail] > b[bTail]) {
                // System.out.print("a[" + cTail + "] = a[" + aTail + "]  -->  ");
                a[cTail--] = a[aTail--];

            } else {
                // System.out.print("a[" + cTail + "] = b[" + bTail + "]  -->  ");
                a[cTail--] = b[bTail--];
            }

            // for(int i : a){
            //   System.out.print(i + " ");
            // }
            // System.out.println();
        }

        while (bTail >= 0) {
            a[cTail--] = b[bTail--];
        }
    }

}
