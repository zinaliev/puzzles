package org.zinaliev.puzzles.dynamic;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class MaxStockProfit {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2)
            return 0;

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int p : prices) {
            if (p < min)
                min = p;

            if (p - min > maxProfit)
                maxProfit = p - min;
        }

        return maxProfit;
    }

    /**
     * The same as {@link #maxProfit(int[])}
     * but multiple transactions are allowed, so you can buy and sell multiple times
     * Note: you can't sell and buy in the same day
     */
    public int maxProfitMultiT(int[] prices) {
        int result = 0;

        if (prices == null) {
            return result;
        }

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                result += prices[i + 1] - prices[i];
            }
        }

        return result;
    }


}
