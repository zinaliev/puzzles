package org.zinaliev.puzzles.string;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Given s = "Hello World",
 * <p>
 * return 5 as length("World") = 5.
 * <p>
 * Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.
 */
public class LastWordLength {

  public int lengthOfLastWord(final String a) {

    int result = 0;

    int i = a.length() - 1;

    while (i >= 0 && a.charAt(i) == ' ') {
      i--;
    }

    while (i >= 0 && a.charAt(i) != ' ') {
      result++;
      i--;
    }

    return result;
  }
}
