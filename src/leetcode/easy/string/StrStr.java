package leetcode.easy.string;

/**
 * Find the Index of the First Occurrence in a String
 */
public class StrStr {
    public static void main(String[] args) {
//        Assertions.assertEquals(-1, strStr("leetcode", "leeto"));
//        Assertions.assertEquals(2, strStr("abc", "c"));
//        Assertions.assertEquals(0, strStr("sadbutsad", "sad"));
//        Assertions.assertEquals(2, strStr("hello", "ll"));
//        Assertions.assertEquals(4, strStr("mississippi", "issip"));
//        Assertions.assertEquals(4, strStr("mississippi", "issipi"));

    }

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
