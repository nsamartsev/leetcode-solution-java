package leetcode.medium.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateStackSequences_946 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.validateStackSequences(new int[]{1, 2, 3}, new int[]{3, 2, 1});
    }

    static class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Deque<Integer> stack = new ArrayDeque<>();

            int i = 0;

            for (final int x : pushed) {
                stack.push(x);
                while (!stack.isEmpty() && (stack.peek() == popped[i])) {
                    stack.pop();
                    i++;
                }
            }

            return stack.isEmpty();
        }
    }
}


