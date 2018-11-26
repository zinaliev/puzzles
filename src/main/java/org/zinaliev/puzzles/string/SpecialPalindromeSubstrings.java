package org.zinaliev.puzzles.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Specil Palindrome
 * Again
 * A string is said to be a special palindromic string if either of two conditions is met:
 * All of the characters are the same, e.g. aaa .
 * All characters except the middle one are the same, e.g. aadaa.
 *
 * A special palindromic substring is any substring of a string which meets one of those criteria.
 * Given a string, determine how many special palindromic substrings can be formed from it.
 * For example, given the string , we have the following special palindromic substrings:
 * .
 * Function Description
 * Complete the substrCount function in the editor below. It should return an integer representing the
 * number of special palindromic substrings that can be formed from the given string.
 * substrCount has the following parameter(s):
 * n: an integer, the length of string s
 * s: a string
 * Input Format
 * The first line contains an integer, , the length of .
 * The second line contains the string .
 * Constraints
 * Each character of the string is a lowercase alphabet, .
 * Output Format
 * Print a single line containing the count of total special palindromic substrings.
 */
public class SpecialPalindromeSubstrings {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int count = 0;
        char c = s.charAt(0);
        Record record = new Record(c);
        List<Record> records = new ArrayList<>();

        for(int i = 1; i < n; i++) {
            if(s.charAt(i) != c) {
                records.add(record);
                c = s.charAt(i);
                record = new Record(c);
            } else {
                record.count++;
            }
        }
        records.add(record);

//        DEBUG
//        for(Record r : records)
//            System.out.print(r.value + ":" + r.count + "  ");

        int result = 0;

        for(Record r : records) {
            count = r.count;
            while(count > 0) {
                result += count;
                count--;
            }
        }

        for(int i = 1; i < records.size() - 1; i++) {
            Record curr = records.get(i);

            if(curr.count == 1) {
                Record prev = records.get(i - 1);
                Record next = records.get(i + 1);

                if(prev.value == next.value){
                    result += Math.min( prev.count, next. count);
                }
            }
        }

        return result;
    }

    static class Record {
        char value;
        int count = 1;

        Record(char c) {
            value = c;
        }
    }

}
