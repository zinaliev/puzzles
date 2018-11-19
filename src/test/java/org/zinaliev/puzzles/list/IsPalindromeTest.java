package org.zinaliev.puzzles.list;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPalindromeTest {

    private final IsPalindrome solution = new IsPalindrome();

    @Test
    public void test_1_2_3_3_2_1() {
        assertTrue(solution.isPalindrome(ListNode.of(1, 2, 3, 3, 2, 1)));
    }

    @Test
    public void test_1_2_3_4_3_2_1() {
        assertTrue(solution.isPalindrome(ListNode.of(1, 2, 3, 4, 3, 2, 1)));
    }

    @Test
    public void test_1_2_3_4_3_2_2() {
        assertFalse(solution.isPalindrome(ListNode.of(1, 2, 3, 4, 3, 2, 2)));
    }

    @Test
    public void test_1_2_3_4_5_3_2_1() {
        assertFalse(solution.isPalindrome(ListNode.of(1, 2, 3, 4, 5, 3, 2, 1)));
    }

    @Test
    public void test_1() {
        assertTrue(solution.isPalindrome(ListNode.of(1)));
    }

    @Test
    public void test_Null() {
        assertTrue(solution.isPalindrome(null));
    }


}