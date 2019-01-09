package org.zinaliev.puzzles.streams;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamApiTest {

    private final StreamApi solution = new StreamApi();

    private final List<Person> persons = new ArrayList<>();

    @Before
    public void setUp() {
        persons.add(new Person("Roman", "Zinaliev"));
        persons.add(new Person("Ivan", "Veresov"));
        persons.add(new Person("Artem", "Volobuev"));
        persons.add(new Person("Ivan", "Ivanov"));
        persons.add(new Person("Roman", "Petrov"));
    }

    @Test
    public void testFrequencies() {
        Map<Character, Integer> result_1 = solution.countFrequenciesStream("aaabbbcccdef");
        Map<Character, Integer> result_2 = solution.countFrequenciesNewMap("aaabbbcccdef");
        Map<Character, Integer> result_3 = solution.countFrequenciesCC("aaabbbcccdef");
        Map<Character, Integer> result_4 = solution.countFrequenciesCTM("aaabbbcccdef");

        Stream.of(result_1, result_2, result_3, result_4)
                .forEach(r -> {
                    r.forEach((c, i) -> System.out.println(c + "-> " + i));
                    System.out.println("---");
                });

        assertEquals(result_1, result_2);
        assertEquals(result_2, result_3);
        assertEquals(result_3, result_4);
    }

    @Test
    public void testCountLetter() {
        assertEquals(5, solution.countLetter("abcadefaghiaklmna", 'a'));
    }

    @Test
    public void testFirstOrX() {
        assertEquals('s', solution.firstOrX("string"));
        assertEquals('x', solution.firstOrX(""));
    }

    @Test
    public void testLastOrZ() {
        assertEquals('g', solution.lastOrZ("string"));
        assertEquals('z', solution.lastOrZ(""));
    }

    @Test
    public void testGetOrThrow() {
        assertEquals('g', solution.findOrThrow("string", 'g'));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetOrThrow_ValueNotExists_ThrowsException() {
        System.out.println(solution.findOrThrow("string", 'x'));
    }

    @Test
    public void testGetNthCharOrThrow_Positive() {
        assertEquals('r', solution.getNthCharOrThrow("string", 3));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetNthCharOrThrow_NGraterThanSize_ThrowsException() {
        System.out.println(solution.getNthCharOrThrow("string", 13));
    }

    @Test
    public void testSubstring() {
        assertEquals("ing", solution.substring("string", 3, 3));
    }

    @Test
    public void testGetFirstOnesGroupedByFirstName() {
        solution.getFirstOnesGroupedByFirstName(persons).forEach(
                (name, person) -> {
                    System.out.println(name + " -> " + person);
                });
    }

    @Test
    public void testIsFirstPlusLastNameUnique() {
        assertTrue(solution.isFirsAndLastNameUniqueCC(persons));
        assertTrue(solution.isFirsAndLastNameUnique(persons));

        persons.add(persons.get(0));

        assertFalse(solution.isFirsAndLastNameUniqueCC(persons));
        assertFalse(solution.isFirsAndLastNameUnique(persons));
    }

    @Test
    public void testGetUniqueFirstNamesChars() {
        List<Character> result = solution.getUniqueFirstNamesChars(persons);
        assertArrayEquals(
                new Character[]{'R', 'o', 'm', 'a', 'n', 'I', 'v', 'A', 'r', 't', 'e'},
                result.toArray(new Character[0])
        );
    }

    @Test
    public void testGetMaxMinDiff() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(11);
        numbers.add(8);
        assertEquals(10, solution.getMaxMinDiff(numbers));
    }

    @Test
    public void testMapBy1stCharJoining2ndChars() {
        List<String> items = new ArrayList<>();
        items.add("a1");
        items.add("a24");
        items.add("a3");
        items.add("b4");
        items.add("b5");
        items.add("b6");

        solution.mapBy1stCharJoining2ndChars(items).forEach((c, s) -> System.out.println(c + " -> " + s));

        Map<Character, String> expected = new HashMap<>();
        expected.put('a', "1:2:3");
        expected.put('b', "4:5:6");

        assertEquals(expected, solution.mapBy1stCharJoining2ndChars(items));
    }
}