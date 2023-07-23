package leetcode.easy.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("leetcode", "loveleetcode", "aabb");
        Map<String, Integer> results = new HashMap<>();

        for (String s: strings) {
            int i = firstUniqChar(s);
            results.put(s, i);
        }
        System.out.println(results);
    }


    static public int firstUniqChar(String s) {
        int[] count = new int[128];

        for (final char c : s.toCharArray()) {
            ++count[c];
        }

        for (int i = 0; i < s.length(); ++i)
            if (count[s.charAt(i)] == 1)
                return i;

        return -1;
    }

    static public int firstUniqCharSimple(String s) {
        int length = s.length();

        String str;

        for (int i = 0; i < length; i++) {
            if (i == length-1) {
                str = s.substring(0, i);
            } else {
                str = s.substring(0, i) + s.substring(i+1);
            }

            if (!str.contains(s.charAt(i)+"")) {
                return i;
            }

        }
        return -1;
    }


}
