package leetcode.easy.two_pointers;


public class IsPalindrome_125 {

    public static void main(String[] args) {
        IsPalindrome_125 sol = new IsPalindrome_125();
        assert sol.isPalindrome("A man, a plan, a canal: Panama");
        assert !sol.isPalindrome("race a car");
        assert sol.isPalindrome("aa");
        assert sol.isPalindrome(" ");
        assert sol.isPalindrome(".");
        assert !sol.isPalindrome("ab");
        assert sol.isPalindrome("a.");
        assert !sol.isPalindrome("0P");
        assert sol.isPalindrome("1b1");
    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }

        boolean answer = true;
        int len = s.length();

        char[] s_arr = s.toLowerCase().toCharArray();

        for (int start = 0, end = len - 1; start < end; ) {

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
