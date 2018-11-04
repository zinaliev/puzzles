package org.zinaliev.puzzles.string;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example 1:
 * <p>
 * Input: "hello"
 * Output: "olleh"
 * Example 2:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 */
public class ReverseString {

  public String reverseString(String s) {
    if (s == null)
      return null;

    char[] result = s.toCharArray();

    int start = 0;
    int end = result.length - 1;
    char tmp;

    while (start < end) {

      tmp = result[start];
      result[start] = result[end];
      result[end] = tmp;

      start++;
      end--;
    }

    return new String(result);
  }
}
