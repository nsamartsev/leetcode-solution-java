package leetcode.easy.two_pointers;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome-ii/description/">url</a>
 */
public class ValidPalindrome2_680 {
    public static void main(String[] args) {
        assert new Solution().validPalindrome("aba");
    }

    static class Solution {
        public boolean validPalindrome(String s) {
            int len = s.length();

            int start = 0, end = len - 1;

            while (start < end) {
                if (s.charAt(start) != s.charAt(end)) {
                    String s1 = s.substring(start + 1, end + 1);
                    String s2 = s.substring(start, end);

                    return s1.equals(new StringBuilder(s1).reverse().toString()) ||
                            s2.equals(new StringBuilder(s2).reverse().toString());
                }
                start++;
                end--;
            }

            return true;
        }
    }
}
