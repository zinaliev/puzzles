package org.zinaliev.puzzles.array;

import java.util.ArrayList;

/**
 * Given an array ‘A’ of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.
 * <p>
 * Example:
 * <p>
 * Input :
 * <p>
 * A : [1 3 5]
 * k : 4
 * Output : YES
 * <p>
 * as 5 - 1 = 4
 * <p>
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 * <p>
 * Try doing this in less than linear space complexity.
 */
public class ContainsItemsDiffByX {

  public int diffPossible(ArrayList<Integer> a, int k) {
    if (a == null || a.size() < 2)
      return 0;

    int i = 0;
    int j = 1;

    while (i < a.size() && j < a.size()) {

      if (a.get(i) + k == a.get(j) && i != j)
        return 1;
      else if (a.get(i) + k <= a.get(j)) {
        i++;
      } else {
        j++;
      }
    }

    return 0;
  }
}
