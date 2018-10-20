package org.zinaliev.puzzles.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.
 * <p>
 * Example :
 * <p>
 * Input :
 * <p>
 * A : [1 5 3]
 * k : 2
 * Output :
 * <p>
 * 1
 * as 3 - 1 = 2
 * <p>
 * Return 0 / 1 for this problem.
 * <p>
 * <p>
 * NOTE: This version is for an UNSORTED ARRAY
 *       Version for sorted array - {@link org.zinaliev.puzzles.array.SortedContainsItemsDiffByX}
 */
public class ContainsItemsDiffByX {

  public int diffPossible(final List<Integer> a, int b) {
    Map<Integer, Integer> freq = new HashMap<>();

    for (Integer i : a) {
      freq.merge(i, 1, (k, v) -> v + 1);
    }

    for (Integer i : a) {
      if (b == 0) {
        if (freq.get(i) > 1) {
          return 1;
        }
      } else if (freq.containsKey(i + b) || freq.containsKey(i - b)) {
        return 1;
      }
    }

    return 0;
  }
}
