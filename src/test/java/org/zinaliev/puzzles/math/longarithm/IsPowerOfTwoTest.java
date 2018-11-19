package org.zinaliev.puzzles.math.longarithm;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPowerOfTwoTest {

    private final IsPowerOfTwo solution = new IsPowerOfTwo();
    ArrayList<Integer> bigInt;

    @Test
    public void test_0() {
        assertFalse(solution.isPowerOfTwo("0"));
    }

    @Test
    public void test_1() {
        assertFalse(solution.isPowerOfTwo("1"));
    }

    @Test
    public void test_2() {
        assertTrue(solution.isPowerOfTwo("2"));
    }

    @Test
    public void test_6() {
        assertFalse(solution.isPowerOfTwo("6"));
    }

    @Test
    public void test_8() {
        assertTrue(solution.isPowerOfTwo("8"));
    }

    @Test
    public void test_9() {
        assertFalse(solution.isPowerOfTwo("9"));
    }

    @Test
    public void test_16() {
        assertTrue(solution.isPowerOfTwo("16"));
    }

    @Test
    public void test_128() {
        assertTrue(solution.isPowerOfTwo("128"));
    }

    @Test
    public void test_130() {
        assertFalse(solution.isPowerOfTwo("130"));
    }

    @Test
    public void test_32768() {
        assertTrue(solution.isPowerOfTwo("32768"));
    }

    @Test
    public void test_32769() {
        assertFalse(solution.isPowerOfTwo("32769"));
    }

    @Test
    public void test_32770() {
        assertFalse(solution.isPowerOfTwo("32770"));
    }


    @Test
    public void testDivideByTwo_1111() {
        System.out.print(" " + solution.divideByTwo(solution.asInts("768"), 0));
        System.out.print(" " + solution.divideByTwo(solution.asInts("1024"), 0));
        System.out.print(" " + solution.divideByTwo(solution.asInts("10003"), 0));
        System.out.print(" " + solution.divideByTwo(solution.asInts("10004"), 0));
    }
}