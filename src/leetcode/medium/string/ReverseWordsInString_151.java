package leetcode.medium.string;

/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/">link</a>
 */

public class ReverseWordsInString_151 {
    public static void main(String[] args) {
        assert new Solution().reverseWords("  hello world  ").equals("world hello");
    }

    static class Solution {
        public String reverseWords(String s) {
            String[] arr = s.split(" ");
            int n = arr.length;

            StringBuilder result = new StringBuilder();

            for (int i = n - 1; i >= 0; i--) {
                if (!arr[i].equals("")) {
                    result.append(arr[i]);
                    result.append(" ");
                }
            }

            result.replace(result.length() - 1, result.length(), "");

            return result.toString();
        }
    }
}
