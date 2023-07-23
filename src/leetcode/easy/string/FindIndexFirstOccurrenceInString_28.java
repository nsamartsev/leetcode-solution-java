package leetcode.easy.string;

/**
 * Find the Index of the First Occurrence in a String
 */
public class FindIndexFirstOccurrenceInString_28 {
    public static void main(String[] args) {
        assert Solution.strStr("leetcode", "leeto") == -1;
        assert Solution.strStr("abc", "c") == 2;
        assert Solution.strStr("sadbutsad", "sad") == 0;
        assert Solution.strStr("hello", "ll") == 2;
        assert Solution.strStr("mississippi", "issip") == 4;
        assert Solution.strStr("mississippi", "issipi") == 4;
    }

    static class Solution {
        public static int strStr(String haystack, String needle) {
            int start = -1;

            int haystack_len = haystack.length();
            int needle_len = needle.length();

            if (haystack_len < needle_len) {
                return -1;
            }

            if (haystack.equals(needle)) {
                return 0;
            }

            for (int i = 0; i < haystack_len; i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    if (haystack.substring(i, i + needle_len).equals(needle)) {
                        start = i;
                        return start;
                    }
                }
            }

            return start;
        }
    }
}
