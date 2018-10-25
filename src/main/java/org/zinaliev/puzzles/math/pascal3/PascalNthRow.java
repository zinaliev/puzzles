package org.zinaliev.puzzles.math.pascal3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given an index k, return the kth row of the Pascal’s triangle.
 *
 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
 *
 * Example:
 *
 * Input : k = 3
 *
 * Return : [1,3,3,1]
 * NOTE : k is 0 based. k = 0, corresponds to the row [1].
 *
 * Note:Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalNthRow {

  public ArrayList<Integer> getRow(int a) {

    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1
    // 1 5 10 10 5 1
    // 1 6 15 20 15 10 6 1

    ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(a + 1, 1));

    int k = 0;
    while(k < a) {
      k++;

      for(int i = k - 1; i > 0; i-- ) {
        res.set(i, res.get(i) + res.get(i - 1));
      }

      System.out.println(Arrays.toString(res.toArray()));
    }

    return res;
  }
}
