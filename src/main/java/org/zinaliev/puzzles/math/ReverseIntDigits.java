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

  public int reverse(int a) {
    int sign = a < 0 ? -1 : 1;
    a *= sign;

    long result = 0;

    while (a > 0) {
      result *= 10;
      result += a % 10;

      a /= 10;
    }

    if (result >= Integer.MAX_VALUE)
      result = 0;


    return (int) (result * sign);
  }
}
