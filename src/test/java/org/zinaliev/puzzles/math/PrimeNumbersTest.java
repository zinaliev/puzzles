package org.zinaliev.puzzles.math;

import org.junit.Test;
import org.zinaliev.puzzles.util.ListHelpers;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    private PrimeNumbers solution = new PrimeNumbers();

    @Test
    public void testIsPrime_Complex() {

        assertFalse(solution.isPrime(4));
        assertFalse(solution.isPrime(38));
        assertFalse(solution.isPrime(1024));
        assertFalse(solution.isPrime(1));
        assertFalse(solution.isPrime(-1));
        assertFalse(solution.isPrime(0));

        assertTrue(solution.isPrime(2));
        assertTrue(solution.isPrime(3));
        assertTrue(solution.isPrime(7));
        assertTrue(solution.isPrime(137));
    }

    @Test
    public void testIsPrime_OnFirstPrimesBefore1000() {
        solution.listPrimes(1000).forEach(prime -> assertTrue(solution.isPrime(prime)));
    }

    @Test
    public void testCountPrimes_2() {
        assertEquals(0, solution.countPrimesCA(2));
    }

    @Test
    public void testCountPrimesCA_200_Returns46() {
        assertEquals(46, solution.countPrimesCA(200));
    }

    @Test
    public void testListPrimes_200() {
        ArrayList<Integer> expected = ListHelpers.asList(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
        );

        assertArrayEquals(expected.toArray(), solution.listPrimes(200).toArray());
    }
}