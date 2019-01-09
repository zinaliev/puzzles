package org.zinaliev.interview;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RevolutTest {

    private final Revolut revolut = new Revolut();

    @Test(expected = IllegalArgumentException.class)
    public void testCountCharsFrequencies_NullInput_ThrowsException() {
        revolut.countCharsFrequencies(null);
    }

    @Test
    public void testCountCharsFrequencies_EmptyString_EmptyMap() {
        assertTrue(revolut.countCharsFrequencies("").isEmpty());
    }

    @Test
    public void testCountCharsFrequencies_UniqueCharsString_ValidCounts() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('c', 1);

        assertEquals(expected, revolut.countCharsFrequencies("abc"));
    }

    @Test
    public void testCountCharsFrequencies_ValidString_ValidCounts() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 3);
        expected.put('c', 4);

        assertEquals(expected, revolut.countCharsFrequencies("abacbbccc"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testCountCharsFrequenciesOfStream_NullInput_ThrowsException() {
        revolut.countCharsFrequenciesOfStream(null);
    }

    @Test
    public void testCountCharsFrequenciesOfStream_EmptyString_EmptyMap() {
        assertTrue(revolut.countCharsFrequenciesOfStream("".chars().mapToObj(i -> (char) i)).isEmpty());
    }

    @Test
    public void testCountCharsFrequenciesOfStream_UniqueCharsString_ValidCounts() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('c', 1);

        assertEquals(expected, revolut.countCharsFrequenciesOfStream("abc".chars().mapToObj(i -> (char) i)));
    }

    @Test
    public void testCountCharsFrequenciesOfStream_ValidString_ValidCounts() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 3);
        expected.put('c', 4);

        assertEquals(expected, revolut.countCharsFrequenciesOfStream("abacbbccc".chars().mapToObj(i -> (char) i)));
    }

    @Test
    public void testCountCharsFrequenciesOfStream_BigStream_ValidCounts() {
        long size = 1024 * 1024;
//        long size = (long) Integer.MAX_VALUE + 1;

        Stream<Character> source = Stream.iterate('a', operand -> operand);
//                .limit(size);
//                .mapToObj(i -> (char) i);

        System.out.println("Source stream constructed");

        Map<Character, Long> expected = new HashMap<>();
        expected.put('a', size);
        System.out.println("Expected map created");

        Map<Character, Long> actual = revolut.countCharsFrequenciesOfStream(source);

        assertEquals(expected, actual);
    }
}