package org.zinaliev.puzzles.array;

import org.junit.Test;
import org.zinaliev.puzzles.util.ListHelpers;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    RemoveDuplicates solution = new RemoveDuplicates();
    ArrayList<Integer> input;

    @Test
    public void testRemoveDuplicates_11() {
        input = ListHelpers.asList(1, 1);

        assertEquals(1, solution.removeDupes(input));
        assertEquals(1, (int) input.get(0));
    }

    @Test
    public void testRemoveDuplicates_112233() {
        input = ListHelpers.asList(1, 1, 2, 2, 3, 3);

        assertEquals(3, solution.removeDupes(input));
        assertEquals(1, (int) input.get(0));
        assertEquals(2, (int) input.get(1));
        assertEquals(3, (int) input.get(2));
    }

    @Test
    public void testRemoveDuplicates_11222234566667() {
        input = ListHelpers.asList(1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 6, 6, 7);

        assertEquals(7, solution.removeDupes(input));
        assertEquals(1, (int) input.get(0));
        assertEquals(2, (int) input.get(1));
        assertEquals(3, (int) input.get(2));
        assertEquals(4, (int) input.get(3));
        assertEquals(5, (int) input.get(4));
        assertEquals(6, (int) input.get(5));
        assertEquals(7, (int) input.get(6));
    }

}