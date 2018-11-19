package org.zinaliev.puzzles.util;

import java.util.ArrayList;

public class ListHelpers {

    public static ArrayList<Integer> asList(int... a) {
        ArrayList<Integer> result = new ArrayList<>(a.length);

        for (int i : a) {
            result.add(i);
        }

        return result;
    }
}
