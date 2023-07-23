package leetcode.easy.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern_290 {

    public static void main(String[] args) {
        System.out.println(new WordPattern_290().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new WordPattern_290().wordPattern("abba", "dog cat cat fish"));
        System.out.println(new WordPattern_290().wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(new WordPattern_290().wordPattern("aaaa", "dog dog dog dog"));
        System.out.println(new WordPattern_290().wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        boolean answer = true;
        int patternLen = pattern.length();
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < patternLen; i++) {
            char x = pattern.charAt(i);
            String y = words[i];

            if (map.containsKey(x)) {
                if (!map.get(x).equals(y)) {
                    return false;
                }
            } else {
                if (set.contains(y)) {
                    return false;
                }
                map.put(x, y);
                set.add(y);
            }
        }

        return answer;
    }

}
