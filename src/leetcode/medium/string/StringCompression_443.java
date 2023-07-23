package leetcode.medium.string;


/**
 * @Title 443. String Compression
 * @Level: Medium
 * @Url <a href="https://leetcode.com/problems/string-compression/description/">Leetcode</a>
 * @Author Nikita Samartsev
 */

public class StringCompression_443 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}) == 6;
        assert solution.compress(new char[]{'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}) == 5;
    }

    static class Solution {
        public int compress(char[] chars) {
            int len = chars.length;

            int newLen = 0;

            // corner case
            if (len == 1) return 1;

            int i = 0;
            while (i < len) {
                char letter = chars[i];

                // вычислить количество символов
                int count = 0;
                while (i < len && chars[i] == letter) {
                    count++;
                    i++;
                }
                chars[newLen] = letter;
                newLen++;

                /// ????
                if (count > 1) {
                    char[] countStr = String.valueOf(count).toCharArray();
                    for (char c : countStr) {
                        chars[newLen] = c;
                        newLen++;
                    }
                }
            }
            return newLen;
        }
    }
}



