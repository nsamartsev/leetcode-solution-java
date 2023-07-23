package leetcode.medium.stack;

import java.util.Stack;

public class SimplifyPath_71 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.simplifyPath("/home//foo/").equals("/home/foo");
        assert solution.simplifyPath("/a/./b/../../c/").equals("/c");
    }

    static class Solution {

        public String simplifyPath(String path) {
            String[] paths = path.split("/");
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < paths.length; i++) {
                if (paths[i].equals("") || paths[i].equals(".")) {
                    continue;
                } else if (paths[i].equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(paths[i]);
                }
            }
            if (stack.isEmpty()) {
                return "/";
            }
            StringBuilder result = new StringBuilder();
            while (!stack.isEmpty()) {
                String pop = stack.pop();
                result.insert(0, "/" + pop);
            }
            return result.toString();
        }

    }


}


