package leetcode.easy.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(new IsIsomorphic().isIsomorphic("egg", "add"));
        System.out.println(new IsIsomorphic().isIsomorphic("foo", "bar"));
        System.out.println(new IsIsomorphic().isIsomorphic("paper", "title"));
        System.out.println(new IsIsomorphic().isIsomorphic("badc", "baba"));
    }

    public boolean isIsomorphic(String s, String t) {
        boolean areEquals = true;

        Map<Character, Character> commonMap = new HashMap<>();
        Set<Character> set = new HashSet<>();

        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) {
            return false;
        }

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        for (int i = 0; i < sLen; i++) {

            char x = s_arr[i], y = t_arr[i];

            if (commonMap.containsKey(x)) {
                if (commonMap.get(x) != y) {
                    areEquals = false;
                    break;
                }
            } else {
                if (set.contains(y)) {
                    areEquals = false;
                    break;
                }
                commonMap.put(x, y);
                set.add(y);
            }
        }

        return  areEquals;
    }
}
