package org.zinaliev.puzzles.string;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.zinaliev.puzzles.string.SubstringAnagramsCount.countAnagramSubstrings;

public class SubstringAnagramsCountTest {

    @Test
    public void test_1() {
        assertEquals(0, countAnagramSubstrings("abcd"));
    }

    @Test
    public void test_2() {
        assertEquals(10, countAnagramSubstrings("aaaa"));
    }

    @Test
    public void test_3() {
        assertEquals(4, countAnagramSubstrings("abba"));
    }

    @Test
    public void test_4() {
        assertEquals(3, countAnagramSubstrings("ifailuhkqq"));
    }

}