package org.zinaliev.puzzles.dynamic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxStockProfitTest {

  MaxStockProfit solution = new MaxStockProfit();

  @Test
  public void testNullOrTooSmall() {
    assertEquals(0, solution.maxProfit(null));
    assertEquals(0, solution.maxProfit(new int[0]));
    assertEquals(0, solution.maxProfit(new int[]{100}));

    assertEquals(0, solution.maxProfitMultiT(null));
    assertEquals(0, solution.maxProfitMultiT(new int[0]));
    assertEquals(0, solution.maxProfitMultiT(new int[]{100}));
  }

  @Test
  public void testDecreasingPrices() {
    assertEquals(0, solution.maxProfit(new int[]{7, 6, 5, 4, 3, 2, 1}));
    assertEquals(0, solution.maxProfitMultiT(new int[]{7, 6, 5, 4, 3, 2, 1}));
  }

  @Test
  public void testIncreasingPrices() {
    assertEquals(6, solution.maxProfit(new int[]{1, 2, 3, 4, 5, 6, 7}));
    assertEquals(6, solution.maxProfitMultiT(new int[]{1, 2, 3, 4, 5, 6, 7}));
  }

  @Test
  public void testWavePrices() {
    assertEquals(3, solution.maxProfit(new int[]{4, 5, 6, 7, 1, 2, 3}));
    assertEquals(5, solution.maxProfitMultiT(new int[]{4, 5, 6, 7, 1, 2, 3}));
  }

}