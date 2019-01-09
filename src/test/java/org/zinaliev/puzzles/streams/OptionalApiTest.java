package org.zinaliev.puzzles.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OptionalApiTest {

    OptionalApi api = new OptionalApi();

    @Test
    public void testGetPersonLastName() {
        assertEquals("", api.getPersonLastName(null));
        assertEquals("", api.getPersonLastName(new Person(null, null)));

        assertEquals("last", api.getPersonLastName(new Person("first", "last")));
    }

    @Test
    public void testGetPersonLastNameLetters() {
        assertTrue(api.getPersonLastNameLetters(null).isEmpty());
        assertTrue(api.getPersonLastNameLetters(new Person(null, null)).isEmpty());

        List<Character> expected = new ArrayList<>();
        expected.add('Z');
        expected.add('i');
        expected.add('n');
        expected.add('a');
        expected.add('l');
        expected.add('i');
        expected.add('e');
        expected.add('v');

        assertEquals(expected, api.getPersonLastNameLetters(new Person(null, "Zinaliev")));
    }
}