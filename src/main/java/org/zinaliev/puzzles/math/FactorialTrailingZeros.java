package org.zinaliev.puzzles.math;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * NOTE: Your solution should be in logarithmic time complexity.
 * <p>
 * Example :
 * <p>
 * n = 5
 * n! = 120
 * Number of trailing zeros = 1
 * So, return 1
 */
public class FactorialTrailingZeros {

    /**
     * The idea is:
     * <p>
     * The ZERO comes from 10.
     * <p>
     * The 10 comes from 2 x 5
     * <p>
     * And we need to account for all the products of 5 and 2, like 4×5 = 20 …
     * <p>
     * So, if we take all the numbers with 5 as a factor, we will have plenty of even numbers to pair with them to get factors of 10
     * <p>
     * Example 1:
     * <p>
     * How many multiples of 5 are there between 1 and 23?
     * <p>
     * These are 5, 10, 15, and 20, for four multiples of 5. Paired with 2s from the even factors, this makes for four factors of 10, so: 23! has 4 zeros.
     * <p>
     * Example 2:
     * <p>
     * How many multiples of 5 are there in the numbers from 1 to 100?
     * <p>
     * Because 100 ÷ 5 = 20, so, there are twenty multiples of 5 between 1 and 100.
     * <p>
     * But wait, actually 25 is 5×5, so each multiple of 25 has an extra factor of 5, e.g. 25 × 4 = 100，which introduces an extra of zero.
     * <p>
     * So, we need to know how many multiples of 25 are there between 1 and 100? Since 100 ÷ 25 = 4, there are four multiples of 25 between 1 and 100.
     * <p>
     * Finally, we get 20 + 4 = 24 trailing zeroes in 100!
     * <p>
     * The above examples tell us that we need to care about 5, 5×5, 5×5×5, 5×5×5×5 …
     * <p>
     * Example 3:
     * <p>
     * For given number 4617.
     * <p>
     * 5^1 : 4617 ÷ 5 = 923.4, so we get 923 factors of 5
     * <p>
     * 5^2 : 4617 ÷ 25 = 184.68, so we get 184 additional factors of 5
     * <p>
     * 5^3 : 4617 ÷ 125 = 36.936, so we get 36 additional factors of 5
     * <p>
     * 5^4 : 4617 ÷ 625 = 7.3872, so we get 7 additional factors of 5
     * <p>
     * 5^5 : 4617 ÷ 3125 = 1.47744, so we get 1 more factor of 5
     * <p>
     * 5^6 : 4617 ÷ 15625 = 0.295488, which is less than 1, so stop here.
     * <p>
     * Therefore, 4617! has 923 + 184 + 36 + 7 + 1 = 1151 trailing zeroes.
     */
    public int trailingZeroes(int a) {

        if (a < 0)
            return 0;

        int result = 0;
        int power = 1;
        int base = (int) Math.pow(5, power);

        while (base <= a) {

            int extra = a / base;
            result += extra;

            power++;
            base = (int) Math.pow(5, power);
        }

        return result;
    }
}
