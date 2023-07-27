package leetcode.medium.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram_49 {
    public static void main(String[] args) {
        var solution = new Solution();
        String[] sa = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = solution.groupAnagrams(sa);
        System.out.println(lists);
    }

    static class Solution {

        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> result = new ArrayList<>();

            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] key = word.toCharArray();
                Arrays.sort(key);
                String keyStr = new String(key).intern();

                if (map.containsKey(keyStr)) {
                    map.get(keyStr).add(word);
                } else {
                    map.put(keyStr, new ArrayList<>(Collections.singleton(word)));
                }
            }

            for (var el : map.entrySet()) {
                result.add(el.getValue());
            }

            return result;
        }
    }
}
