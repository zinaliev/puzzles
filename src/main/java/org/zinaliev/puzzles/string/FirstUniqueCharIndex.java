package org.zinaliev.puzzles.string;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharIndex {

    public int firstUniqueChar(String s) {
        if (s == null)
            return -1;

        int result = s.length();
        int cur;

        for (char c = 'a'; c <= 'z'; c++) {

            if ((cur = s.indexOf(c)) != -1 && cur == s.lastIndexOf(c)) {
                result = cur < result ? cur : result;
            }
        }

        return result == s.length() ? -1 : result;
    }

    public int firstUniqueChar_(String s) {
        if (s == null)
            return -1;

        char[] chars = s.toCharArray();
        int[] cache = new int['z' - 'a' + 1];


        for (char c : chars) {
            cache[c - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (cache[chars[i] - 'a'] == 1)
                return i;
        }

        return -1;
    }
}
