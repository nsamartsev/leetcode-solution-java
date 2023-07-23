package leetcode.easy.string;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        assert new Solution().lengthOfLastWord("Hello World") == 5;
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
            String[] arr = s.split(" ");
            int n = arr.length;
            return arr[n-1].length();
        }
    }
}
