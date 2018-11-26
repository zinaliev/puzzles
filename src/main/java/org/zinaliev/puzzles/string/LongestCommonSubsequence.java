package org.zinaliev.puzzles.string;

public class LongestCommonSubsequence {

    private static int[][] cache;

    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
        cache = new int[s1.length()][s2.length()];

        for(int[] row : cache) {
            for(int i = 0; i < row.length; i++) {
                row[i] = -1;
            }
        }

        return lcs(s1, s2, s1.length() - 1, s2.length() - 1);
    }

    static int lcs(String s1, String s2, int n1, int n2) {
        int result = 0;

        if(n1 < 0 || n2 < 0) {
            return 0;
        } else if (cache[n1][n2] != -1) {
            return cache[n1][n2];
        } else if(s1.charAt(n1) == s2.charAt(n2)) {
            result = 1 + lcs(s1, s2, n1 - 1, n2 - 1);
        } else {
            result = Math.max(
                    lcs(s1, s2, n1 - 1, n2),
                    lcs(s1, s2, n1, n2 - 1)
            );
        }

        cache[n1][n2] = result;
        return result;
    }
}
