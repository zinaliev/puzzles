package org.zinaliev.puzzles.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LongestCommonSubsequenceTest {

    @Test
    public void test_abc_def() {
        assertEquals(0, LongestCommonSubsequence.commonChild("abc", "def"));
    }

    @Test
    public void test_abc_abc() {
        assertEquals(3, LongestCommonSubsequence.commonChild("abc", "abc"));
    }

    @Test
    public void test_NOHARAAA_SHINCHAN() {
        assertEquals(3, LongestCommonSubsequence.commonChild("SHINCHAN", "NOHARAAA"));
    }
}