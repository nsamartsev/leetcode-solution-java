package leetcode.easy.string;

import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        var sol = new Solution();
        assert sol.isAnagram("anagram", "nagaram");
        assert sol.isAnagram("rat", "car");
    }

    static class Solution {
        public boolean isAnagram(String s, String t) {

            if (s.length() != t.length())
                return false;

            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(t1);

            String res1 = new String(s1);
            String res2 = new String(t1);

            if (res1.equals(res2))
                return true;
            else
                return false;
        }
    }
}
