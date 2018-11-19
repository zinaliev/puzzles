package org.zinaliev.puzzles.list;

import org.junit.Test;
import org.zinaliev.puzzles.util.ListHelpers;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ContainsItemsDiffByXTest {

    private final ContainsItemsDiffByX solution = new ContainsItemsDiffByX();

    private List<Integer> input;

    @Test
    public void test_2_2() {
        input = ListHelpers.asList(2);

        assertEquals(0, solution.diffPossible(input, 0));
    }

    @Test
    public void test_35244_0() {
        input = ListHelpers.asList(3, 5, 2, 4, 4);

        assertEquals(1, solution.diffPossible(input, 0));
    }

    @Test
    public void test_352_1() {
        input = ListHelpers.asList(3, 5, 2);

        assertEquals(1, solution.diffPossible(input, 1));
    }

    @Test
    public void test_352_4() {
        input = ListHelpers.asList(3, 5, 2);

        assertEquals(0, solution.diffPossible(input, 4));

    }
}