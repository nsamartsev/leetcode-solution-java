package leetcode.easy.math;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber_9 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.isPalindrome(131);
        assert !solution.isPalindrome(122);
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x >= 0) {
                String xStr = String.valueOf(x);
                int len = xStr.length();

                for (int i = 0; i < len; i++) {
                    if (xStr.charAt(i) != xStr.charAt(len - 1 - i)) {
                        return false;
                    }
                }

                return true;
            }

            return false;
        }
    }
}
