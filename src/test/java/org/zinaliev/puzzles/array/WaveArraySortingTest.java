package org.zinaliev.puzzles.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WaveArraySortingTest {

    WaveArraySorting solution = new WaveArraySorting();
    ArrayList<Integer> a = new ArrayList<>();

    @Test
    public void name() {
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        solution.wave(a);

        assertEquals(Integer.valueOf(2), a.get(0));
        assertEquals(Integer.valueOf(1), a.get(1));
        assertEquals(Integer.valueOf(4), a.get(2));
        assertEquals(Integer.valueOf(3), a.get(3));
    }
}