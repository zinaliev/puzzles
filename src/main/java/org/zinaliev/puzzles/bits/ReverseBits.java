package org.zinaliev.puzzles.bits;

public class ReverseBits {

  public long reverse(long a) {
    long original = a;
    long right = 1;
    long left = right << 31;
    long mask = left ^ right;

    for (int i = 1; i < 16; i++) {
//      if (getBit(a, i) != getBit(a, 32 - i)) {
//        a = a ^ mask;
//      }

      if(bitsEqual(a, mask)){
        a = a ^ mask;
      }

      left = left >> 1;
      right = right << 1;
      mask = left ^ right;
    }

    return a;

  }

  private long getBit(long source, int i) {
    return (source << (64 - i)) >> 63;
  }

  private boolean bitsEqual(long source, long mask){
    long masked = source & mask;

    return (masked ^ mask) == mask || (masked ^ mask) == 0;
  }
}
