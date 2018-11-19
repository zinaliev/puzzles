package org.zinaliev.puzzles.array;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example :
 * <p>
 * Input : [2, 1, 2]
 * Return  : 2 which occurs 2 times which is greater than 3/2.
 */
public class MajorItemSearch {

    public int majorityElement(int[] a) {

        int result = 0;
        int counter = 0;

        for (int i : a) {
            if (counter == 0) {
                result = i;
                counter++;
            } else if (i == result) {
                counter++;
            } else {
                counter--;
            }
        }

        return result;
    }
}
