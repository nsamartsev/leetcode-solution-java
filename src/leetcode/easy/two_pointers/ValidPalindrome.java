package leetcode.easy.two_pointers;

public class ValidPalindrome {

    public static void main(String[] args) {
        assert new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama");
        assert new ValidPalindrome().isPalindrome("race a car");

    }

    public boolean isPalindrome(String s) {
        if (s.equals(" ") || s.isEmpty()) {
            return true;
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                result.append(s.charAt(i));
            }
        }

        char[] chars = result.toString().toUpperCase().toCharArray();
        int start = 0, end = chars.length - 1;

        while (start <= end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
