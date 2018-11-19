package org.zinaliev.puzzles.math.longarithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

/**
 * Find if Given number is power of 2 or not.
 * More specifically, find if given number can be expressed as 2^k where k >= 1.
 * <p>
 * Input:
 * <p>
 * number length can be more than 64, which mean number can be greater than 2 ^ 64 (out of long long range)
 * Output:
 * <p>
 * return 1 if the number if a power of 2 else return 0
 * <p>
 * Example:
 * <p>
 * Input : 128
 * Output : 1
 */
public class IsPowerOfTwo {

    public int power(String a) {
        return isPowerOfTwo(a) ? 1 : 0;
    }

    public boolean isPowerOfTwo(String num) {

        if (num == null || num.length() == 0)
            return false;

        ArrayList<Integer> bigInt = asInts(num);

        int start = 0;
        int end = bigInt.size() - 1;

        int carry = 0;
        int cur = 0;

        while (start <= end) {

            if (start == end && bigInt.get(start) == 2)
                return true;

            start = divideByTwo(bigInt, start);

            if (start == -1) {
                return false;
            }
        }

        return false;
    }

    protected int divideByTwo(ArrayList<Integer> bigInt, int start) {
        int carry = 0;
        int cur = 0;

        for (int i = start; i < bigInt.size(); i++) {
            cur = bigInt.get(i) + carry;

            carry = cur % 2 != 0 ? 10 : 0;
            cur = cur / 2;

            bigInt.set(i, cur);
        }

        if (bigInt.get(start) == 0)
            start++;

        System.out.println(Arrays.toString(bigInt.toArray()));

        if (carry != 0)
            return -1;
        else
            return start;
    }

    protected ArrayList<Integer> asInts(String num) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < num.length(); i++) {
            result.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }

        Deque<Integer> stack = new ArrayDeque<>();

        return result;
    }
}
