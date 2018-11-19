package org.zinaliev.puzzles.math.longarithm;

import java.util.ArrayList;

/**
 * Given a non-negative number represented as an array of digits,
 * <p>
 * add 1 to the number ( increment the number represented by the digits ).
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 * <p>
 * Example:
 * <p>
 * If the vector has [1, 2, 3]
 * <p>
 * the returned vector should be [1, 2, 4]
 * <p>
 * as 123 + 1 = 124.
 * <p>
 * NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
 * For example, for this problem, following are some good questions to ask :
 * <p>
 * Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
 * A : For the purpose of this question, YES
 * <p>
 * Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
 * A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 */
public class PlusOne {

    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {

        int carry = 1;
        int x;

        for (int i = a.size() - 1; i >= 0; i--) {
            x = carry + a.get(i);
            carry = x / 10;

            a.set(i, x % 10);
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (carry == 1)
            result.add(carry);

        for (Integer i : a) {

            if (result.isEmpty() && i == 0)
                continue;

            result.add(i);
        }

        return result;
    }
}
