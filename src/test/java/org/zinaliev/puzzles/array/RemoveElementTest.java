package org.zinaliev.puzzles.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.zinaliev.puzzles.util.ListHelpers.asList;

public class RemoveElementTest {

    private final RemoveElement solution = new RemoveElement();

    @Test
    public void test_1_1111() {

        assertEquals(0, solution.removeElement(asList(1, 1, 1, 1), 1));
    }

    @Test
    public void test_1_1213141() {

        ArrayList<Integer> input = asList(1, 2, 1, 3, 1, 4, 1);

        assertEquals(3, solution.removeElement(input, 1));

        assertEquals(Integer.valueOf(2), input.get(0));
        assertEquals(Integer.valueOf(3), input.get(1));
        assertEquals(Integer.valueOf(4), input.get(2));
    }
}
