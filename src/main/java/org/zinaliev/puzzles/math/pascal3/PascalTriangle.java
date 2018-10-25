package org.zinaliev.puzzles.math.pascal3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given numRows, generate the first numRows of Pascal’s triangle.
 * <p>
 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
 * <p>
 * Example:
 * <p>
 * Given numRows = 5,
 * <p>
 * Return
 * <p>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {


  public ArrayList<ArrayList<Integer>> generate(int a) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    if(a == 0)
      return result;

    ArrayList<Integer> lastRow = new ArrayList<>(Collections.nCopies(a, 1));

    int k = 1;

    do {
      ArrayList<Integer> row = new ArrayList<>();

      for(int i = 0; i < k; i++)
        row.add(lastRow.get(i));

      result.add(row);

      for(int i = k - 1; i > 0; i--) {
        lastRow.set(i, lastRow.get(i) + lastRow.get(i - 1));
      }

      k++;
    } while (k <= a );


    for(ArrayList<Integer> r : result)
      System.out.println(Arrays.toString(r.toArray()));

    return result;

  }
}
