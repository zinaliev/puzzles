package org.zinaliev.puzzles.math;

import java.util.ArrayList;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * <p>
 * Example:
 * <p>
 * A -> 1
 * <p>
 * B -> 2
 * <p>
 * C -> 3
 * <p>
 * ...
 * <p>
 * Z -> 26
 * <p>
 * AA -> 27
 * <p>
 * AB -> 28
 */
public class ExcelColumnNumber {

  public int titleToNumber(String a) {
    int result = 0;
    int base = 1;

    for (int i = a.length() - 1; i >= 0; i--) {
      result += base * toNum(a.charAt(i));

      base *= toNum('Z');
    }

    return result;
  }

  private int toNum(char c) {
    return c - 'A' + 1;
  }
}
