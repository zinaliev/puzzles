package org.zinaliev.puzzles.search;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

    @Test
    public void test_IntMaxValue_1702766719() {
        assertEquals(1702766719, new FirstBadVersion(1702766719).firstBadVersion(Integer.MAX_VALUE));
    }

    @Test
    public void test_10_11() {
        assertEquals(10, new FirstBadVersion(11).firstBadVersion(10));
    }

    @Test
    public void test_10_Minus1() {
        assertEquals(1, new FirstBadVersion(-1).firstBadVersion(10));
    }

    @Test
    public void test_2_1() {
        assertEquals(1, new FirstBadVersion(1).firstBadVersion(2));
    }

    @Test
    public void test_1_1() {
        assertEquals(1, new FirstBadVersion(1).firstBadVersion(1));
    }

    @Test
    public void test_2_2() {
        assertEquals(2, new FirstBadVersion(2).firstBadVersion(2));
    }


    @Test
    public void name() {
        Map<Integer, Integer> map = new HashMap<>();
    }
}