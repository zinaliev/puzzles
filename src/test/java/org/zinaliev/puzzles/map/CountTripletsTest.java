package org.zinaliev.puzzles.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CountTripletsTest {

  private final CountTriplets solution = new CountTriplets();

  @Test
  public void test() {
    List<Long> arr = new ArrayList<>();
    arr.add(1L);
    arr.add(5L);
    arr.add(5L);
    arr.add(25L);
    arr.add(125L);

    long r = 5;

    assertEquals(4, solution.getTripletsCount(arr, r));
  }
}