package leetcode.easy.stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @url: <a href="https://leetcode.com/problems/valid-parentheses/">link</a>
 */

public class ValidParentheses_20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.isValid("()[]{}");
        assert !solution.isValid("(]");
        assert solution.isValid("()");
    }

    static class Solution {
        public boolean isValid(String s) {
            Map<Character, Character> brackets = new HashMap<>();
            brackets.put(')', '(');
            brackets.put('}', '{');
            brackets.put(']', '[');

            Deque<Character> stack = new LinkedList<>();
            boolean isValid = false;

            for (char c : s.toCharArray()) {
                if (brackets.containsValue(c)) {
                    stack.push(c);
                } else if (brackets.containsKey(c)) {
                    if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                        return false;
                    }
                }
            }

            if (stack.size() == 0) {
                isValid = true;
            }

            return isValid;
        }
    }
}


