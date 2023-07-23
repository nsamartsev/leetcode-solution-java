package leetcode.easy.design;

import java.util.Stack;

public class MinStack_155 {
    public static void main(String[] args) {
        var minStack = new MinStackImpl();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assert minStack.getMIN() == -3; // return -3
        minStack.pop();
        assert minStack.top() == 0;    // return 0
        assert minStack.getMIN() == -2; // return -2
    }

    static class MinStackImpl {
        private final Stack<Integer> stack = new Stack<>();
        private final Stack<Integer> minStack = new Stack<>();

        public void push(int val) {
            if (stack.empty() || val <= minStack.peek()) {
                minStack.push(val);
            }
            stack.push(val);
        }

        public void pop() {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMIN() {
            return minStack.peek();
        }

    }
}
