package org.zinaliev.puzzles.bits;

/**
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.
 *
 * Example:
 *
 * The 32-bit integer 11 has binary representation
 *
 * 00000000000000000000000000001011
 * so the function should return 3.
 *
 * Note that since Java does not have unsigned int, use long for Java
 */
public class CountOneBits {

  public int numSetBits(long a) {
    int result = 0;
    long flag = 1;

    int bits = 32;
    do {
      if((a & flag) == flag) {
        result++;
      }

      flag = flag << 1;

    } while( --bits > 0);

    return result;
  }
}
