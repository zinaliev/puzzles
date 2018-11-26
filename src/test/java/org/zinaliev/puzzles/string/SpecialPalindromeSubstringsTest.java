package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SpecialPalindromeSubstringsTest {

    @Test
    public void test_1() {
        assertEquals(7, SpecialPalindromeSubstrings.substrCount(5, "asasd"));
    }

    @Test
    public void test_2() {
        assertEquals(10, SpecialPalindromeSubstrings.substrCount(7, "abcbaba"));
    }

    @Test
    public void test_3() {
        assertEquals(10, SpecialPalindromeSubstrings.substrCount(4, "aaaa"));
    }
}