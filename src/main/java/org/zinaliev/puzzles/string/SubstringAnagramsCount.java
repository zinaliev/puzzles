package org.zinaliev.puzzles.string;

public class SubstringAnagramsCount {

    private static int[] diff = new int[26];

    /**
     * Count anagram paired substrings in a given string
     */
    static int countAnagramSubstrings(String s) {
        int len = s.length();
        int aLen = len - 1;

        int result = 0;
        while (aLen > 0) {
            for (int i = 0; i <= len - aLen; i++) {
                for (int j = i + 1; j <= len - aLen; j++) {
                    //System.out.println(s.substring(i, i + aLen) + " vs " + s.substring(j, j + aLen));
                    if (isAnagram(s, i, j, aLen))
                        result++;
                }
            }

            aLen--;
        }

        return result;
    }

    /**
     * Are two given substrings anagrams
     * @param s parent string
     * @param i first substring start index
     * @param j second substring start index
     * @param len length of substrings
     */
    private static boolean isAnagram(String s, int i, int j, int len) {
        for (int k = 0; k < len; k++) {
            diff[s.charAt(i + k) - 'a']++;
            diff[s.charAt(j + k) - 'a']--;
        }

        boolean result = true;
        for (int k = 0; k < diff.length; k++) {
            if (result && diff[k] != 0)
                result = false;

            diff[k] = 0;
        }

        return result;
    }
}
