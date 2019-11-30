package org.zinaliev.puzzles;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.zinaliev.puzzles.ReverseShuffleMerge.reverseShuffleMerge;

public class ReverseShuffleMergeTest {

    @Test
    public void test_1() {
        assertEquals("agfedcb", reverseShuffleMerge("abcdefgabcdefg"));
    }

    @Test
    public void test_2() {
        assertEquals("aeiou", reverseShuffleMerge("aeiouuoiea"));
    }

    @Test
    public void test_3() {
        assertTrue(ReverseShuffleMerge.checkFits("jjcddjggcdjd", new char[]{'c', 'g', 'd', 'd', 'j', 'j'}));
    }

    @Test
    public void testNextPermutation_12345() {
        char[] a = new char[]{'1', '2', '3', '4', '5'};
        int count = 120; // 5!

        do {
            System.out.println(Arrays.toString(a));

            String prev = new String(a);
            a = ReverseShuffleMerge.nextPermutation(a);

            if (a != null) {
                String next = new String(a);

                assertTrue(next.compareTo(prev) > 0);
            }

            count--;
        } while (a != null);

        assertEquals(0, count);
    }

}