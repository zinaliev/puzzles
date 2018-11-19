package org.zinaliev.puzzles.math.pascal3;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PascalNthRowTest {

    private final PascalNthRow solution = new PascalNthRow();
    ArrayList<Integer> row;

    @Test
    public void test_0() {
        row = solution.getRow(0);

        assertEquals(1, row.size());

        assertEquals(Integer.valueOf(1), row.get(0));
    }

    @Test
    public void test_1() {
        row = solution.getRow(1);

        assertEquals(2, row.size());

        assertEquals(Integer.valueOf(1), row.get(0));
        assertEquals(Integer.valueOf(1), row.get(1));
    }

    @Test
    public void test_2() {
        row = solution.getRow(2);

        assertEquals(3, row.size());

        assertEquals(Integer.valueOf(1), row.get(0));
        assertEquals(Integer.valueOf(2), row.get(1));
        assertEquals(Integer.valueOf(1), row.get(2));
    }

    @Test
    public void test_4() {
        row = solution.getRow(4);

        assertEquals(5, row.size());

        assertEquals(Integer.valueOf(1), row.get(0));
        assertEquals(Integer.valueOf(4), row.get(1));
        assertEquals(Integer.valueOf(6), row.get(2));
        assertEquals(Integer.valueOf(4), row.get(3));
        assertEquals(Integer.valueOf(1), row.get(4));
    }

}