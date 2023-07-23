package leetcode.medium.string;

public class ValidPalindrome_152 {
    public static void main(String[] args) {
        var solution = new Solution();
        assert solution.isPalindrome("A man, a plan, a canal: Panama");
        assert !solution.isPalindrome("race a car");
        assert solution.isPalindrome(" ");
    }

    static class Solution {
        public boolean isPalindrome(String s) {

            char[] chars = s.toCharArray();
            int len = chars.length;
            int i = 0, j = 0;

            while (i < len) {
                if (chars[i] < 'A') {
                    chars[i] = chars[j + 1];
                    j++;
                }
                i++;
            }

            return true;
        }
    }

    static class Solution2 {
        public boolean isPalindrome(String s) {
            if (s.isEmpty() || s.length() == 1) {
                return true;
            }

            boolean answer = true;
            int len = s.length();

            char[] s_arr = s.toLowerCase().toCharArray();
            int start = 0, end = len - 1;
            while (start < end) {

                char left_symbol = s_arr[start];
                char right_symbol = s_arr[end];

                if ((Character.isAlphabetic(left_symbol) || Character.isDigit(left_symbol)) &&
                        (Character.isAlphabetic(right_symbol) || Character.isDigit(right_symbol)) &&
                        left_symbol != right_symbol) {
                    answer = false;
                    break;
                } else if (!Character.isAlphabetic(left_symbol) && !Character.isDigit(left_symbol)) {
                    start++;
                    continue;
                } else if (!Character.isAlphabetic(right_symbol) && !Character.isDigit(right_symbol)) {
                    end--;
                    continue;
                }
                start++;
                end--;
            }

            return answer;
        }
    }
}
