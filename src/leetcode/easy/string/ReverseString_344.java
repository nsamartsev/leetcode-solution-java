package leetcode.easy.string;

public class ReverseString_344 {
    public static void main(String[] args) {
//        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] input = {'t','h','i','s','i','s','t','e','s','t' };
        reverseString(input);
    }

    public static void reverseString(char[] s) {
        int lenght = s.length;

        for (int i = 0, j = lenght-1; i < lenght/2; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}
