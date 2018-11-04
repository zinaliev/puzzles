package org.zinaliev.puzzles.math;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1:
 * <p>
 * x = 123,
 * <p>
 * return 321
 * Example2:
 * <p>
 * x = -123,
 * <p>
 * return -321
 * <p>
 * Return 0 if the result overflows and does not fit in a 32 bit signed integer
 */
public class ReverseIntDigits {

  public int reverse(int x) {
    int result = 0;

    int sign = x < 0 ? -1 : 1;
    x *= sign;

    while (x > 0) {

      int tail = x % 10;
      int cur = result * 10 + tail;

      // OVERFLOW DETECTION
      if ((cur - tail) / 10 != result)
        return 0;

      result = cur;

      x = x / 10;
    }

    return result * sign;
  }
}
