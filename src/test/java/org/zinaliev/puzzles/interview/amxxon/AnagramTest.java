package org.zinaliev.puzzles.interview.amxxon;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author rzinalie
 */
public class AnagramTest {

    @Test
    public void testNoAnagrams() {
        List<Integer> result = new Anagram().findAnagramStartIndixes("abcd", "efg");

        assertEquals(0, result.size());
    }

    @Test
    public void testNoAnagrams_NeedleSizeIsGraterThanHaystacks() {
        List<Integer> result = new Anagram().findAnagramStartIndixes("abcd", "efghijkl");

        assertEquals(0, result.size());
    }

    @Test
    public void testAnagramExists_OneLetterHaystackAndNeedle() {
        List<Integer> result = new Anagram().findAnagramStartIndixes("a", "a");

        assertEquals(1, result.size());
        assertEquals(Integer.valueOf(0), result.get(0));
    }

    @Test
    public void testNoAnagram_OneLetterHaystackAndNeedle() {
        List<Integer> result = new Anagram().findAnagramStartIndixes("a", "b");

        assertEquals(0, result.size());
    }

    @Test
    public void testManyAnagramExist_OneLetterNeedle() {
        List<Integer> result = new Anagram().findAnagramStartIndixes("aaaaa", "a");

        assertEquals(5, result.size());

        for (int i = 0; i < result.size(); i++)
            assertEquals(Integer.valueOf(i), result.get(i));
    }

    @Test
    public void testCloneAnagramExists() {
        List<Integer> result = new Anagram().findAnagramStartIndixes("abcdefg", "efg");

        assertEquals(1, result.size());
        assertEquals(Integer.valueOf(4), result.get(0));
    }

    @Test
    public void testAnagramExists() {
        List<Integer> result = new Anagram().findAnagramStartIndixes("abcdefg", "feg");

        assertEquals(1, result.size());
        assertEquals(Integer.valueOf(4), result.get(0));
    }
}