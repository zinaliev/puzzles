package org.zinaliev.puzzles;

import java.util.Arrays;

/**
 * Too complicated description
 * Better look at https://www.hackerrank.com/challenges/reverse-shuffle-merge/problem
 */
public class ReverseShuffleMerge {

    static final int alphaLen = 26;

    /**
     * argument contains only lower-case English letters, ascii[a-z]
     */
    static String reverseShuffleMerge(String s) {
        int[] counts = lettersCounts(s);
        char[] candidate = getSmallestCandidate(counts);

        System.out.println(Arrays.toString(candidate));

        while (candidate != null) {
            if(checkFits(s, candidate))
                return new String(candidate);

            candidate = nextPermutation(candidate);
        }

        return null;
    }

    static boolean checkFits(String str, char[] candidate) {
        int i = 0;
        int j = str.length() - 1;
        char s;
        char c;

        while (i < candidate.length && j >= 0) {
            c = candidate[i];
            s = str.charAt(j);

            if (s == c)
                i++;

            j--;
        }

        return i == candidate.length && j >= -1;
    }

    static char[] nextPermutation(char[] curr) {
        int fdi = curr.length - 2; // index of a first descending item (for right-to-left traverse)

        while (fdi >= 0) {
            if (curr[fdi + 1] > curr[fdi])
                break;

            fdi--;
        }

        if (fdi == -1)
            return null;

        int ceil = fdi + 1; // index of a smallest item going after fdi that is bigger than fdi value

        for (int i = curr.length - 1; i > fdi; i--) {
            if (curr[i] > curr[fdi] && curr[i] < curr[ceil]) {
                ceil = i;
            }
        }

        swap(curr, fdi, ceil);

        int left = fdi + 1;
        int right = curr.length - 1;

        while (left < right) {
            swap(curr, left, right);
            left++;
            right--;
        }

        return curr;
    }

    static void swap(char[] arr, int i, int j) {
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static char[] getSmallestCandidate(int[] lettersCounts) {
        int len = 0;
        for (int count : lettersCounts)
            len += count;

        char[] result = new char[len];

        int j = 0;
        for (int i = 0; i < alphaLen; i++) {
            int count = lettersCounts[i];

            while (count > 0) {
                result[j] = (char) ('a' + i);

                count--;
                j++;
            }
        }

        return result;
    }

    static int[] lettersCounts(String s) {
        int[] freq = new int[alphaLen];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;

        for (int i = 0; i < alphaLen; i++)
            freq[i] /= 2;

        return freq;
    }
}
