package leetcode.easy.string;

import java.util.Arrays;

public class ReverseString_344 {
    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverseString(input);

        assert Arrays.equals(input, new char[]{'o', 'l', 'l', 'e', 'h'});
    }

    public static void reverseString(char[] s) {
        int lenght = s.length;

        int l = 0;
        int r = lenght - 1;

        while (l < r) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
}
