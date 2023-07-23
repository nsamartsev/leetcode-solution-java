package leetcode.easy.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {
    public static void main(String[] args) {
        System.out.println(new RansomNote_383().canConstruct("aa", "aab"));
        System.out.println(new RansomNote_383().canConstruct("a", "b"));
        System.out.println(new RansomNote_383().canConstruct("aa", "ab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;

        Map<Character, Integer> magazineMap = new HashMap<>();

        int magazine_len = magazine.length();
        int ransomNote_len = ransomNote.length();

        for (Character c: magazine.toCharArray()) {
            if (magazineMap.containsKey(c)) {
                int count = magazineMap.get(c).intValue();
                magazineMap.put(c, ++count);
            }
            else {
                magazineMap.put(c, 1);
            }
        }

        for (Character c: ransomNote.toCharArray()) {
            if (magazineMap.containsKey(c) && magazineMap.get(c) != 0) {
                int count = magazineMap.get(c).intValue();
                magazineMap.put(c, --count);
            } else {
                result = false;
                break;
            }

        }

        return result;

    }
}
