package org.zinaliev.puzzles.tree.trie.contacts;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Source - https://www.hackerrank.com/challenges/contacts/problem
 * <p>
 * - uses Map<String, Integer> to store count of each sub-word
 * - surprisingly didn't pass a couple of tests on HackerRank because of TimedOut failures
 */
public class Solution_HashMap {

    public static final String CMD_ADD = "add";
    public static final String CMD_FIND = "find";

    private static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cmdCount = in.nextInt();

        for (int i = 0; i < cmdCount; i++) {

            String cmdName = in.next();
            String cmdArg = in.next();

            if (CMD_ADD.equals(cmdName)) {
                add(cmdArg);
            } else if (CMD_FIND.equals(cmdName)) {
                find(cmdArg);
            } else {
                throw new IllegalArgumentException("unsupported command: " + cmdName);
            }
        }
    }

    private static void find(String word) {
        Integer count = map.get(word);

        if (count == null)
            count = new Integer(0);

        System.out.println(count);
    }

    private static void add(String word) {
        for (int i = 0; i < word.length(); i++) {
            String subWord = word.substring(0, i + 1);
            Integer subCount = map.get(subWord);

            if (subCount == null)
                subCount = new Integer(1);
            else
                subCount++;

            map.put(subWord, subCount);
        }
    }
}
