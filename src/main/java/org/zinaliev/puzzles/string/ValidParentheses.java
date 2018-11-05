package org.zinaliev.puzzles.string;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {

  public boolean isValid(String s) {
    if(s == null)
      return true;

    Deque<Character> stack = new LinkedList<>();

    for(int i = 0; i < s.length(); i++){
      Character c = s.charAt(i);

      if(c == '(' || c == '[' || c == '{')
        stack.addFirst(c);
      else {

        if(stack.isEmpty())
          return false;

        Character prev = stack.pollFirst();

        if( (prev == '(' && c != ')') ||
            (prev == '{' && c != '}') ||
            (prev == '[' && c != ']')) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }
}
