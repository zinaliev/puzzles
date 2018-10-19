package org.zinaliev.puzzles.bits;

/**
 * Reverse bits of an 32 bit unsigned integer
 *
 * Example 1:
 *
 * x = 0,
 *
 *           00000000000000000000000000000000
 * =>        00000000000000000000000000000000
 * return 0
 *
 * Example 2:
 *
 * x = 3,
 *
 *           00000000000000000000000000000011
 * =>        11000000000000000000000000000000
 * return 3221225472
 *
 * NOTE: Since java does not have unsigned int, use long
 */
public class ReverseBits {

  public long reverse(long a) {
    long result = 0;
    long mask;

    for (int i = 0; i < 32; i++) {

      // traverse bits in reversed order
      result = result << 1;

      mask = 1 << i;


//      !!!! this was my initial solution
//      BUT
//      (long) (1 << 31) doesn't equal to
//      00000000_00000000_00000000_00000000_10000000_00000000_00000000_00000000
//      as I expected but equals to
//      11111111_11111111_11111111_11111111_10000000_00000000_00000000_00000000
//      if ((a & mask) == mask) {

      // to check i-th bit value
      if ((a & mask) != 0) {

        // 'append' 1 to result
        result = result | 1;
      }

    }

    return result;
  }
}
